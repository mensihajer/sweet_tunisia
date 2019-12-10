package com.DSI31g2.sweet_tunisia;

import android.database.sqlite.SQLiteDatabase;

public class AjouterDestination extends AppCompatActivity {
    Context context = this;

    {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ajout_destination);
        final EditText describe_Destination = findViewById(R.id.description_destination);
        final EditText localisation_Destination = findViewById(R.id.locale_destination);
        Button btn1 = findViewById(R.id.ajout_destination_btn);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String describe_Destination = describe_destination.getText().toString();
                String Localisation_Destination = localisation_destination.getText().toString();
                Restaurant restaurant = new RestaurantBuilder().setDescribe(describe_Destination).setLocalisation(Localisation_Destination).createRestaurant();


                Helper helper = new Helper(context);
                SQLiteDatabase db = helper.getWritableDatabase();
                helper.addDestination(db, destination);


            }
        });

    }
