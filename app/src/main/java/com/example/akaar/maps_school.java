package com.example.akaar;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class maps_school extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_school);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera


        LatLng block32 = new LatLng(31.2507191,75.7080725);
        mMap.addMarker(new MarkerOptions().position(block32).title("Lovely Professional University Block 32"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(block32));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(14),2000,null);




        LatLng aps = new LatLng(31.2731224,75.6267949);
        mMap.addMarker(new MarkerOptions().position(aps).title("Army Public School"));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(14),2000,null);




        LatLng lpu = new LatLng(31.2523688,75.6928456);
        mMap.addMarker(new MarkerOptions().position(lpu).title("Lovely Professional University"));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(13),2000,null);


        LatLng cps = new LatLng(31.3128325,75.5540564);  //22.8153472,86.1696232
        mMap.addMarker(new MarkerOptions().position(cps).title("City Public School"));




        LatLng aps1 = new LatLng(31.3027385,75.5817108);  //22.8153472,86.1696232
        mMap.addMarker(new MarkerOptions().position(aps1).title("ARMY PUBLIC SCHOOL"));



        LatLng dps= new LatLng(31.302087,75.6088831);  //22.8153472,86.1696232
        mMap.addMarker(new MarkerOptions().position(dps).title("DELHI PUBLIC SCHOOL"));



        LatLng ahps = new LatLng(31.2497746,75.6720047);  //22.8153472,86.1696232
        mMap.addMarker(new MarkerOptions().position(ahps).title("ACAEDMIC HEIGHT PUBLIC SCHOOL"));



        LatLng asj = new LatLng(31.3166803,75.5470153);  //22.8153472,86.1696232
        mMap.addMarker(new MarkerOptions().position(asj).title("APEEJAY SCHOOL JALANDHAR"));



        LatLng bsf= new LatLng(31.3089787,75.5715253);  //22.8153472,86.1696232
        mMap.addMarker(new MarkerOptions().position(bsf).title("BSF SENIOR SECONDARY SCHOOL"));



        LatLng bos = new LatLng(31.3101563,75.6002481);  //22.8153472,86.1696232
        mMap.addMarker(new MarkerOptions().position(bos).title("BRITISH OLIVIA SCHOOL"));



        LatLng ivy= new LatLng(31.3403589,75.6002028);  //22.8153472,86.1696232
        mMap.addMarker(new MarkerOptions().position(ivy).title("IVY WORLD SCHOOL"));





        LatLng sjc = new LatLng(31.3088805,75.5651514);  //22.8153472,86.1696232
        mMap.addMarker(new MarkerOptions().position(sjc).title("ST JOSEPH'S CONVENT SCHOOL"));



        LatLng pds = new LatLng(31.3122242,75.5814261);  //22.8153472,86.1696232
        mMap.addMarker(new MarkerOptions().position(pds).title("POLICE D.A.V. PUBLIC SCHOOL"));





        LatLng cisfg = new LatLng(31.291127,75.5506281);  //22.8153472,86.1696232
        mMap.addMarker(new MarkerOptions().position(cisfg).title("CAMBRIDGE INTERNATIONAL SCHOOL FOR GIRLS"));



        LatLng mws = new LatLng(31.2941496,75.5575997);  //22.8153472,86.1696232
        mMap.addMarker(new MarkerOptions().position(mws).title("MAYOR WORLD SCHOOL"));






        LatLng sgcs = new LatLng(31.305853,75.5370671);  //22.8153472,86.1696232
        mMap.addMarker(new MarkerOptions().position(sgcs).title("St GEORGES CONVENT SCHOOL"));



        LatLng cis = new LatLng(31.3066651,75.5557912);  //22.8153472,86.1696232
        mMap.addMarker(new MarkerOptions().position(cis).title("Cambridge International School"));






        LatLng dms= new LatLng(31.308561,75.5397731);  //22.8153472,86.1696232
        mMap.addMarker(new MarkerOptions().position(dms).title("Dayanand Model School"));



        LatLng mgn= new LatLng(31.3334644,75.524869);  //22.8153472,86.1696232
        mMap.addMarker(new MarkerOptions().position(mgn).title("M.G.N. Public School"));





        LatLng chis = new LatLng(31.3100532,75.6176857);  //22.8153472,86.1696232
        mMap.addMarker(new MarkerOptions().position(chis).title("Chankaya International School"));




    }
}
