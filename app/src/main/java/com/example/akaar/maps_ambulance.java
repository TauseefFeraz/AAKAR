package com.example.akaar;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class maps_ambulance extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_ambulance);
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

        LatLng ambulance1 = new LatLng(31.2507191,75.7080725);
        mMap.addMarker(new MarkerOptions().position(ambulance1).title("Lovely Professional University Block 32"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(ambulance1));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(12),2000,null);




        LatLng ambulance2 = new LatLng(31.2731224,75.6267949);
        mMap.addMarker(new MarkerOptions().position(ambulance2).title("Army Public School"));




        LatLng ambulance3 = new LatLng(31.2523688,75.6928456);
        mMap.addMarker(new MarkerOptions().position(ambulance3).title("Lovely Professional University"));
    }
}
