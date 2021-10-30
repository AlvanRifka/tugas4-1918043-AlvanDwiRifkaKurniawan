package com.example.tugas4_1918043_alvandwirifkakurniawan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =
                (RecyclerView)findViewById(R.id.recycleview);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Kenu Wick", "Cepat bayar hutang .. ", R.drawable.foto1));
        mahasiswaArrayList.add(new Mahasiswa("Felix", "Main bro ?", R.drawable.foto2));
        mahasiswaArrayList.add(new Mahasiswa("Ole", "Bagi taktik dong ", R.drawable.foto3));
        mahasiswaArrayList.add(new Mahasiswa("Ratu", "y", R.drawable.foto4));
        mahasiswaArrayList.add(new Mahasiswa("Jim", "Lu udah liat itu film ?", R.drawable.foto5));
        mahasiswaArrayList.add(new Mahasiswa("Peter Parker", "ok", R.drawable.foto6));
    }
}
