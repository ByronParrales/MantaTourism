package com.example.rosario.mantatourism;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapaHotel1 extends FragmentActivity implements OnMapReadyCallback {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.MapaHotel1);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        // Add a marker in Sydney, Australia, and move the camera.
        LatLng sydney = new LatLng(-0.9424425,-80.7310596);
        map.addMarker(new MarkerOptions().position(Oro Verde).title("Marker in Manta"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Manta));
    }
}