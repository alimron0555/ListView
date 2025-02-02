package com.example.praktekcustomlistview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import java.util.List;

public class MovieAdapter extends ArrayAdapter<Movie> {
private  Context mContext;
private int mResource;

    public MovieAdapter(@NonNull Context context, int resource, @NonNull List<Movie> objects) {
        super(context, resource, objects);
        this.mContext = mContext;
        this.mResource = mResource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String movieTitle = getItem(position).getTitle().toString();
        String movieYear = getItem(position).getYear().toString();

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource,parent, false);
        TextView textMovie = convertView.findViewById(R.id.textTitle);
        TextView txtYear = convertView.findViewById(R.id.textYear);

        textMovie.setText(movieTitle);
        txtYear.setText(movieYear);

        return convertView;
        
    }
}


