package com.example.apptelecos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;

import com.example.apptelecos.databinding.ActivityConfirmationBinding;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class ConfirmationActivity extends AppCompatActivity {
    ActivityConfirmationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityConfirmationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();
        binding.btnBack2.setOnClickListener(view->{
            onBackPressed();
        });

        binding.btnSAsiento.setOnClickListener(view->{
            Boolean[] checkboxes= {binding.checkBox.isChecked(),binding.checkBox2.isChecked(),binding.checkBox3.isChecked()};
            Double[] costos={convertStringDouble(binding.tvcosto1),convertStringDouble(binding.tvcosto2),convertStringDouble(binding.tvcosto3)};
            int flag=0;
            int contador=0;
            Double total=0.0;
            for(Boolean check: checkboxes){
                if(check){
                    flag++;
                    total+=costos[contador];
                }
                contador++;
            }

            MaterialAlertDialogBuilder alert= new MaterialAlertDialogBuilder(ConfirmationActivity.this);
            alert.setTitle("Felicidades!!!")
                            .setMessage("Su compra de "+flag+" tickets con un valor total de S/"+total+" fue realizado con exito.")
                    .setPositiveButton("Entiendo", (dialog, which) -> {
                    })
                    .show();
        });
    }
    private Double convertStringDouble(TextView n){
        return Double.parseDouble(n.getText().toString().split(" ")[1]);
    }
}