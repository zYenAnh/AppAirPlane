package com.example.airapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.CheckBox;
import android.widget.TextView;

public class activity_createAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        CheckBox textViewPolicy = (CheckBox)findViewById(R.id.checkBoxPolicy);
        TextView textLoginNow = (TextView)findViewById(R.id.loginNow);
        renderTextPolicy(textViewPolicy);
        renderTextLoginNow(textLoginNow);
    }

    public void renderTextPolicy(CheckBox x) {
        String htmlsPolicy = "I have read and i do accept <a href=\"https://www.facebook.com/kimsohyun1706/\">privacy policy</a>";
        x.setText(Html.fromHtml(htmlsPolicy));
    }

    public void renderTextLoginNow(TextView x) {
        String htmlsAlready = "Already have an account? <a href =\"https://www.facebook.com/kimsohyun1706/\">login now</a>";
        x.setText(Html.fromHtml(htmlsAlready));
    }
}