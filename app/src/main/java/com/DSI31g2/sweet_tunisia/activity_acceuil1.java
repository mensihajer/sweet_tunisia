package com.DSI31g2.sweet_tunisia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_acceuil1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        Button inscrire_btn = findViewById(R.id.inscrire_btn);
        Button connecter_btn = findViewById(R.id.connecter_btn);
        //gestion de click de button connecter
        connecter_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_acceuil1.this, authentification.class);
                startActivity(i);
            }

        });
        //gestion de click de button inscrire
        inscrire_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_acceuil1.this, inscrit_activity.class);
                startActivity(i);


            }
        });

    }
}