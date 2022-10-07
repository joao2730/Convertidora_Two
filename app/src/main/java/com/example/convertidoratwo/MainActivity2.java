package com.example.convertidoratwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.convertidoratwo.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();

        if (intent != null) {

            binding.name2.setText(intent.getStringExtra("name"));
            binding.lastName2.setText(intent.getStringExtra("lastName"));
            binding.email2.setText(intent.getStringExtra("correo"));
            binding.password2.setText(intent.getStringExtra("password"));
        }

    }

}