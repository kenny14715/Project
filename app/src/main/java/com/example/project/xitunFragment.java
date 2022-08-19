package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class xitunFragment extends Fragment {

    public xitunFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_xitun, container, false);
        Button btngoogle1,btnbike1;
        btngoogle1= view.findViewById(R.id.googlemapbtn1);
        btngoogle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController controller = Navigation.findNavController(v);
                controller.navigate(R.id.action_xitunFragment_to_minimapFragment);
            }
        });
        btnbike1= view.findViewById(R.id.btnbike1);
        btnbike1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController controller = Navigation.findNavController(v);
                controller.navigate(R.id.action_xitunFragment_to_bike_stopsFragment);
            }
        });
        return view;
    }
}
