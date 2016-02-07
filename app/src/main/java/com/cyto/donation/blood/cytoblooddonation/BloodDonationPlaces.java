package com.cyto.donation.blood.cytoblooddonation;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class BloodDonationPlaces extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_donation_places);
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
        LatLng nhs = new LatLng(55.863978, -4.337575);
        mMap.addMarker(new MarkerOptions().position(nhs).title("NHS Greater Glasgow and Clyde"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(nhs));

        LatLng gri = new LatLng(55.865152, -4.235763);
        mMap.addMarker(new MarkerOptions().position(gri).title("Glasgow Royal Infirmary"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gri));

        LatLng gg = new LatLng(55.883642, -4.312853);
        mMap.addMarker(new MarkerOptions().position(gg).title("Gartnavel General"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gg));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(gg, 13));

        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(gg)      // Sets the center of the map to location user
                .zoom(12)                   // Sets the zoom
                .bearing(90)                // Sets the orientation of the camera to east
                .tilt(40)                   // Sets the tilt of the camera to 30 degrees
                .build();                   // Creates a CameraPosition from the builder
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));


    }
}
