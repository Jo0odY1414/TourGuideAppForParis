package com.example.android.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by AMJAD on 26/8/‏2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_place, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentWord = getItem(position);

        TextView nameOfPlace = (TextView) listItemView.findViewById(R.id.place_name_text_view);
        if (currentWord.getPlaceName().isEmpty()) {
            nameOfPlace.setVisibility(View.GONE);
        } else {
            nameOfPlace.setText(currentWord.getPlaceName());
        }

        TextView addressOfPlace = (TextView) listItemView.findViewById(R.id.place_address_text_view);
        if (currentWord.getPlaceAddress().isEmpty()) {
            addressOfPlace.setVisibility(View.GONE);
        } else {
            addressOfPlace.setText(currentWord.getPlaceAddress());
        }

        TextView phoneNumberOfPlace = (TextView) listItemView.findViewById(R.id.phone_number_text_view);
        if (currentWord.getPlacePhoneNumber().isEmpty()) {
            phoneNumberOfPlace.setVisibility(View.GONE);
        } else {
            phoneNumberOfPlace.setText(currentWord.getPlacePhoneNumber());
        }

        TextView reviewsOfPlace = (TextView) listItemView.findViewById(R.id.place_reviews_text_view);
        if (currentWord.getPlaceReviews().isEmpty()) {
            reviewsOfPlace.setVisibility(View.GONE);
        } else {
            reviewsOfPlace.setText(currentWord.getPlaceReviews());
        }

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_place);
        // Check if an image is provided for this place or not
        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentWord.getpImageResourceId());
        }

        // Return the whole list item layout
        return listItemView;
    }

}
