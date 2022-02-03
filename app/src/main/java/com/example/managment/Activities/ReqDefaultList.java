package com.example.managment.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.managment.Adapters.Adapter_RV_ReqDefList;
import com.example.managment.Models.ReqDefaultModel;
import com.example.managment.R;

import java.util.ArrayList;

public class ReqDefaultList extends AppCompatActivity {
    private Adapter_RV_ReqDefList adapterRvReqDefList;
    private ArrayList<ReqDefaultModel> listData;
    private RecyclerView rv_ReqDefList;
    private TextView btn_AddReq;
    private ImageView img_Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_req_default_list);
        findViews();
        setListener();
        listData = new ArrayList<>();
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن لینوکس"));
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن ویندوز"));
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن کزوم"));
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن فایرفاکس"));
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن اندروید"));
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن لینوکس"));
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن ویندوز"));
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن کزوم"));
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن فایرفاکس"));
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن اندروید"));
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن لینوکس"));
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن ویندوز"));
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن کزوم"));
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن فایرفاکس"));
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن اندروید"));
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن لینوکس"));
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن ویندوز"));
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن کزوم"));
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن فایرفاکس"));
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن اندروید"));
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن لینوکس"));
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن ویندوز"));
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن کزوم"));
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن فایرفاکس"));
        listData.add(new ReqDefaultModel("مشکل بالا نیامدن اندروید"));


        adapterRvReqDefList = new Adapter_RV_ReqDefList(this, listData);
        rv_ReqDefList.setAdapter(adapterRvReqDefList);
        rv_ReqDefList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }

    private void setListener() {
        img_Back.setOnClickListener(v -> {
            finish();
        });
    }

    private void findViews() {
        rv_ReqDefList = findViewById(R.id.rv_ReqDefList);
        img_Back = findViewById(R.id.img_UserList_Back);
        btn_AddReq = findViewById(R.id.btn_AddReq_ReqDef);
    }
}