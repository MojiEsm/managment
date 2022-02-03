package com.example.managment.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.managment.R;

public class MainActivity extends AppCompatActivity {
    private LinearLayout lnr_UserList, lnr_Request, lnr_UserRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListener();

    }

    private void setListener() {
        lnr_UserList.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, UserList.class));
        });

        lnr_Request.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, UserRequest.class));
        });

        lnr_UserRequest.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ReqDefaultList.class));
        });

    }

    private void findViews() {
        lnr_UserList = findViewById(R.id.lnr_Home_UserList);
        lnr_Request = findViewById(R.id.lnr_Home_Request);
        lnr_UserRequest = findViewById(R.id.lnr_Home_UserRequest);
    }
}