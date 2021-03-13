package com.example.akaar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class restaurant extends AppCompatActivity {
    ImageView restaurent_menue1;
    Button swiggyid;
    Button zomatoid;
    Button foodpandaid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);



        restaurent_menue1=findViewById(R.id.restaurent_menue1);
        restaurent_menue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(restaurant.this,restaurent_menue.class);
                startActivity(intent);

            }
        });




        swiggyid= findViewById(R.id.swiggyid);
        swiggyid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.swiggy.com/app");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });





        zomatoid= findViewById(R.id.zomatoid);
        zomatoid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.zomato.com/app");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });





        foodpandaid= findViewById(R.id.foodpandaid);
        foodpandaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.foodpanda.in/apps");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });







    }

}
