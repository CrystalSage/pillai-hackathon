package com.example.oldagemanagmentsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ForgotPassword extends AppCompatActivity {
    Button submitOTP;
    OtpEditText OTP;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_password);

        OTP = findViewById(R.id.et_otp);

        submitOTP = findViewById(R.id.submitotp);
        submitOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verifyOTP();
            }
        });
    }

    private void verifyOTP(){
        if (OTP.getText().toString().equals("1234")){
            startActivity(new Intent(getApplicationContext(), MainDasboard.class));
        }

    }
}
