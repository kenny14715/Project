package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class GuideFragment extends Fragment {

    public GuideFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_guide, container, false);
        Button btnSearch,btnXitun,btnNantun,btnBeitun;
        btnSearch = view.findViewById(R.id.gotosearch_btn);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController controller = Navigation.findNavController(v);
                controller.navigate(R.id.action_guideFragment_to_searchFragment);
            }
        });
        btnBeitun = view.findViewById(R.id.goto_beitun);
        btnBeitun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController controller = Navigation.findNavController(v);
                controller.navigate(R.id.action_guideFragment_to_beitunFragment);
            }
        });
        btnXitun = view.findViewById(R.id.goto_xitun);
        btnXitun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController controller = Navigation.findNavController(v);
                controller.navigate(R.id.action_guideFragment_to_xitunFragment);
            }
        });
        btnNantun= view.findViewById(R.id.goto_nantun);
        btnNantun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController controller = Navigation.findNavController(v);
                controller.navigate(R.id.action_guideFragment_to_nantunFragment);
            }
        });
        return view;
    }
}
