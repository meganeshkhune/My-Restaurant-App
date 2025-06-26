package com.example.myapplication.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.myapplication.R;
import com.example.myapplication.adapters.DetailedDailyAdapter;
import com.example.myapplication.modeis.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_img);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);


        if (type != null && type.equalsIgnoreCase("breakfast")){

            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav1,"Breakfast","description","4.4","40","10am to 2pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav2,"Breakfast","description","4.4","40","10am to 2pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav3,"Breakfast","description","4.4","40","10am to 2pm"));
            dailyAdapter.notifyDataSetChanged();

        }
        if (type != null && type.equalsIgnoreCase("Sweets")){

            imageView.setImageResource(R.drawable.sweets);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s1,"Sweet","description","4.4","40","10am to 2pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s2,"Sweet","description","4.4","40","10am to 2pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s3,"Sweet","description","4.4","40","10am to 2pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s4,"Sweet","description","4.4","40","10am to 2pm"));
            dailyAdapter.notifyDataSetChanged();

        }





    }
}