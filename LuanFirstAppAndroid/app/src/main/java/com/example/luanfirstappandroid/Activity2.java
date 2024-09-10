// Activity2.java
package com.example.luanfirstappandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    public static final String EXTRA_RETURN_MESSAGE = "com.example.luanfirstappandroid.RETURN_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    // Khi người dùng nhấn vào nút gửi phản hồi
    public void returnReply(View view) {
        EditText editText = findViewById(R.id.editText_reply);
        String replyMessage = editText.getText().toString();

        // Tạo một Intent để chứa dữ liệu phản hồi
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_RETURN_MESSAGE, replyMessage);

        // Thiết lập kết quả là OK và gắn kèm Intent
        setResult(RESULT_OK, replyIntent);

        // Đóng Activity2 và quay về MainActivity
        finish();
    }
}
