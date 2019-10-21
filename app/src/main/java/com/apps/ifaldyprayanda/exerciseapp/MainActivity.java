package com.apps.ifaldyprayanda.exerciseapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMenu;
    private ArrayList<MenuDiet> listMenu = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMenu = findViewById(R.id.rv_menu);
        rvMenu.setHasFixedSize(true);

        listMenu.addAll(MenuData.getListData());
        showRecyclerList();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu profile) {
        getMenuInflater().inflate(R.menu.item_menu, profile);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item_profile:
                showProfile();
                return true;
        }
        return true;
    }

    private void showRecyclerList(){
        rvMenu.setLayoutManager(new LinearLayoutManager(this));
        ListMenuAdapter listMenuAdapter = new ListMenuAdapter(listMenu);
        rvMenu.setAdapter(listMenuAdapter);

        listMenuAdapter.setOnItemCallback(new ListMenuAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(MenuDiet menuDiet) {
                showSelectedMenu(menuDiet);
            }
        });
    }

    public void showProfile()
    {
        Intent pIntent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(pIntent);
    }

    private void showSelectedMenu(MenuDiet menuDiet)
    {
        Toast.makeText(getApplicationContext(), "Detail menu from " + menuDiet.getMenuName(), Toast.LENGTH_SHORT).show();
        Intent dIntent = new Intent (MainActivity.this, DetailActivity.class);
        dIntent.putExtra("foto", menuDiet.getMenuPhoto());
        dIntent.putExtra("title", menuDiet.getMenuTitle());
        dIntent.putExtra("name", menuDiet.getMenuName());
        dIntent.putExtra("kalori", menuDiet.getMenuKal());
        dIntent.putExtra("desc", menuDiet.getMenuDesc());
        startActivity(dIntent);
    }

}
