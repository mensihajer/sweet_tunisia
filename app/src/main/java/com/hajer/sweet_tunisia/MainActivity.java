package com.hajer.sweet_tunisia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Pattern;



public class MainActivity extends AppCompatActivity {
    final String EXTRA_LOGIN = "user_login";
    final String EXTRA_PASSWORD = "user_password";
    final String EXTRA_FIRSTNAME="user_firstName";
    final String EXTRA_LASTNAME="user_lastName";
    final String EXTRANUM ="user_num";
    final String EXTRANAISSANCE="user_naissance";
    final String EXTRA_PASSWORDI="user_password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        //gestion de click de button inscrire
        final Button inscrire_btn = findViewById(R.id.inscrire_btn);
        final EditText firstName = findViewById(R.id.firstName);
        final EditText lastName = findViewById(R.id.lastName);
        final EditText num = findViewById(R.id.num);
        final EditText naissance = findViewById(R.id.nassance);
        final EditText passwordi = findViewById(R.id.passwordi);

        inscrire_btn.hasOnClickListeners(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final String firstNametxt = firstName.getText().toString();
                final String lastnametxt = lastName.getText().toString();
                final String numtxt = num.getText().toString();
                final  String naissancetxt= naissance.getText().toString();
                final String passwordtxt= passwordi.getText().toString();

                // On vérifie que les champs ne sont pas vides
                if (firstNametxt.equals("") || lastnametxt.equals("") || numtxt.equals("") || naissancetxt.equals("") || passwordtxt.equals("")) {
                    Toast.makeText(MainActivity.this, R.string.champs_vide,
                            Toast.LENGTH_SHORT).show();
                    return;

                    Intent intent = new Intent(MainActivity.this,login_activity_display.class);
                    intent.putExtra(EXTRA_FIRSTNAME, firstNametxt);
                    intent.putExtra(EXTRA_LASTNAME, lastnametxt);
                    intent.putExtra(EXTRANUM,numtxt);
                    intent.putExtra(EXTRANAISSANCE,naissancetxt);
                    intent.putExtra(EXTRA_PASSWORDI,passwordtxt);
                    startActivity(intent);
                }}

        });

        //gestion de click de button connecter
        final Button connecter_btn = findViewById(R.id.connecter_btn);
        final EditText login = findViewById(R.id.email);
        final EditText pass = findViewById(R.id.password);

        connecter_btn.hasOnClickListeners(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final String loginTxt = login.getText().toString();
                final String passTxt = pass.getText().toString();
                // On vérifie que le login et le password ne sont pas vides
                if (loginTxt.equals("") || passTxt.equals("")) {
                    Toast.makeText(MainActivity.this, R.string.email_or_password_empty,
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                // On déclare le pattern que l’on doit vérifier
                Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
                // On déclare un matcher, qui comparera le pattern avec la string passée en argument
                Matcher m = p.matcher(loginTxt);
                // Si l’adresse mail saisie ne correspond pas au format d’une adresse mail,
                // on affiche un message à l'utilisateur
                if (!m.matches()) {
                    Toast.makeText(MainActivity.this, R.string.email_format_error,
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent intent = new Intent(MainActivity.this,login_activity_display.class);
                intent.putExtra(EXTRA_LOGIN, loginTxt);
                intent.putExtra(EXTRA_PASSWORD, passTxt);
                startActivity(intent);
            }
        });



    }  }

