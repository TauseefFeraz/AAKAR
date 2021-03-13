package com.example.akaar;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class maps_hospital extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_hospital);
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
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));


        LatLng hospital = new LatLng(31.2507191,75.7080725);
        mMap.addMarker(new MarkerOptions().position(hospital).title("Hospital"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hospital));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(13),2000,null);



        LatLng qw= new LatLng(31.256579,75.6717478 );  //22.8153472,86.1696232
        mMap.addMarker(new MarkerOptions().position(qw).title("Shri Baldev Raj Mittal Hospital"));




        LatLng er= new LatLng(31.1984229,75.7443323);  //22.8153472,86.1696232
        mMap.addMarker(new MarkerOptions().position(er).title("world cancercare camp"));




        LatLng ty= new LatLng(31.2747222,75.6434313);  //22.8153472,86.1696232
        mMap.addMarker(new MarkerOptions().position(ty).title("AMAN cancer hospital"));






        LatLng op= new LatLng(31.2579445,75.6718517);  //22.8153472,86.1696232
        mMap.addMarker(new MarkerOptions().position(op).title("DR pathlabs hospitals"));





        LatLng as= new LatLng(31.3206486,75.5971676);  //22.8153472,86.1696232
        mMap.addMarker(new MarkerOptions().position(as).title("Johal Multi-Speciality Hospital"));





        LatLng df= new LatLng(31.2309317,75.6394486);  //22.8153472,86.1696232
        mMap.addMarker(new MarkerOptions().position(df).title("Govt.Hospital"));






        LatLng gh= new LatLng(31.1984229,75.7443323);  //22.8153472,86.1696232
        mMap.addMarker(new MarkerOptions().position(gh).title("Shine& smile dental clinic and implant center"));












    }
}
