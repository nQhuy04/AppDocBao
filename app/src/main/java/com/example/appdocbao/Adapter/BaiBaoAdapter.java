package com.example.appdocbao.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdocbao.R;
import com.example.appdocbao.Utils;
import com.example.appdocbao.model.BaiBao;

import java.util.ArrayList;

public class BaiBaoAdapter extends RecyclerView.Adapter<BaiBaoAdapter.UserViewHolder>{
    ArrayList<BaiBao> lstBaiBao;
    Context context;
    UserCallBack userCallBack;
    public BaiBaoAdapter(ArrayList<BaiBao> lstBaiBao /*,UserCallBack userCallBack*/) {
        this.lstBaiBao = lstBaiBao;
        //this.userCallBack = userCallBack;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        //nap layout cho view bieu dien phan tu user
        View viewBaiBao = inflater.inflate(R.layout.items, parent,false);
        //
        UserViewHolder viewHolder = new UserViewHolder(viewBaiBao);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        //lay tung item cua du lieu
        BaiBao item = lstBaiBao.get(position);
        //gan vao item cua view
        holder.ivHinh.setImageBitmap(Utils.convertToBitmapFromAssets(context,item.getHinhbb()));
        holder.txtTenbb.setText(item.getTenbb());
        holder.txtNguonbb.setText(item.getNguonbb());
        holder.txtThoigiandang.setText(item.getThoigiandang());
        //lay su kien
        holder.itemView.setOnClickListener(view -> userCallBack.onItemClick(item.getId()));
    }

    @Override
    public int getItemCount() {
        return lstBaiBao.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder{
        ImageView ivHinh;
        TextView txtTenbb, txtNguonbb, txtThoigiandang;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            ivHinh =itemView.findViewById(R.id.ivHinh);
            txtTenbb = itemView.findViewById(R.id.txtTenbb);
            txtNguonbb = itemView.findViewById(R.id.txtNguonbb);
            txtThoigiandang = itemView.findViewById(R.id.txtThoigiandang);
        }
    }
    public interface UserCallBack{
        void onItemClick(String id);
    }
}
