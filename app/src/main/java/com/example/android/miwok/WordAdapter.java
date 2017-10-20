package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

/**
 * Created by Hp on 15-09-2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int ColorResourceId;
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentAndroidFlavor = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentAndroidFlavor.getMiwokTransalation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.english_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentAndroidFlavor.getDefaultTranslation());

        // Return the whole list item layout (containing 2 TextViews )
        // so that it can be shown in the ListView
        ImageView imageDisplay = (ImageView) listItemView.findViewById(R.id.image);
        if(currentAndroidFlavor.hasImage()) {
            imageDisplay.setImageResource(currentAndroidFlavor.getImageResourceId());
            imageDisplay.setVisibility(View.VISIBLE);
        }
        else
         imageDisplay.setVisibility(View.GONE);

        View textcontainer= listItemView.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),ColorResourceId);
        textcontainer.setBackgroundColor(color);
        return listItemView;
    }

    public  WordAdapter(Context context, ArrayList<Word> words, int colorID){
        super(context,0,words);
        ColorResourceId=colorID;
    }

}
