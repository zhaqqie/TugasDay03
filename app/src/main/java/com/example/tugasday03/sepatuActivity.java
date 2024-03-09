package com.example.tugasday03;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class sepatuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sepatu);

        ImageView img6 = findViewById(R.id.img6);
        ImageView img7 = findViewById(R.id.img7);
        ImageView img8 = findViewById(R.id.img8);
        ImageView img9 = findViewById(R.id.img9);
        ImageView img10 = findViewById(R.id.img10);

        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);
        img10.setOnClickListener(this);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void onClick(View v) {
        Detail detail = new Detail();

        if (v.getId() == R.id.img6) {


            detail.setName("- Sepatu Bola");
            detail.setPrice("- Rp.499.000");
            detail.setDiameter("- Size : 43");
            detail.setColor("- Warna Oren");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);

        }else if (v.getId() == R.id.img7) {


            detail.setName("- Sepatu Converse");
            detail.setPrice("- Rp.320.000");
            detail.setDiameter("- Size : 41");
            detail.setColor("- Warna Kuning");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);

        }else if (v.getId() == R.id.img8) {


            detail.setName("- Sepatu Jordan");
            detail.setPrice("- Rp.699.000");
            detail.setDiameter("- Size : 43");
            detail.setColor("- Warna Kuning Hitam");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);

        }else if (v.getId() == R.id.img9) {


            detail.setName("- Sepatu Running");
            detail.setPrice("- Rp.438.000");
            detail.setDiameter("- Size : 40");
            detail.setColor("- Warna Hijau Biru");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);

        }else if (v.getId() == R.id.img10) {


            detail.setName("- Sepatu Vans");
            detail.setPrice("- Rp.265.000");
            detail.setDiameter("- Size : 42");
            detail.setColor("- Warna Hitam");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }
    }
}