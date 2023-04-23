package com.example.apptelecos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.apptelecos.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {
    ActivityDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        binding.btnComprar.setOnClickListener(view->{
            Intent in= new Intent(DetailActivity.this,ConfirmationActivity.class);
        });
    }
}