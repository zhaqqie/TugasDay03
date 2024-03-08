package com.example.tugasday03;

import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {
    public static final String KEY_DATA = "key_object";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);

        TextView name = findViewById(R.id.name);
        TextView price = findViewById(R.id.price);
        TextView diameter = findViewById(R.id.diameter);
        TextView color = findViewById(R.id.color);

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

        detail.getColor();

        name.setText(nama);
        price.setText(harga);
        diameter.setText(dmeter);
        color.setText(warna);

        btnShare.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        shareImageAndText();
    }

    private void shareImageAndText() {
        Bitmap bitmap = ((BitmapDrawable) imgDetail.getDrawable()).getBitmap();
        String text1 = name.getText().toString();
        String text2 = price.getText().toString();
        String text3 = diameter.getText().toString();
        String text4 = color.getText().toString();
        String gabungan = text1 + text2 + text3 + text4;

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("image/*");

        Uri uri = getImageUri(this, bitmap);
        intent.putExtra(Intent.EXTRA_STREAM, uri);
        intent.putExtra(Intent.EXTRA_TEXT, gabungan);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(Intent.createChooser(intent, "Bagikan melalui"));
        } else {
            Toast.makeText(this, "Tidak ada aplikasi yang dapat menangani intent ini", Toast.LENGTH_SHORT).show();
        }
    }

    private Uri getImageUri(Context context, Bitmap bitmap) {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
        String path = MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, "Title", null);
        return Uri.parse(path);
    }
}


