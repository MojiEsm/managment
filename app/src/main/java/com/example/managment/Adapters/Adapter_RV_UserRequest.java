package com.example.managment.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.managment.Models.UserRequestModel;
import com.example.managment.R;

import java.util.ArrayList;

public class Adapter_RV_UserRequest extends RecyclerView.Adapter<Adapter_RV_UserRequest.MyViewHolder> {
    Context context;
    ArrayList<UserRequestModel> mdata;

    public Adapter_RV_UserRequest(Context context, ArrayList<UserRequestModel> mdata) {
        this.context = context;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_rv_userrequest, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.txt_Address.setText(mdata.get(position).getAddress());
        holder.txt_name.setText(mdata.get(position).getName());
        holder.txt_Stats.setText(mdata.get(position).getStats());
        holder.txt_Call.setOnClickListener(view -> {
            Uri number = Uri.parse("tel:" + mdata.get(position).getPhoneNumber());
            Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
            context.startActivity(callIntent);
        });
        holder.txt_Message.setOnClickListener(v->{
                Uri number = Uri.parse("sms:"+ mdata.get(position).getPhoneNumber());
                Intent messageIntent = new Intent(Intent.ACTION_VIEW, number);
                context.startActivity(messageIntent);
        });
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView txt_name, txt_Stats, txt_Address , txt_Call , txt_Message;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_name = itemView.findViewById(R.id.txt_itemRVUserRequest_Name);
            txt_Stats = itemView.findViewById(R.id.txt_itemRVUserRequest_Stats);
            txt_Address = itemView.findViewById(R.id.txt_itemRVUserRequest_Address);
            txt_Call = itemView.findViewById(R.id.txt_UserReq_Call);
            txt_Message = itemView.findViewById(R.id.txt_UserReq_Message);
        }
    }
}
