package com.example.android.visitwarsawapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ArchitectureFragment extends Fragment {

    public ArchitectureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places for the architecture category
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.architecture_placename_palaceofcultureandscience, R.string.architecture_placeaddress_palaceofcultureandscience, R.string.architecture_placedescription_palaceofcultureandscience,
                R.drawable.architecture_pkin));
        places.add(new Place(R.string.architecture_placename_ufficioprimo, R.string.architecture_placeaddress_ufficioprimo, R.string.architecture_placedescription_ufficioprimo,
                R.drawable.architecture_ufficioprimo));
        places.add(new Place(R.string.architecture_placename_warsawbarbican, R.string.architecture_placeaddress_warsawbarbican, R.string.architecture_placedescription_warsawbarbican,
                R.drawable.architecture_warsawbarbican));
        places.add(new Place(R.string.architecture_placename_holytrinitychurch, R.string.architecture_placeaddress_holytrinitychurch, R.string.architecture_placedescription_holytrinitychurch, R.drawable.architecture_holytrinitychurch));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_architecture);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // place_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link PlaceAdapter} created above, so that the
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