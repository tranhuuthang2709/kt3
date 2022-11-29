package com.example.kt3;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvNgonngu;
    ArrayList<Ngonngu> arrayNgonngu;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        adapter=new Adapter(this, R.layout.dong_ngon_ngu,arrayNgonngu);

        lvNgonngu.setAdapter(adapter);

        lvNgonngu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, Detail.class);
                startActivity(intent);
            }
        });
    }

    private void AnhXa() {
        lvNgonngu=(ListView) findViewById(R.id.listview);
        arrayNgonngu=new ArrayList<>();

        arrayNgonngu.add(new Ngonngu("Nước Việt Nam", R.drawable.vietnam));
        arrayNgonngu.add(new Ngonngu("Nước Nga",R.drawable.nga));
        arrayNgonngu.add(new Ngonngu("Nước Anh",R.drawable.anh));
        arrayNgonngu.add(new Ngonngu("Nước Pháp",R.drawable.phap));
        arrayNgonngu.add(new Ngonngu("Nước Mexico",R.drawable.mexico));

    }
}