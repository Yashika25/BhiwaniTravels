package com.example.yashika.bhiwanitravels;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {

    Toast toast;

    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_list_view, container, false);

        if (toast != null) {
            toast.cancel();
        }
        toast = Toast.makeText(getActivity(), "Welcome to the Bhiwani Tour Guide App!", Toast.LENGTH_SHORT);
        toast.show();

        //Creating an ArrayList for Place
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.attractname1), getString(R.string.attractdesc1), R.drawable.mall));
        places.add(new Place(getString(R.string.attractname2), getString(R.string.attractdesc2), R.drawable.bar));
        places.add(new Place(getString(R.string.attractname3), getString(R.string.attractdesc3), R.drawable.bheem_stadium));
        places.add(new Place(getString(R.string.attractname4), getString(R.string.attractdesc4), R.drawable.jat_dharamshala));
        places.add(new Place(getString(R.string.attractname5), getString(R.string.attractdesc5), R.drawable.zoo));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
