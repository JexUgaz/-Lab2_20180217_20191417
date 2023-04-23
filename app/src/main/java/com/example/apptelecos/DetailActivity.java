package com.example.apptelecos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.apptelecos.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {
    ActivityDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        binding.btnComprar.setOnClickListener(view->{
            Intent in= new Intent(DetailActivity.this,ConfirmationActivity.class);
            startActivity(in);
        });
        binding.btnBack.setOnClickListener(view->{
           onBackPressed();
        });
    }
}