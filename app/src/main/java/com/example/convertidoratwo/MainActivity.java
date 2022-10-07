package com.example.convertidoratwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.convertidoratwo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //1 primer paso busco por Binding
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2 segundo paso agrego el binding e inflo el layout
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = mBinding.name.getText().toString();
                String lastName = mBinding.lastName.getText().toString();
                String correo = mBinding.email.getText().toString();
                String password = mBinding.password.getText().toString();

                passSecond(name, lastName, correo, password);
            }
        });

    }

    private void passSecond (String name, String lastName, String email, String password){

        Intent passSecond = new Intent(MainActivity.this, MainActivity2.class);
        passSecond.putExtra("name", name);
        passSecond.putExtra("lastName", lastName);
        passSecond.putExtra("correo", email);
        passSecond.putExtra("password", password);


        startActivity(passSecond);
    }
}