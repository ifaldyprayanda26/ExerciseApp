package com.apps.ifaldyprayanda.exerciseapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    TextView titleTeks, nameTeks, kalTeks, descTeks;
    ImageView img;
//    private ArrayList<MenuDiet> listMenu = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        img = findViewById(R.id.imageDetail);
        titleTeks = findViewById(R.id.titleName);
        nameTeks = findViewById(R.id.menuName);
        kalTeks = findViewById(R.id.menuKal);
        descTeks = findViewById(R.id.menuDesc);

//        listMenu.addAll(MenuData.getListData());
//
        int image = getIntent().getIntExtra("foto", 0);
        String title = getIntent().getStringExtra("title");
        String name = getIntent().getStringExtra("name");
        String kal = getIntent().getStringExtra("kalori");
        String desc = getIntent().getStringExtra("desc");
//
        Glide.with(getApplicationContext())
                .load(image)
//                .apply(new RequestOptions().override(250, 250))
                .into(img);
//        img.setImageResource(image);
        titleTeks.setText(title);
        nameTeks.setText(name);
        kalTeks.setText(kal);
        descTeks.setText(desc);
    }
}
