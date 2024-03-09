package com.example.appdocbao.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.appdocbao.Adapter.BaiBaoAdapter;
import com.example.appdocbao.R;
import com.example.appdocbao.model.BaiBao;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    Button btnSearching;
    RecyclerView recyclerViewBaiBao;

    ArrayList<BaiBao> lstBaiBao;
    BaiBaoAdapter baiBaoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recyclerViewBaiBao = findViewById(R.id.recyclerViewBaibao);
        //btnSearching = findViewById(R.id.btnSearching);
        loadData();
        baiBaoAdapter = new BaiBaoAdapter(lstBaiBao);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerViewBaiBao.setAdapter(baiBaoAdapter);
        recyclerViewBaiBao.setLayoutManager(linearLayoutManager);

        //btnSearching.setOnClickListener(BamVaoSearch());
    }




    /* @NonNull
    private  View.OnClickListener BamVaoSearch() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, SearchActivity.class);
                startActivity(i);
            }
        };
    } */


    private void loadData() {
        lstBaiBao = new ArrayList<>();
        lstBaiBao.add(new BaiBao("0", "tin hot", "ngay  hom qua", "fdjikv" , "img_new1.jpg"));
        lstBaiBao.add(new BaiBao("0","tin hot", "ngay  hom qua", "fdjikv" , "img_new2.jpg"));
        lstBaiBao.add(new BaiBao("0","tin hot", "ngay  hom qua", "fdjikv" , "img_new3.jpg"));
        lstBaiBao.add(new BaiBao("0","tin hot", "ngay  hom qua", "fdjikv" , "img_new4.jpg"));
        lstBaiBao.add(new BaiBao("0","tin hot", "ngay  hom qua", "fdjikv" , "img_new5.jpg"));
        lstBaiBao.add(new BaiBao("0","tin hot", "ngay  hom qua", "fdjikv" , "img_new6.jpg"));
        lstBaiBao.add(new BaiBao("0","tin hot", "ngay  hom qua", "fdjikv" , "img_new7.jpg"));
        lstBaiBao.add(new BaiBao("0","tin hot", "ngay  hom qua", "fdjikv" , "img_new8.jpg"));
        lstBaiBao.add(new BaiBao("0","tin hot", "ngay  hom qua", "fdjikv" , "img_new9.jpg"));
        lstBaiBao.add(new BaiBao("0","tin hot", "ngay  hom qua", "fdjikv" , "img_new10.jpg"));
        lstBaiBao.add(new BaiBao("0","tin hot", "ngay  hom qua", "fdjikv" , "img_new11.jpg"));
        lstBaiBao.add(new BaiBao("0","tin hot", "ngay  hom qua", "fdjikv" , "img_new12.jpg"));
        lstBaiBao.add(new BaiBao("0","tin hot", "ngay  hom qua", "fdjikv" , "img_new13.jpg"));
        lstBaiBao.add(new BaiBao("0","tin hot", "ngay  hom qua", "fdjikv" , "img_new14.jpg"));
        lstBaiBao.add(new BaiBao("0","tin hot", "ngay  hom qua", "fdjikv" , "img_new15.jpg"));
        lstBaiBao.add(new BaiBao("0","tin hot", "ngay  hom qua", "fdjikv" , "img_new16.jpg"));
        lstBaiBao.add(new BaiBao("0","tin hot", "ngay  hom qua", "fdjikv" , "img_new17.jpg"));
        lstBaiBao.add(new BaiBao("0","tin hot", "ngay  hom qua", "fdjikv" , "img_new18.jpg"));
    }


}