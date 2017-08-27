package com.example.android.tourguideapp;


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
public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();

        String[] place_one = getResources().getStringArray(R.array.Hotel_du_Louvre);
        places.add(new Place(place_one[0], place_one[1], place_one[2], place_one[3],
                R.drawable.hotel_hotel_du_louvre));

        String[] place_two = getResources().getStringArray(R.array.Maison_Souquet);
        places.add(new Place(place_two[0], place_two[1], place_two[2], place_two[3],
                R.drawable.hotel_maison_souquet));

        String[] place_three = getResources().getStringArray(R.array.Le_Narcisse_Blanc_Hotel_and_Spa);
        places.add(new Place(place_three[0], place_three[1], place_three[2], place_three[3],
                R.drawable.hotel_le_narcisse_blanc_hotel_spa));

        String[] place_four = getResources().getStringArray(R.array.Le_Bristol_Paris);
        places.add(new Place(place_four[0], place_four[1], place_four[2], place_four[3],
                R.drawable.hotel_le_bristol_paris));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        return listView;
    }

}
