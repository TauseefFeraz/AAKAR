package com.example.akaar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class garrage extends AppCompatActivity {
    TextView ktm;
    TextView autocenter;
    TextView Hundai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garrage);

        ktm= findViewById(R.id.ktm);
        ktm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.google.com/search?tbm=lcl&ei=_xfAXIrWO4nNvgTr2Y-wBQ&q=ktm+service+centre&oq=ktm+servi&gs_l=psy-ab.3.0.0l10.2538096.2541940.0.2543864.9.9.0.0.0.0.474.1375.0j3j0j1j1.5.0....0...1c.1.64.psy-ab..4.5.1372...0i67k1j0i131k1.0.zfrD-Ap26vs#rlfi=hd:;si:;mv:!1m2!1d32.193803599999995!2d76.9081454!2m2!1d30.657613299999998!2d74.7543638;tbs:lrf:!2m1!1e3!2m1!1e16!3sIAE,lf:1,lf_ui:4");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });

        autocenter= findViewById(R.id.autoservice);
        autocenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.google.com/search?tbm=lcl&ei=RSLAXNDaGK_Sz7sP_puTwAw&q=auto+service+centre&oq=auto+serice+&gs_l=psy-ab.3.1.0i13k1l10.17.5648.0.10445.14.13.0.0.0.0.1017.2813.0j2j1j5-2j0j1.6.0....0...1c.1.64.psy-ab..8.6.2811...0j35i39k1j0i67k1j0i131k1j0i10k1.0._q2os9nduoE#rlfi=hd:;si:;mv:!1m2!1d31.362328499999997!2d75.7803383!2m2!1d31.2174645!2d75.519292;tbs:lrf:!2m1!1e2!2m1!1e3!2m1!1e16!2m4!1e17!4m2!17m1!1e2!3sIAE,lf:1,lf_ui:2");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });


        Hundai= findViewById(R.id.hundai);
        Hundai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.hyundai.com/in/en/Service/ServiceNetwork/FindaServiceDealer/index.html");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });


    }
}
