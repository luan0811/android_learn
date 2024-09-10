// MainActivity.java
package com.example.luanfirstappandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openActivity2(View view) {
        // Tạo Intent tường minh để khởi chạy Activity2
        Intent intent = new Intent(this, Activity2.class);

        // Thêm một URI vào Intent
        Uri webpage = Uri.parse("http://www.example.com");
        intent.setData(webpage);  // Sử dụng setData() để thêm URI

        // Thêm dữ liệu khác vào Intent bằng putExtra()
        intent.putExtra("message", "Hello from MainActivity!");
        intent.putExtra("EXTRA_POSITION_X", 100);
        intent.putExtra("EXTRA_POSITION_Y", 200);

        // Khởi chạy Activity2
        startActivity(intent);
    }
}
