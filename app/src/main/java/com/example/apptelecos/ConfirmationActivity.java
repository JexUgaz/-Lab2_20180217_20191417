package com.example.apptelecos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apptelecos.databinding.ActivityConfirmationBinding;

public class ConfirmationActivity extends AppCompatActivity {
    ActivityConfirmationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityConfirmationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}