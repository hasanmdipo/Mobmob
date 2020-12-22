package com.example.submissiondicoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class KontakActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontak);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Tentang Pengembang");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}