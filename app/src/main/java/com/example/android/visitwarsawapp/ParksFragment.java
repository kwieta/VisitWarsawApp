package com.example.android.visitwarsawapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places for the parks category
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.parks_placename_lazienki, R.string.parks_placeaddress_lazienki, R.string.parks_placedescription_lazienki,
                R.drawable.parks_lazienki));
        places.add(new Place(R.string.parks_placename_saski, R.string.parks_placeaddress_saski, R.string.parks_placedescription_saski,
                R.drawable.parks_saski));
        places.add(new Place(R.string.parks_placename_wilanow, R.string.parks_placeaddress_wilanow, R.string.parks_placedescription_wilanow,
                R.drawable.parks_wilanow));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_parks);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // place_listt.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);
        // Set a click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Place} object at the given position the user clicked on
                Place place = places.get(position);
            }
        });
        return rootView;
    }
}