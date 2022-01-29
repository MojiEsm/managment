package com.example.managment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.managment.Activities.ReqDefaultList;
import com.example.managment.Activities.UserList;

public class MainActivity extends AppCompatActivity {
    LinearLayout lnr_UserList,lnr_Request;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListener();

    }

    private void setListener() {
        lnr_UserList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, UserList.class));
            }
        });

        lnr_Request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ReqDefaultList.class));
            }
        });
    }

    private void findViews() {
        lnr_UserList = findViewById(R.id.lnr_Home_UserList);
        lnr_Request = findViewById(R.id.lnr_Home_Request);
    }
}