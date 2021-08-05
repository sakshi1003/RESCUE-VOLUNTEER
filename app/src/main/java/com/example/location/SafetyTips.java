package com.example.location;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class SafetyTips extends AppCompatActivity implements View.OnClickListener {
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safetytips);
        Button turnado1 = findViewById (R.id.turnado);
        Button hurricane1 = findViewById (R.id.hurricane);
        Button thunderstorm1 = findViewById (R.id.thunderstorm);
        Button drought1 = findViewById (R.id.drought);
        Button winterstorm1 = findViewById (R.id.winterstorm);
        Button earthquake1 = findViewById (R.id.earthquake);
        Button flood1 = findViewById (R.id.flood);
        Button cyclone1 = findViewById (R.id.cyclone);
        Button tsunami1 = findViewById (R.id.tsunami);
        Button volcanoes1 = findViewById (R.id.volcanoes);
        Button corona1 = findViewById (R.id.corona);

        turnado1.setOnClickListener (this);
        hurricane1.setOnClickListener (this);
        thunderstorm1 .setOnClickListener (this);
        drought1.setOnClickListener (this);
        winterstorm1.setOnClickListener (this);
        earthquake1.setOnClickListener (this);
        flood1.setOnClickListener (this);
        cyclone1.setOnClickListener (this);
        tsunami1.setOnClickListener (this);
        volcanoes1.setOnClickListener (this);
        corona1.setOnClickListener (this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId ()){

            case R.id.turnado:
                Intent intent=new Intent ( com.example.location.SafetyTips.this, TurnadoTip.class);
                startActivity (intent);
                break;
            case R.id.hurricane:
                Intent intent1 =new Intent ( com.example.location.SafetyTips.this, HurricaneTip.class );
                startActivity (intent1);
                break;
            case R.id.thunderstorm:

                Intent intent2=new Intent ( com.example.location.SafetyTips.this, ThunderStorm.class);
                startActivity (intent2);
                break;
            case R.id.drought:
                Intent intent3=new Intent ( com.example.location.SafetyTips.this, DroughtTip.class );
                startActivity (intent3);

                break;
            case R.id.winterstorm:

                Intent intent4=new Intent ( com.example.location.SafetyTips.this, WinterStormTip.class );
                startActivity (intent4);

                break;
            case R.id.earthquake:


                Intent intent5=new Intent ( com.example.location.SafetyTips.this, EarthQuakeTip.class );
                startActivity (intent5);
                break;
            case R.id.flood:

                Intent intent6=new Intent ( com.example.location.SafetyTips.this, FloodTip.class );
                startActivity (intent6);

                break;
            case R.id.cyclone:

                Intent intent7=new Intent ( com.example.location.SafetyTips.this, CycloneTip.class );
                startActivity (intent7);
                break;
            case R.id.tsunami:

                Intent intent8=new Intent ( com.example.location.SafetyTips.this,TsunamiTip.class );
                startActivity (intent8);
                break;
            case R.id.volcanoes:

                Intent intent9=new Intent ( com.example.location.SafetyTips.this, Volcano.class );
                startActivity (intent9);
                break;
            case R.id.corona:
                Intent intent10=new Intent ( com.example.location.SafetyTips.this, CoronaTip.class );
                startActivity (intent10);
                break;
        }
    }
}