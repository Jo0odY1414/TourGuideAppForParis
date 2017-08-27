package com.example.android.tourguideapp;

/**
 * Created by MjOoOoD on 26/8/2017 .
 */

public class Place {

    /**
     * Constant value that represents no image was provided for this place
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    private String placeName;
    private String placeAddress;
    private String placePhoneNumber;
    private String placeReviews;
    /**
     * Image resource ID for the place
     */
    private int pImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new Place object.
     *
     * @param placeAddress     is the string resource for the address associated with the place
     * @param placeName        is the string resource for the name of place associated with the place
     * @param placePhoneNumber is the string resource for the phone number associated with the place
     * @param placeReviews     is the string resource for the reviews associated with the place
     */

    public Place(String placeName, String placeAddress, String placePhoneNumber, String placeReviews) {
        this.placeName = placeName;
        this.placeAddress = placeAddress;
        this.placePhoneNumber = placePhoneNumber;
        this.placeReviews = placeReviews;
    }

    /**
     * Create a new Place object.
     *
     * @param placeAddress     is the string resource for the address associated with the place
     * @param placeName        is the string resource for the name of place associated with the place
     * @param placePhoneNumber is the string resource for the phone number associated with the place
     * @param placeReviews     is the string resource for the reviews associated with the place
     * @param pImageResourceId is the drawable resource ID for the image associated with the place
     */

    public Place(String placeName, String placeAddress, String placePhoneNumber, String placeReviews, int pImageResourceId) {
        this.placeName = placeName;
        this.placeAddress = placeAddress;
        this.placePhoneNumber = placePhoneNumber;
        this.placeReviews = placeReviews;
        this.pImageResourceId = pImageResourceId;
    }


    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceAddress() {
        return placeAddress;
    }

    public String getPlacePhoneNumber() {
        return placePhoneNumber;
    }

    public String getPlaceReviews() {
        return placeReviews;
    }

    public int getpImageResourceId() {
        return pImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this place.
     */
    public boolean hasImage() {
        return pImageResourceId != NO_IMAGE_PROVIDED;
    }


}
