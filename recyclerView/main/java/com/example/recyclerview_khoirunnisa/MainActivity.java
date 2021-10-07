package com.example.recyclerview_khoirunnisa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView; //inisialisasi recyclerView
    LinearLayoutManager layoutManager; //inisialisasi layoutManager
    List<ModelClass>userList; //buat list yang berasal dari inputan user
    Adapter adapter; //membuat adapter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();

    }

    //tambahkan data yang dibutuhkan untuk ditampilkan
    private void initData() {
        userList = new ArrayList<>();
        userList.add(new ModelClass(R.drawable.gi, "Sayfa",  "Can you help me?", "11:43 Am","_________________________"));
        userList.add(new ModelClass(R.drawable.bo, "Kevin",  "Have you done?","10:21 Am", "_________________________"));
        userList.add(new ModelClass(R.drawable.girl, "Vashka", "Hi! I want to share it!", "08:09 Am", "_________________________"));
        userList.add(new ModelClass(R.drawable.boy, "Taran", "Okay bro", "01:55 Pm", "_________________________"));
        userList.add(new ModelClass(R.drawable.girls, "Sara", "I'll wait", "02:49 Pm", "_________________________"));
        userList.add(new ModelClass(R.drawable.boyi, "Vandz", "Nice, really!!", "09:55 Am", "_________________________"));
        userList.add(new ModelClass(R.drawable.boyis, "Jourze", "Want you perform..", "08:19 Am", "_________________________"));

    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView); //menghubungkan dengan id recyclerview yang ada di R.id
        layoutManager = new LinearLayoutManager(this); //membuat layout baru dengan linear
        layoutManager.setOrientation(RecyclerView.VERTICAL); // orientasi vertical
        recyclerView.setLayoutManager(layoutManager); //set layout
        adapter = new Adapter(userList); //membuat adapter baru yang berasal dari userList
        recyclerView.setAdapter(adapter); // set adapter
        adapter.notifyDataSetChanged();
    }
}