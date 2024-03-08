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

public class BajuOlahragaActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_baju_olahraga);

        ImageView img11 = findViewById(R.id.img11);
        ImageView img12 = findViewById(R.id.img12);
        ImageView img13 = findViewById(R.id.img13);
        ImageView img14 = findViewById(R.id.img14);
        ImageView img15 = findViewById(R.id.img15);

        img11.setOnClickListener(this);
        img12.setOnClickListener(this);
        img13.setOnClickListener(this);
        img14.setOnClickListener(this);
        img15.setOnClickListener(this);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void onClick(View v) {
        Detail detail = new Detail();

        if (v.getId() == R.id.img11) {


            detail.setName("- Baju Basket");
            detail.setPrice("- Rp.155.000");
            detail.setDiameter("- Size : M");
            detail.setColor("- Warna Merah");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);

        }else if (v.getId() == R.id.img12) {


            detail.setName("- Baju Bola");
            detail.setPrice("- Rp.195.000");
            detail.setDiameter("- Size : L");
            detail.setColor("- Warna Merah");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);

        }else if (v.getId() == R.id.img13) {


            detail.setName("- Baju Tennis");
            detail.setPrice("- Rp.240.000");
            detail.setDiameter("- Size : XL");
            detail.setColor("- Warna Biru");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);

        }else if (v.getId() == R.id.img14) {


            detail.setName("- Bola Voli");
            detail.setPrice("- Rp.147.000");
            detail.setDiameter("- Size : S");
            detail.setColor("- Warna Biru Dongker");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);

        }else if (v.getId() == R.id.img15) {


            detail.setName("- Bola Bersepeda");
            detail.setPrice("- Rp.215.000");
            detail.setDiameter("- Size : L");
            detail.setColor("- Warna Abu-Abu Merah");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }
    }
}