package com.example.akaar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class auto extends AppCompatActivity {
    TextView autoaddress;
    TextView carandbikes;
    TextView drivezy;

    TextView kinghillsweb;
    TextView cardandbikesweb;
    TextView drivezyweb;

    Button olawebsite;
    Button uberWebsite;
    Button drivezyWebSite2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto);


        autoaddress= findViewById(R.id.KingHilladdress);
        autoaddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.google.com/maps/place/King+Hills+Travels/@31.2552756,75.7038853,17z/data=!4m14!1m8!3m7!1s0x391a5f676f082753:0xbb1bbdf3e44b296e!2sKing+Hills+Travels!8m2!3d31.255271!4d75.706074!9m1!1b1!3m4!1s0x391a5f676f082753:0xbb1bbdf3e44b296e!8m2!3d31.255271!4d75.706074");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });



        carandbikes= findViewById(R.id.CarAndBikesid);
        carandbikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.google.com/maps/place/Royal+Brothers+-+Bike+rentals+in+Bangalore/@12.9778865,77.6366075,17z/data=!3m1!4b1!4m5!3m4!1s0x3bae15ee48fc6ca3:0xe863be853a26c98e!8m2!3d12.9778813!4d77.6387962");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });





        drivezy= findViewById(R.id.Drivezyid);
        drivezy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.google.com/maps/place/Drivezy/@13.0166664,77.6530043,17z/data=!3m1!4b1!4m5!3m4!1s0x3bae10d56adc4dcf:0x737ed299ab680ed!8m2!3d13.0166612!4d77.655193");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });






        kinghillsweb= findViewById(R.id.KingHillWebsite);
        kinghillsweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.tradeindia.com/Seller-9299249-King-hills-travels/");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });



        cardandbikesweb= findViewById(R.id.CarAndBikesWebsite);
        cardandbikesweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.royalbrothers.com/");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });





        drivezyweb= findViewById(R.id.DrivezyWebsite);
        drivezyweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://drivezy.com/Bengaluru/");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });









        olawebsite= findViewById(R.id.olaWebsiteid);
        olawebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.olacabs.com/mobile");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });



        uberWebsite= findViewById(R.id.uberWebsiteid);
        uberWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.uber.com/apps/");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });





        drivezyWebSite2= findViewById(R.id.DrivezyWebsite2);
        drivezyWebSite2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://drivezy.com/apps");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });


    }
}
