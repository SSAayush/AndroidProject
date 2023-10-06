package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    private Button btnSignUp;
    private EditText etUsername;
    private EditText etMobileNumber;
    private EditText etEmail;
    private EditText etPassword;
    private TextView tvSignup;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        initVars();

        tvSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });




    }

    private void initVars(){
        btnSignUp=findViewById(R.id.btnSignUp);
        etUsername=findViewById(R.id.etUsername);
        etMobileNumber=findViewById(R.id.etMobileNumber);
        etEmail=findViewById(R.id.etEmail);
        etPassword=findViewById(R.id.etPassword);
        tvSignup=findViewById(R.id.tvSignup);

    }
}