package com.DSI31g2.sweet_tunisia;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AjouterCaffe extends AppCompatActivity {
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ajout_cafe);
        final EditText describe_caffe = findViewById(R.id.description_cafe);
        final EditText localisation_caffe = findViewById(R.id.locale_cafe);
        Button btn1 = findViewById(R.id.ajout_cafe_btn);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Describe_caffe = describe_caffe.getText().toString();
                String Localisation_caffe = localisation_caffe.getText().toString();
                Restaurant restaurant = new RestaurantBuilder().setDescribe(Describe_caffe).setLocalisation(Localisation_caffe).createRestaurant();


                Helper helper = new Helper(context);
                SQLiteDatabase db = helper.getWritableDatabase();
                helper.addCaffe(db, caffe);


            }
        });

    }
}
