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
public class InstituteFragment extends Fragment {


    public InstituteFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_list_view, container, false);

        //Creating an ArrayList for Place
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.instname1), getString(R.string.instdesc1), R.drawable.tit_s));
        places.add(new Place(getString(R.string.instname2), getString(R.string.instdesc2), R.drawable.school));
        places.add(new Place(getString(R.string.instname3), getString(R.string.instdesc3), R.drawable.women));
        places.add(new Place(getString(R.string.instname4), getString(R.string.instdesc4), R.drawable.bansi_lal));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;

    }

}
