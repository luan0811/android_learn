package com.example.luanfirstappandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

//    private int mCount = 0;
//    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

//        mShowCount = findViewById(R.id.show_count); // Find the TextView

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // This method is called when the "Toast" button is clicked
//    public void showToast(View view) {
//        Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show();
//    }
//
//    // This method is called when the "Count" button is clicked
//    public void countUp(View view) {
//        mCount++;
//        if (mShowCount != null) {
//            mShowCount.setText(String.valueOf(mCount));
//        }
//    }
}
