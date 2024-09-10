// Activity2.java
package com.example.luanfirstappandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        // Nhận Intent từ MainActivity
        Intent intent = getIntent();

        // Lấy URI từ Intent bằng getData()
        Uri webpage = intent.getData();
        String url = (webpage != null) ? webpage.toString() : "No URL provided";

        // Lấy các extras từ Intent
        String message = intent.getStringExtra("message");
        int posX = intent.getIntExtra("EXTRA_POSITION_X", 0);
        int posY = intent.getIntExtra("EXTRA_POSITION_Y", 0);

        // Hiển thị dữ liệu trong TextView
        TextView textView = findViewById(R.id.text_view_message);
        textView.setText("URL: " + url + "\nMessage: " + message +
                "\nPosition X: " + posX + "\nPosition Y: " + posY);
    }
}
