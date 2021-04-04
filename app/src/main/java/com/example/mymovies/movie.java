package com.example.mymovies;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class movie extends AppCompatActivity {

    TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        name = (TextView) findViewById(R.id.iceType);
        name.setText("BookmyMovie");
        loadFragment(new Fragment_movie());
    }

    public void mango_click(View v)
    {
        name.setText("Harry Potter");
        loadFragment(new movie1());
    }


    public void home_click(View v)
    {
        name.setText("My Movies List");
        loadFragment(new Fragment_movie());
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.ice_view,fragment);
        fragmentTransaction.commit();
    }

    public void mr_click(View view) {
        name.setText("Maze Runner");
        loadFragment(new movie2());
    }
}
