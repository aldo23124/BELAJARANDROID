package com.dicoding.www.belajarandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoginFacebookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_facebook);
        getSupportActionBar().hide();
    }
}
