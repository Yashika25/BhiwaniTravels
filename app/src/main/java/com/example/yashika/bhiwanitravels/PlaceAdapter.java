package com.example.yashika.bhiwanitravels;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param places  A List of AndroidFlavor objects to display in a list
     */
    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Check if the existing view is being reused, otherwise inflate the view

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the activity_list.xml layout with the ID list_name
        TextView nameTextView = (TextView) convertView.findViewById(R.id.list_name);
        // Get the place name from the current Place object and
        // set this text on the name TextView
        nameTextView.setText(currentPlace.getmPlaceName());

        // Find the TextView in the activity_list.xml layout with the ID list_description
        TextView descTextView = (TextView) convertView.findViewById(R.id.list_description);
        // Get the description of the current Place object and
        // set this text on the desc TextView
        descTextView.setText(currentPlace.getmPlaceDesc());


        // Find the ImageView in the activity_list.xml layout with the ID list_image
        ImageView picImageView = (ImageView) convertView.findViewById(R.id.list_image);
        // Get the resource id of picture from the current Place object and
        // set this image on the pic ImageView
        picImageView.setImageResource(currentPlace.getmImageResourceId());


        // Return the whole list item layout (containing 2 TextViews and 1 ImageView)
        // so that it can be shown in the ListView
        return convertView;
    }

}
