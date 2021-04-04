package com.example.mymovies;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class movie1 extends Fragment
{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_movie1, container, false);
        Button button = (Button) view.findViewById(R.id.addcart);
        Button back = (Button) view.findViewById(R.id.cancel);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Snackbar sb = Snackbar.make(view,"Ticket booked successfully",Snackbar.LENGTH_LONG);
                sb.show();
            }
        });
        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Snackbar sb = Snackbar.make(view,"Under Maintenance",Snackbar.LENGTH_LONG);
                sb.show();
            }
        });
        return view;
    }

}