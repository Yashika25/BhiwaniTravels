package com.example.yashika.bhiwanitravels;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class OverviewFragment extends Fragment {


    public OverviewFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_list_view, container, false);

        //Creating an ArrayList for Place
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.madeby), getString(R.string.describe), R.drawable.abnd));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
