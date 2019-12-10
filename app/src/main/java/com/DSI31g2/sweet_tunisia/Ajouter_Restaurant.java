package com.DSI31g2.sweet_tunisia;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ajouter_Restaurant extends AppCompatActivity {
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ajout_restaurant);
        final EditText describe = findViewById(R.id.description_destination);
        final EditText localisation = findViewById(R.id.locale_cafe);
        Button btn1 = findViewById(R.id.ajout_restaurant_btn);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Describe = describe.getText().toString();
                String Localisation = localisation.getText().toString();
                Restaurant restaurant = new RestaurantBuilder().setDescribe(Describe).setLocalisation(Localisation).createRestaurant();


                Helper helper = new Helper(context);
                SQLiteDatabase db = helper.getWritableDatabase();
                helper.addRestaurant(db, restaurant);


            }
        });

    }


}
