package com.singularity.thetranslator;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    WordAdapter(Activity context, ArrayList<Word> androidFlavors, int colorResourceId) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.

        super(context, 0, androidFlavors);
        mColorResourceId = colorResourceId;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view

        View listItemView = convertView;

        if (listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }


        // Get the {@link AndroidFlavor} object located at this position in the list

        Word w = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.englishTextView);

        nameTextView.setText( w.getDefaultTranslation());


        TextView numberTextView = listItemView.findViewById(R.id.hindiTextView);

        numberTextView.setText(w.getHindiTranslation());

        ImageView imageView = listItemView.findViewById(R.id.image);
        if (w.hasImage()) {
            imageView.setImageResource(w.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);

        } else {
            imageView.setVisibility(View.GONE);

        }
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;

    }
}
