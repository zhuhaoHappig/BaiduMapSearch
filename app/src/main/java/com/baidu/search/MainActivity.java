package com.baidu.search;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button searchPoi = (Button) findViewById(R.id.btn_search_poi);
        Button searchDistrict = (Button) findViewById(R.id.btn_search_district);
        Button searchRouteplan = (Button) findViewById(R.id.btn_search_routeplan);
        Button searchBusline = (Button) findViewById(R.id.btn_search_busline);
        Button geocoder = (Button) findViewById(R.id.btn_geocoder);

        searchPoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PoiSearchDemo.class);
                startActivity(intent);
            }
        });

        searchDistrict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DistrictSearchDemo.class);
                startActivity(intent);
            }
        });
        searchRouteplan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RoutePlanDemo.class);
                startActivity(intent);
            }
        });

        searchBusline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BusLineSearchDemo.class);
                startActivity(intent);
            }
        });
        geocoder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,GeoCoderDemo.class);
                startActivity(intent);
            }
        });

    }
}
