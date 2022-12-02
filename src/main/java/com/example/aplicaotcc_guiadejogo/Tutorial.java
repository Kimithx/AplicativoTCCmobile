package com.example.aplicaotcc_guiadejogo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import java.util.Objects;

public class Tutorial extends AppCompatActivity {

    Button voltar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.tutorial);

        voltar3 = findViewById(R.id.voltar3);

        voltar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Tutorial.this, Guia.class);
                startActivity(it);
            }
        });
    }
}