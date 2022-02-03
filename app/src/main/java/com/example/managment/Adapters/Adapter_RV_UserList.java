package com.example.managment.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.managment.Models.UserListModel;
import com.example.managment.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class Adapter_RV_UserList extends RecyclerView.Adapter<Adapter_RV_UserList.MyViewHolder> {
    Context context;
    ArrayList<UserListModel> mdata;

    public Adapter_RV_UserList(Context context, ArrayList<UserListModel> mdata) {
        this.context = context;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_rv_userlist,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txt_UserName.setText(mdata.get(position).getUserName());
        holder.txt_PhoneNumber.setText(String.valueOf(mdata.get(position).getPhoneNumber()));
        holder.txt_Address.setText(mdata.get(position).getAddress());
        holder.txt_NoRequest.setText(String.valueOf(mdata.get(position).getNoRequest()));
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView txt_UserName , txt_PhoneNumber , txt_Address, txt_NoRequest;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_UserName = itemView.findViewById(R.id.txt_itemRVUserList_UsreName);
            txt_PhoneNumber = itemView.findViewById(R.id.txt_itemRVUserList_PhoneNumber);
            txt_Address = itemView.findViewById(R.id.txt_itemRVUserList_Address);
            txt_NoRequest = itemView.findViewById(R.id.txt_itemRVUserList_NoRequest);
        }
    }
}
