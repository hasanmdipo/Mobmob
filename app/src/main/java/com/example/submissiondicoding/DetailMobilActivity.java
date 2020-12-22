package com.example.submissiondicoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailMobilActivity extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";
    private static final String TAG = "tag" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_mobil);
        ImageView detailPhoto = findViewById(R.id.detail_photo);
        TextView detailName = findViewById(R.id.detail_name);
        TextView detailDesc = findViewById(R.id.detail_decs);
        TextView detailPrice = findViewById(R.id.detail_price);

        Cars cars = getIntent().getParcelableExtra(ITEM_EXTRA);
        Log.d(TAG, "onCreate: " + cars);

        if (cars != null) {
            Glide.with(this)
                    .load(cars.getPhoto())
                    .into(detailPhoto);
            detailName.setText(cars.getName());
            detailDesc.setText(cars.getDetail());
            detailPrice.setText(cars.getPrice());
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Mobil");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}