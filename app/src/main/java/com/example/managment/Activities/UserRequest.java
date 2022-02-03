package com.example.managment.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.managment.Adapters.Adapter_RV_UserRequest;
import com.example.managment.Models.UserRequestModel;
import com.example.managment.R;

import java.util.ArrayList;

public class UserRequest extends AppCompatActivity {
    private Adapter_RV_UserRequest adapterRvUserRequest;
    private ArrayList<UserRequestModel> listData;
    private RecyclerView rv_UserRequest;
    private ImageView img_Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_request);
        findViews();
        setListener();

        listData = new ArrayList<>();
        listData.add(new UserRequestModel("محمد خواستار", "درحال بررسی", "قم،آزادگان،خیابان نواب،کوچه 16", "09397599533"));
        listData.add(new UserRequestModel("محمد خواستار", "درحال بررسی", "قم،آزادگان،خیابان نواب،کوچه 16", "09397599533"));
        listData.add(new UserRequestModel("محمد خواستار", "درحال بررسی", "قم،آزادگان،خیابان نواب،کوچه 16", "09397599533"));
        listData.add(new UserRequestModel("محمد خواستار", "درحال بررسی", "قم،آزادگان،خیابان نواب،کوچه 16", "09397599533"));
        listData.add(new UserRequestModel("محمد خواستار", "درحال بررسی", "قم،آزادگان،خیابان نواب،کوچه 16", "09397599533"));
        listData.add(new UserRequestModel("محمد خواستار", "درحال بررسی", "قم،آزادگان،خیابان نواب،کوچه 16", "09397599533"));
        listData.add(new UserRequestModel("محمد خواستار", "درحال بررسی", "قم،آزادگان،خیابان نواب،کوچه 16", "09397599533"));
        listData.add(new UserRequestModel("محمد خواستار", "درحال بررسی", "قم،آزادگان،خیابان نواب،کوچه 16", "09397599533"));
        listData.add(new UserRequestModel("محمد خواستار", "درحال بررسی", "قم،آزادگان،خیابان نواب،کوچه 16", "09397599533"));
        listData.add(new UserRequestModel("محمد خواستار", "درحال بررسی", "قم،آزادگان،خیابان نواب،کوچه 16", "09397599533"));
        listData.add(new UserRequestModel("محمد خواستار", "درحال بررسی", "قم،آزادگان،خیابان نواب،کوچه 16", "09397599533"));
        adapterRvUserRequest = new Adapter_RV_UserRequest(this, listData);
        rv_UserRequest.setAdapter(adapterRvUserRequest);
        rv_UserRequest.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }

    private void setListener() {
        img_Back.setOnClickListener(v -> {
            finish();
        });
    }

    private void findViews() {
        img_Back = findViewById(R.id.img_UserRequest_Back);
        rv_UserRequest = findViewById(R.id.rv_UserRequest);
    }
}