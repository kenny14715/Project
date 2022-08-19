package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class nantunFragment extends Fragment {

    public nantunFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nantun, container, false);
        Button btngoogle2,btnbike2;
        btngoogle2 = view.findViewById(R.id.googlemapbtn2);
        btngoogle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController controller = Navigation.findNavController(v);
                controller.navigate(R.id.action_nantunFragment_to_minimapFragment);
            }
        });
        btnbike2= view.findViewById(R.id.btnbike2);
        btnbike2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController controller = Navigation.findNavController(v);
                controller.navigate(R.id.action_nantunFragment_to_bike_stopsFragment);
            }
        });
        return view;
    }
}
