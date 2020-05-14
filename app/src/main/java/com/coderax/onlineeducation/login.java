package com.coderax.onlineeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {

    TextView textViewlogin;
    EditText editTextUsername, editTextPassword;
    Button buttonLogin;
    TextView textViewforgot;
    View parentLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        editTextUsername = findViewById(R.id.editText);
        editTextPassword = findViewById(R.id.editText2);
        buttonLogin = findViewById(R.id.button2);
        textViewforgot = findViewById(R.id.textView3);
        parentLayout = findViewById(android.R.id.content);
        textViewlogin=findViewById(R.id.textView2);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(TextUtils.isEmpty(editTextUsername.getText())){
//                    Snackbar.make(parentLayout, "Please Enter Username or Email", Snackbar.LENGTH_LONG).show();
//                }
//                else if(TextUtils.isEmpty(editTextPassword.getText())){
//                    Snackbar.make(parentLayout, "Please Enter Password", Snackbar.LENGTH_LONG).show();
//                }
//                else {
//                    startActivity(new Intent(Login.this, Home.class));
//                }
                startActivity(new Intent(login.this, drawerActivity.class));
            }
        });

//        textViewforgot.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(login.this, MainActivity.class));
//            }
//        });
    }
}
