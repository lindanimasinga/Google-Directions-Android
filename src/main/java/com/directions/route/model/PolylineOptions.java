package com.directions.route.model;

import java.util.ArrayList;
import java.util.List;

public class PolylineOptions {

    private List<LatLng> points = new ArrayList<LatLng>();

    public void add(LatLng point) {
        points.add(point);
    }
}
