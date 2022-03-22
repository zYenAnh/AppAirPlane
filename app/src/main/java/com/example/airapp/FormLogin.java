package com.example.airapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormLogin extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);
        Button signInBtn = (Button)findViewById(R.id.btn_Login);
        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(FormLogin.this,home_airapp.class);
//                EditText userNameEditText = (EditText)findViewById(R.id.inputUserName);
//                EditText passWordEditText = (EditText)findViewById(R.id.inputPassword);
//                i.putExtra("userName",userNameEditText.getText().toString());
//                i.putExtra("password",passWordEditText.getText().toString());
                startActivity(i);
            }
        });

        TextView createAccountTextView = (TextView)findViewById(R.id.createAccount_FormLogin);
        createAccountTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent createAccountIntent = new Intent(FormLogin.this,activity_createAccount.class);
                startActivity(createAccountIntent);
            }
        });
    }

}