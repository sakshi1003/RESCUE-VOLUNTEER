package com.example.location;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login_Page extends AppCompatActivity {
EditText memail,mpassword;
Button mloginbtn;
TextView createbtn,forgotTextlink;
ProgressBar progressBar;
FirebaseAuth fauth;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__page);
memail = findViewById(R.id.Emailid);
mpassword = findViewById(R.id.password);
progressBar=findViewById(R.id.loginprogressbar);
createbtn = findViewById(R.id.createaccounttext);
fauth = FirebaseAuth.getInstance();
forgotTextlink=findViewById(R.id.forgotpassword);
mloginbtn = findViewById(R.id.loginbutton);
mloginbtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String email = memail.getText().toString().trim();
        String password = mpassword.getText().toString().trim();
        if(TextUtils.isEmpty(email)){
            memail.setError("Email is required");
            return;
        }
        if(TextUtils.isEmpty(password)){
            mpassword.setError("Password is required");
            return;
        }
       progressBar.setVisibility(View.VISIBLE);
     fauth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
         @Override
         public void onComplete(@NonNull Task<AuthResult> task) {
             if(task.isSuccessful()){
                 Toast.makeText(Login_Page.this,"Logged in Successfully",Toast.LENGTH_SHORT).show();
                 startActivity(new Intent(getApplicationContext(),MapsActivity.class));
                 finish();
             }
             else{
                 Toast.makeText(Login_Page.this,"Error "+task.getException().getMessage(),Toast.LENGTH_SHORT).show();
 progressBar.setVisibility(View.GONE);
             }
         }
     });
    }
});

createbtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(getApplicationContext(),Registration_page.class));
    }
});
forgotTextlink.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        EditText resetmail= new EditText(v.getContext());
        AlertDialog.Builder passwordresetdialog = new AlertDialog.Builder(v.getContext());
        passwordresetdialog.setMessage("Enter your email to receive test link");
        passwordresetdialog.setView(resetmail);
        passwordresetdialog.setPositiveButton("Yes",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String mail = resetmail.getText().toString();
                fauth.sendPasswordResetEmail(mail).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(Login_Page.this,"Reset Link sent to your email",Toast.LENGTH_SHORT).show();

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Login_Page.this,"Error: Reset link is not sent"+e.getMessage(),Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });
        passwordresetdialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        passwordresetdialog.create().show();
    }
});
}
}