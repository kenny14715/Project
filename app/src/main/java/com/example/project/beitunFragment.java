package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class beitunFragment extends Fragment {

    public beitunFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_beitun, container, false);
        Button btngoogle3,btnbike3;
        btngoogle3 = view.findViewById(R.id.googlemapbtn3);
        btngoogle3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController controller = Navigation.findNavController(v);
                controller.navigate(R.id.action_beitunFragment_to_minimapFragment);
            }
        });
        btnbike3= view.findViewById(R.id.btnbike3);
        btnbike3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController controller = Navigation.findNavController(v);
                controller.navigate(R.id.action_beitunFragment_to_bike_stopsFragment);
            }
        });
        return view;
    }
}
