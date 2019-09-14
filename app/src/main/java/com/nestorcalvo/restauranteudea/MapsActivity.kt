package com.nestorcalvo.restauranteudea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
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
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        //val sydney = LatLng(-34.0, 151.0)
        val title = "Domino's Pizza"
        val dominos1 = LatLng(6.257304, -75.592293)
        val dominos2 = LatLng( 6.252784, -75.588493 )
        val dominos3 = LatLng(6.246668, -75.594331)
        val dominos4 = LatLng(6.262144, -75.587103)
        val dominos5 = LatLng(6.238846, -75.601898)
        val dominos6 = LatLng(6.234115, -75.570254)

        mMap.addMarker(MarkerOptions().position(dominos1).title(title))
        mMap.addMarker(MarkerOptions().position(dominos2).title(title))
        mMap.addMarker(MarkerOptions().position(dominos3).title(title))
        mMap.addMarker(MarkerOptions().position(dominos4).title(title))
        mMap.addMarker(MarkerOptions().position(dominos5).title(title))
        mMap.addMarker(MarkerOptions().position(dominos6).title(title))

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(6.247769, -75.580181), 13.5f))
    }
}
