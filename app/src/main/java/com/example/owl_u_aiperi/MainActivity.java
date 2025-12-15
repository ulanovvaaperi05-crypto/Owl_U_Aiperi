package com.example.owl_u_aiperi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEmail=findViewById(R.layout.activity_main);
        btnEmail.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent);
        });

    }
}

