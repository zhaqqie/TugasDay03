package com.example.tugasday03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



    public class MainActivity extends AppCompatActivity implements View.OnClickListener {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_main);

            Button btBola = findViewById(R.id.btBola);
            Button btSepatu = findViewById(R.id.btSepatu);
            Button btBaju = findViewById(R.id.btBaju);

            btBola.setOnClickListener(this);
            btSepatu.setOnClickListener(this);
            btBaju.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.btBola) {
                Intent intent = new Intent(this, BolaActivity.class);
                startActivity(intent);
            } else if (v.getId() == R.id.btSepatu) {
                Intent intent = new Intent(this, sepatuActivity.class);
                startActivity(intent);
            } else if (v.getId() == R.id.btBaju) {
                Intent intent = new Intent(this, BajuOlahragaActivity.class);
                startActivity(intent);

            }

        }
    }