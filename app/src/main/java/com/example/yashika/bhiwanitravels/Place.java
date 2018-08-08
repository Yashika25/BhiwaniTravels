package com.example.yashika.bhiwanitravels;

public class Place {
    /**
     * Name for the place
     */
    private String mPlaceName;
    /**
     * Description about the place
     */
    private String mPlaceDesc;
    /**
     * Image resource ID for the place
     */
    private int mImageResourceId;


    /**
     * Create a new Place object.
     *
     * @param placeName       is the place name
     * @param placeDesc       is the description about the place
     * @param imageResourceId is the resource id of place picture
     */
    public Place(String placeName, String placeDesc, int imageResourceId) {
        mPlaceName = placeName;
        mPlaceDesc = placeDesc;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the place.
     */
    public String getmPlaceName() {
        return mPlaceName;
    }

    /**
     * Get the description about the place.
     */
    public String getmPlaceDesc() {
        return mPlaceDesc;
    }

    /**
     * Get the resource id of the place sample image
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
