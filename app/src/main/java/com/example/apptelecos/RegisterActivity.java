package com.example.apptelecos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Html;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

import com.example.apptelecos.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {
    ActivityRegisterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.textPolitica.setText(Html.fromHtml(getResources().getString(R.string.register_msg)));
        binding.textTerminos.setText(Html.fromHtml(getResources().getString(R.string.resgister_msg1)));

        binding.btnRegistrate.setBackgroundColor(getResources().getColor(R.color.disabled_btn));

        binding.btnRegistrate.setOnClickListener(view -> {
            finish();
        });
        habilitarBtn();

       binding.inputNumero.setOnKeyListener((view, i, keyEvent) -> {
            habilitarBtn();
            return false;
        });
        binding.inputContra.setOnKeyListener((view, i, keyEvent) -> {
            habilitarBtn();
            return false;
        });
        binding.inputCorreo.setOnKeyListener((view, i, keyEvent) -> {
            habilitarBtn();
            return false;
        });
        binding.inputNombre.setOnKeyListener((view, i, keyEvent) -> {
            habilitarBtn();
            return false;
        });
        binding.checkBox1.setOnClickListener(view -> {
            habilitarBtn();
        });
        binding.checkBox2.setOnClickListener(view -> {
            habilitarBtn();
        });
    }
   private void habilitarBtn(){
       if(!binding.inputNombre.getText().toString().isEmpty()&&!binding.inputContra.getText().toString().isEmpty()&&!binding.inputCorreo.getText().toString().isEmpty()
               &&!binding.inputNumero.getText().toString().isEmpty()&&binding.checkBox1.isChecked()&&binding.checkBox2.isChecked()){
           binding.btnRegistrate.setClickable(true);//Por defecto
           binding.btnRegistrate.setBackgroundColor(getResources().getColor(R.color.btn_verdeClaro));
       }else{
           binding.btnRegistrate.setClickable(false);//Por defecto
           binding.btnRegistrate.setBackgroundColor(getResources().getColor(R.color.disabled_btn));
       }
   }
}