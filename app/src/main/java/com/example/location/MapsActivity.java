package com.example.location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.location.fragments.Emergency;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.navigation.NavigationView;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.util.HashMap;
import java.util.Map;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;
    private GoogleMap mMap;
    private LocationManager locationManager;
    private LocationListener locationListener;
    private final long MIN_TIME = 1000;
    private final long MIN_DIST = 5;
    private LatLng latLng,latlng;
    private LocationListener locationlistener;
    FirebaseAuth fauth;
    FirebaseAuth.AuthStateListener firebaseAuthListener;
FirebaseFirestore fstore;
String userID;
Toolbar toolbar;
String email,fname,phone,latitude,longitude;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        Button Emergency = findViewById(R.id.Emergency);
        Button RescueVolunteer = findViewById(R.id.rescue_volunteer);
        Button safetytips = findViewById(R.id.Safety_tips);
        Button Weatherreport = findViewById(R.id.weatherforecasting);
        Button Rescuevolunteer = findViewById(R.id.rescue_volunteer);
        Button Donation = findViewById(R.id.donation);
        fauth = FirebaseAuth.getInstance();
        setUpToolbar();
        navigationView = (NavigationView) findViewById(R.id.navigation_menu);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
//
//                    }
                    //       break;
                    case  R.id.nav_share: {

                        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                        sharingIntent.setType("text/plain");
                        String shareBody = "http://play.google.com/store/apps/detail?id=" + getPackageName();
                        String shareSub = "Try now";
                        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
                        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                        startActivity(Intent.createChooser(sharingIntent, "Share using"));

                    }
                    break;
                    case  R.id.Privacypolicy: {

                        Intent intent = new Intent(MapsActivity.this, PrivacyPolicy.class);
                        startActivity(intent);
                    }
                        break;
                    case R.id.nav_logout: {
                        FirebaseAuth.getInstance().signOut();
                        startActivity(new Intent(getApplicationContext(), Login_Page.class));
                    }
//                        startActivity(intent1 );
                        break;
                }
                return false;
            }
        });
        firebaseAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

            }
        };
        fstore = FirebaseFirestore.getInstance();
        userID = fauth.getCurrentUser().getUid();
        DocumentReference documentReference = fstore.collection("users").document(userID);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                fname = value.getString("fullname");
                email = value.getString("email");
                phone = value.getString("phone");
                Log.d("TAG", "Full Name: " + fname + "email " + email + "phone " + phone);
            }
        });
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS}, PackageManager.PERMISSION_GRANTED);
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, PackageManager.PERMISSION_GRANTED);
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.INTERNET}, PackageManager.PERMISSION_GRANTED);

        Emergency.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Log.d("TAG", "Emergency button gets clicked");
                locationlistener = new LocationListener() {
                    @Override
                    public void onLocationChanged(@NonNull Location location) {
                        latlng = new LatLng(location.getLatitude(), location.getLongitude());
                        String myLatitude = String.valueOf(location.getLatitude());
                        String myLongitude = String.valueOf(location.getLongitude());
                        String message = "Latitude: " + myLatitude + "Longitude: " + myLongitude;
                        userID = fauth.getCurrentUser().getUid();

                        DocumentReference documentReference = fstore.collection("users").document(userID);
                        Map<String, Object> user = new HashMap<>();
                        user.put("message", message);
                        documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Log.d("TAG", "Location gets added");
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.d("TAG", "Error: " + e.toString());
                            }
                        });
                    }
                };

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Emergency()).commit();
                Toast.makeText(MapsActivity.this, "Your location sends to authority.", Toast.LENGTH_SHORT).show();
                Emergency.setText("Location Sent");
            }
        });
        RescueVolunteer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", "Rescue Volunteer gets tapped");
                if (RescueVolunteer.getText() == "Pending Request...") {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MapsActivity.this);
                    builder.setMessage("Do you not want to add as rescue volunteer:").
                            setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            RescueVolunteer.setText("Add as Rescue Volunteer");
                                            userID = fauth.getCurrentUser().getUid();
                                            DocumentReference documentReference = fstore.collection("RescueVolunteer").document(userID);
                                            documentReference.delete();
                                        }
                                    }
                            )
                            .setNegativeButton("No", null);
                    AlertDialog alert = builder.create();
                    alert.show();
                } else {
                    userID = fauth.getCurrentUser().getUid();
                    DocumentReference documentReference = fstore.collection("RescueVolunteer").document(userID);
                    Map<String, Object> user = new HashMap<>();
                    user.put("fullname", fname);
                    user.put("email", email);
                    user.put("phone", phone);
                    documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Log.d("TAG", "Success: User Profile is created for " + userID);
                            Toast.makeText(MapsActivity.this, "Request is sent ... authority will contact you soon", Toast.LENGTH_SHORT).show();
                            RescueVolunteer.setText("Pending Request...");
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.d("TAG", "On failure:" + e.toString());
                        }
                    });

                }
            }
        });
        safetytips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MapsActivity.this, SafetyTips.class);
                startActivity(intent);
            }
        });
        Donation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(), Login_Page.class));
            }
        });
        Weatherreport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MapsActivity.this, weather_report.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in Sydney and move the came
        locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(@NonNull Location location) {
                try {
                    latLng = new LatLng(location.getLatitude(), location.getLongitude());
                    mMap.addMarker(new MarkerOptions().position(latLng).title("My Position"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onProviderEnabled(@NonNull String provider) {

            }

            @Override
            public void onProviderDisabled(@NonNull String provider) {

            }
        };
        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        try {
            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, MIN_TIME, MIN_DIST, locationListener);
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, MIN_TIME, MIN_DIST, locationListener);
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    public void setUpToolbar() {
        drawerLayout = findViewById(R.id.drawerLayout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.black));
        actionBarDrawerToggle.syncState();
    }

}



