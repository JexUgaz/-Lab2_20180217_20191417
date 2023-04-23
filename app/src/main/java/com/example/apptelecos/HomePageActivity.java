package com.example.apptelecos;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.ImageView;

import com.example.apptelecos.databinding.ActivityHomePageBinding;

public class HomePageActivity extends AppCompatActivity {
    ActivityHomePageBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityHomePageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        LayoutInflater inflater=(LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ImageView imageView = new ImageView(getSupportActionBar().getThemedContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.baseline_search_24);
        ActionBar.LayoutParams params= new ActionBar.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.WRAP_CONTENT, Gravity.RIGHT
                | Gravity.CENTER_VERTICAL);
        params.rightMargin = 40;
        imageView.setLayoutParams(params);

        getSupportActionBar().setCustomView(imageView);
        binding.imagebtn1.setOnClickListener(view->{
            Intent in= new Intent(HomePageActivity.this,DetailActivity.class);
            startActivity(in);
        });
        binding.imageBtn2.setOnClickListener(view->{
            Intent in= new Intent(HomePageActivity.this,DetailActivity.class);
            startActivity(in);
        });
        //getSupportActionBar().setTitle(Html.fromHtml("<font color=\"black\">" + "Bienvenido Teleco" + "</font>"));

    }
}