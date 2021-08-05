package com.example.location;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.hbb20.CountryCodePicker;

import java.util.concurrent.TimeUnit;

public class OTPScreen extends AppCompatActivity {
    private CountryCodePicker ccp;
    private EditText phoneText;
    private  EditText codeText;
    private Button continueAndNextBtn;
    private  String checker="",phoneNumber="";
    private RelativeLayout relativeLayout;

    private PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks;
    private FirebaseAuth mAuth;
    private String mVerificationId;
    private PhoneAuthProvider.ForceResendingToken mResendToken;
    private ProgressDialog loadingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_t_p_screen);
        mAuth=FirebaseAuth.getInstance ();
        loadingBar=new ProgressDialog (this);

        phoneText=findViewById (R.id.phoneText);
        codeText=findViewById (R.id.codeText);
        continueAndNextBtn=findViewById (R.id.continueNextButton);
        relativeLayout=findViewById (R.id.phoneAuth);
        ccp =(CountryCodePicker) findViewById (R.id.ccp);
        ccp.registerCarrierNumberEditText (phoneText);
        if(mAuth.getCurrentUser()!=null){
            startActivity(new Intent(getApplicationContext(),Registration_page.class));
            finish();
        }
        continueAndNextBtn.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                if(continueAndNextBtn.getText ().equals ("Submit")|| checker.equals ("Code Sent")){

                    String verificationCode=codeText.getText ().toString ();
                    if(verificationCode.equals ("")){
                        Toast.makeText (OTPScreen.this,"please write veification code first",Toast.LENGTH_SHORT).show ();
                    }
                    else{
                        loadingBar.setTitle ("Code Verification");
                        loadingBar.setMessage("Please wait, while we are verifying your phone number.");
                        loadingBar.setCanceledOnTouchOutside (false);
                        loadingBar.show ();
                        PhoneAuthCredential credential=PhoneAuthProvider.getCredential (mVerificationId,verificationCode);
                        signInWithPhoneAuthCredential (credential);
                    }


                }else {
                    phoneNumber=ccp.getFullNumberWithPlus ();
                    if(!phoneNumber.equals ("")){
                        loadingBar.setTitle ("Phone Number Verification");
                        loadingBar.setMessage("Please wait, while we are verifying your phone number.");
                        loadingBar.setCanceledOnTouchOutside (false);
                        loadingBar.show ();
                        PhoneAuthProvider.getInstance ().verifyPhoneNumber (phoneNumber,60, TimeUnit.SECONDS,OTPScreen.this,mCallbacks);

                    }else {
                        Toast.makeText (OTPScreen.this,"Please write valid phone number",Toast.LENGTH_SHORT).show ();
                    }
                }

            }
        });
        mCallbacks=new PhoneAuthProvider.OnVerificationStateChangedCallbacks ( ) {
            @Override
            public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
                signInWithPhoneAuthCredential (phoneAuthCredential);
            }

            @Override
            public void onVerificationFailed(FirebaseException e) {
                Toast.makeText (OTPScreen.this,"Invalid Phone  Number",Toast.LENGTH_SHORT).show ();
                loadingBar.dismiss ();
                relativeLayout.setVisibility (View.VISIBLE);

                continueAndNextBtn.setText ("Continue");
                codeText.setVisibility (View.GONE);
            }

            @Override
            public void onCodeSent(String s, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                super.onCodeSent (s, forceResendingToken);
                mVerificationId=s;
                mResendToken=forceResendingToken;
                relativeLayout.setVisibility (View.GONE);
                checker="Code Sent";
                continueAndNextBtn.setText ("Submit");
                codeText.setVisibility (View.VISIBLE);
                loadingBar.dismiss ();
                Toast.makeText (OTPScreen.this,"Code has been sent,please check.",Toast.LENGTH_SHORT).show ();

            }
        };
    }

    private void signInWithPhoneAuthCredential(PhoneAuthCredential credential) {
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            loadingBar.dismiss ();
                            Toast.makeText (OTPScreen.this,"Congratulations, you are logged in successfully",Toast.LENGTH_SHORT).show ();
                           sendUserToMainActivity ();
                          //  startActivity(new Intent(getApplicationContext(),Registration_page.class));
                            // Sign in success, update UI with the signed-in user's information
                           /* Log.d(TAG, "signInWithCredential:success");

                            FirebaseUser user = task.getResult().getUser();*/
                            // ...
                        } else {
                            loadingBar.dismiss ();
                            String e=task.getException ().toString ();
                            Toast.makeText (OTPScreen.this,"Error:"+e,Toast.LENGTH_SHORT).show ();
                            // Sign in failed, display a message and update the UI
                           /* Log.w(TAG, "signInWithCredential:failure", task.getException());
                            if (task.getException() instanceof FirebaseAuthInvalidCredentialsException) {
                                // The verification code entered was invalid
                            }*/
                        }
                    }
                });
    }
    private void sendUserToMainActivity(){
        Intent intent=new Intent(OTPScreen.this,Registration_page.class);
        startActivity (intent);
        finish ();
    }
}