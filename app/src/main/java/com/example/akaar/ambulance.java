package com.example.akaar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ambulance extends AppCompatActivity {

    TextView Jalandhar;
    TextView Phagwara;
    TextView Ludhiana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance);


        Jalandhar= findViewById(R.id.jalandhar);
        Jalandhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.google.com/search?q=ludhiana+hospital&npsic=0&rflfq=1&rlha=0&rllag=30899931,75884686,5155&tbm=lcl&ved=2ahUKEwi07pvhoejhAhUNk3AKHYWQBywQtgN6BAgJEAQ&tbs=lrf:!2m1!1e2!2m1!1e3!2m1!1e16!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:;mv:!1m2!1d30.929805899999995!2d75.9439083!2m2!1d30.872342099999997!2d75.78288049999999;tbs:lrf:!2m1!1e2!2m1!1e3!2m1!1e16!3sIAE,lf:1,lf_ui:2");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });

        Phagwara= findViewById(R.id.phagwara);
        Phagwara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.google.com/search?q=hospitals%20near%20me&oq=hospi&aqs=chrome.3.69i57j69i60j69i61j69i59j69i60.4179j0j4&sourceid=chrome&ie=UTF-8&npsic=0&rflfq=1&rlha=0&rllag=31252489,75721842,4805&tbm=lcl&rldimm=7054543409981067637&lqi=ChFob3NwaXRhbHMgbmVhciBtZSIDkAEBWgsKCWhvc3BpdGFscw&ved=2ahUKEwiowb_nnejhAhXEfisKHc-IB8gQvS4wAXoECAsQNg&rldoc=1&tbs=lrf:!2m4!1e17!4m2!17m1!1e2!2m1!1e2!2m1!1e3!2m1!1e16!3sIAE,lf:1,lf_ui:2#rlfi=hd:;si:529228692962907852;mv:!1m2!1d31.29185!2d75.78564469999999!2m2!1d31.2106505!2d75.63530290000001");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });


        Ludhiana= findViewById(R.id.ludhiana);
        Ludhiana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.google.com/search?tbm=lcl&ei=4xfAXO2fDJSWwgOPhZqoCg&q=phagwara+civil+hospital&oq=phag+hospital&gs_l=psy-ab.3.1.0i7i30k1l5j0i13k1l3j0i7i30k1l2.20962.23336.0.25593.4.4.0.0.0.0.491.976.0j1j0j1j1.3.0....0...1c.1.64.psy-ab..1.3.976...38.0.xaddeAKxfPQ#rlfi=hd:;si:18431644676891561208;mv:!1m2!1d31.2307064!2d75.763108!2m2!1d31.229848699999998!2d75.7620728");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });








       }
}
