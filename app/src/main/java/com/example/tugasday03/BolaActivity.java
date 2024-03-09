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

public class BolaActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bola);

        ImageView img1 = findViewById(R.id.img1);
        ImageView img2 = findViewById(R.id.img2);
        ImageView img3 = findViewById(R.id.img3);
        ImageView img4 = findViewById(R.id.img4);
        ImageView img5 = findViewById(R.id.img5);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void onClick(View v) {
        Detail detail = new Detail();

        if (v.getId() == R.id.img1) {


            detail.setName("- Bola Golf Nike");
            detail.setPrice("- Rp.275.000");
            detail.setDiameter("- Diameter : 5cm");
            detail.setColor("- Warna Putih");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);

        }else if (v.getId() == R.id.img2) {


            detail.setName("- Bola Basket Spokey");
            detail.setPrice("- Rp.355.000");
            detail.setDiameter("- Diameter : 20cm");
            detail.setColor("- Warna Merah Bata");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);

        }else if (v.getId() == R.id.img3) {


            detail.setName("- Bola Kaki Adidas");
            detail.setPrice("- Rp.325.000");
            detail.setDiameter("- Dianeter : 16cm");
            detail.setColor("- Warna Putih Hitam");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);

        }else if (v.getId() == R.id.img4) {

            detail.setName("Bola Tennis Wilson");
            detail.setPrice("Rp.160.000");
            detail.setDiameter("Diameter : 7cm");
            detail.setColor("Warna Hijau");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);

        }else if (v.getId() == R.id.img5) {


            detail.setName("Bola Voli Mikasa");
            detail.setPrice("Rp.195.000");
            detail.setDiameter("Diameter : 14cm");
            detail.setColor("Warna Kuning Biru");

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }
    }
}