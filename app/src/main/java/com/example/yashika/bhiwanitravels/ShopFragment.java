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
public class ShopFragment extends Fragment {


    public ShopFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_list_view, container, false);

        //Creating an ArrayList for Place
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.shopname1), getString(R.string.shopdesc1), R.drawable.eaza));
        places.add(new Place(getString(R.string.shopname2), getString(R.string.shopdesc2), R.drawable.much_more));
        places.add(new Place(getString(R.string.shopname3), getString(R.string.shopdesc3), R.drawable.chaap));
        places.add(new Place(getString(R.string.shopname4), getString(R.string.shopdesc4), R.drawable.lakshmi));
        places.add(new Place(getString(R.string.shopname5), getString(R.string.shopdesc5), R.drawable.china_town));
        places.add(new Place(getString(R.string.shopname6), getString(R.string.shopdesc6), R.drawable.hari));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
