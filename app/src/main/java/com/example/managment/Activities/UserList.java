package com.example.managment.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.managment.Adapters.Adapter_RV_UserList;
import com.example.managment.Models.UserListModel;
import com.example.managment.R;

import java.util.ArrayList;

public class UserList extends AppCompatActivity {
    private ImageView img_Back;
    private Adapter_RV_UserList adapterUserList;
    private RecyclerView rv_UserList;
    private ArrayList<UserListModel> listData;
    private TextView btn_AddUsre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);
        findViews();
        setListener();

        listData = new ArrayList<>();
        listData.add(new UserListModel("مجتبی اسماعیلی", "قم،میدان توحید،کوچه6", "09397599533", 10));
        listData.add(new UserListModel("مجتبی اسماعیلی", "قم،میدان توحید،کوچه6", "09397599533", 10));
        listData.add(new UserListModel("مجتبی اسماعیلی", "قم،میدان توحید،کوچه6", "09397599533", 10));
        listData.add(new UserListModel("مجتبی اسماعیلی", "قم،میدان توحید،کوچه6", "09397599533", 10));
        listData.add(new UserListModel("مجتبی اسماعیلی", "قم،میدان توحید،کوچه6", "09397599533", 10));
        listData.add(new UserListModel("مجتبی اسماعیلی", "قم،میدان توحید،کوچه6", "09397599533", 10));
        listData.add(new UserListModel("مجتبی اسماعیلی", "قم،میدان توحید،کوچه6", "09397599533", 10));
        listData.add(new UserListModel("مجتبی اسماعیلی", "قم،میدان توحید،کوچه6", "09397599533", 10));

        adapterUserList = new Adapter_RV_UserList(this, listData);
        rv_UserList.setAdapter(adapterUserList);
        rv_UserList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

    }

    private void setListener() {
        img_Back.setOnClickListener(v -> {
            finish();
        });
    }

    private void findViews() {
        rv_UserList = findViewById(R.id.rv_UserList);
        btn_AddUsre = findViewById(R.id.btn_AddUser_UserList);
        img_Back = findViewById(R.id.img_UserList_Back);
    }
}