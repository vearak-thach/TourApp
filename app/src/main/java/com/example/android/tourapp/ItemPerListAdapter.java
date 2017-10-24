package com.example.android.tourapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.tourapp.R.id.imageView;

/**
 * Created by vearak.thach on 9/8/2017.
 */

public class ItemPerListAdapter extends ArrayAdapter<ItemPerList> {
    public ItemPerListAdapter(Activity context, ArrayList<ItemPerList> itemPerLists) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, itemPerLists);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link ItemPerList} object located at this position in the list
        ItemPerList currentItemInfo = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID item_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.item_name);
        // Get the version name from the current name object and
        // set this text on the name TextView
        nameTextView.setText(currentItemInfo.getItemText());

        //Find the ImageView in the list_item.xml layout with the ID imageView
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);
        // Get the version name from the current name object and
        // set this image
        imageView.setImageResource(currentItemInfo.getItemImage());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
