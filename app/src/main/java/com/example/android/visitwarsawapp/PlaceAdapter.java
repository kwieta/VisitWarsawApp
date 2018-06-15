package com.example.android.visitwarsawapp;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Place} objects.
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * Resource ID for the background color for this list of words
     */
    private int mColorResourceId;

    /**
     * Create a new {@link PlaceAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param places          is the list of {@link Place}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of places
     */
    public PlaceAdapter(Context context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID customList_textView_placename.
        TextView placenameTextView = listItemView.findViewById(R.id.customList_textView_placename);
        // Get the place name from the currentPlace object and set this text on
        // the place name TextView.
        placenameTextView.setText(currentPlace.getPlaceNameID());
        // Find the TextView in the list_item.xml layout with the ID customList_textView_placeaddress.
        TextView placeaddressTextView = listItemView.findViewById(R.id.customList_textView_placeaddress);
        // Get the place address from the currentPlace object and set this text on
        // the place address TextView.
        placeaddressTextView.setText(currentPlace.getPlaceAddressID());
        // Find the TextView in the list_item.xml layout with the ID customList_textView_placedescription.
        TextView placedescriptionTextView = listItemView.findViewById(R.id.customList_textView_placedescription);
        // Get the place description from the currentPlace object and set this text on
        // the place description TextView.
        placedescriptionTextView.setText(currentPlace.getPlaceDescriptionID());
        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = listItemView.findViewById(R.id.image);
        // Check if an image is provided for this place or not
        if (currentPlace.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentPlace.getPlacePhotoID());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        // Return the whole list item layout (containing 3 TextViews and an image) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}