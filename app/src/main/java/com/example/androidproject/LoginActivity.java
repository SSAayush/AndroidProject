package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView tvSignup;
    private Button btnLogin;
    private EditText etUsername;
    private EditText etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        intVars();

        tvSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }





    public void intVars(){
        tvSignup=findViewById(R.id.tvSignup);
        btnLogin=findViewById(R.id.btnLogin);
        etUsername=findViewById(R.id.etUsername);
        etPassword=findViewById(R.id.etPassword);
    }
    
}