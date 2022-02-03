package com.example.managment.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.managment.Models.ReqDefaultModel;
import com.example.managment.R;

import java.util.ArrayList;

public class Adapter_RV_ReqDefList extends RecyclerView.Adapter<Adapter_RV_ReqDefList.MyViewHolder> {
    Context context;
    ArrayList<ReqDefaultModel> mdata;

    public Adapter_RV_ReqDefList(Context context, ArrayList<ReqDefaultModel> mdata) {
        this.context = context;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_rv_reqdefault_list, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txt_NO.setText(position + 1 + " - ");
        holder.txt_Subject.setText(mdata.get(position).getSubject());
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txt_NO, txt_Subject;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_NO = itemView.findViewById(R.id.txt_itemRVReqDefList_No);
            txt_Subject = itemView.findViewById(R.id.txt_itemRVReqDefList_Subject);
        }
    }
}
