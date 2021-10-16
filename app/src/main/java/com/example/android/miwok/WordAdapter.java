package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    private final int mColorResourceID;

    public WordAdapter(@NonNull Context context, @NonNull List<Word> objects, int colorResourceID) {
        super(context, 0, objects);
        mColorResourceID = colorResourceID;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View lisTItemView = convertView;
        if (lisTItemView == null){
            lisTItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);

        TextView defaultTextView = (TextView) lisTItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        TextView miwokTextView = (TextView) lisTItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        ImageView imageView = (ImageView) lisTItemView.findViewById(R.id.image);
        if (currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        } else{
            imageView.setVisibility(View.GONE);
        }

        View textContainer = lisTItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        textContainer.setBackgroundColor(color);
        
        return lisTItemView;
    }
}
