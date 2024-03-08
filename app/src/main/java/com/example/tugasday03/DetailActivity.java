package com.example.tugasday03;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String KEY_DATA = "key_object";

    private TextView name, price, diameter, color;
    private Button btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);

        name = findViewById(R.id.name);
        price = findViewById(R.id.price);
        diameter = findViewById(R.id.diameter);
        color = findViewById(R.id.color);
        btnShare = findViewById(R.id.btnShare);

        Detail detail;
        if (Build.VERSION.SDK_INT >= 33) {
            detail = getIntent().getParcelableExtra(KEY_DATA, Detail.class);
        } else {
            detail = getIntent().getParcelableExtra(KEY_DATA);
        }

        String nama = detail.getName();
        String harga = detail.getPrice();
        String dmeter = detail.getDiameter();
        String warna = detail.getColor();

        name.setText(nama);
        price.setText(harga);
        diameter.setText(dmeter);
        color.setText(warna);

        btnShare.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        shareText();
    }

    private void shareText() {


        String text1 = name.getText().toString();
        String text2 = price.getText().toString();
        String text3 = diameter.getText().toString();
        String text4 = color.getText().toString();
        String gabungan = text1 + text2 + text3 + text4;


        Intent intent = new Intent(Intent.ACTION_SEND);

        intent.setType("text/plain");

        intent.putExtra(Intent.EXTRA_TEXT, gabungan);


        if (intent.resolveActivity(getPackageManager()) != null) {

            startActivity(Intent.createChooser(intent, "Bagikan teks melalui"));
        } else {

            Toast.makeText(this, "Tidak ada aplikasi yang dapat menangani intent ini", Toast.LENGTH_SHORT).show();
        }
    }
}
