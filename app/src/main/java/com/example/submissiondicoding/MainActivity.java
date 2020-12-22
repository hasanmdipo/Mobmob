package com.example.submissiondicoding;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCars;
    private ArrayList<Cars> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCars = findViewById(R.id.rv_cars);
        rvCars.setHasFixedSize(true);

        list.addAll(CarsData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView() {
        rvCars.setLayoutManager(new LinearLayoutManager(this));
        CardViewCarsAdapter cardViewCarsAdapter = new CardViewCarsAdapter(list);
        rvCars.setAdapter(cardViewCarsAdapter);

        cardViewCarsAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(Cars makanan) {
                Intent moveIntent1 = new Intent(MainActivity.this, DetailMobilActivity.class);
                moveIntent1.putExtra(DetailMobilActivity.ITEM_EXTRA, makanan);
                startActivity(moveIntent1);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.kontak_id) {
            Intent moveIntent = new Intent(MainActivity.this, KontakActivity.class);
            startActivity(moveIntent);
        }
        return super.onOptionsItemSelected(item);
    }
}