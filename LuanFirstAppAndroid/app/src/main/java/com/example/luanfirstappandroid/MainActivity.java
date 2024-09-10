// MainActivity.java
package com.example.luanfirstappandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final int TEXT_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Phương thức để mở Activity2 và yêu cầu kết quả
    public void openActivity2(View view) {
        Intent intent = new Intent(this, Activity2.class);
        startActivityForResult(intent, TEXT_REQUEST);  // Khởi chạy với request code
    }

    // Xử lý kết quả trả về từ Activity2
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(Activity2.EXTRA_RETURN_MESSAGE);
                TextView textView = findViewById(R.id.text_view_reply);
                textView.setText(reply);  // Hiển thị kết quả trả về
            }
        }
    }
}
