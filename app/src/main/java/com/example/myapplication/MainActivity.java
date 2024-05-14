package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2;
    LinearLayout main, recommend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btn1 = (Button) findViewById(R.id.recommendBtn);
        btn2 = (Button) findViewById(R.id.listBtn);

        main = (LinearLayout) findViewById(R.id.startScreen);
        recommend = (LinearLayout) findViewById(R.id.recommendScreen);

    }

    public void onClick(View view){
        int id = view.getId();
        if (id == R.id.recommendBtn){
            main.setVisibility(View.INVISIBLE);
            recommend.setVisibility(View.VISIBLE);
        }
    }

}