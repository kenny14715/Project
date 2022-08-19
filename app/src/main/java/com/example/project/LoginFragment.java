package com.example.project;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginFragment extends Fragment {

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        Button btnRegister, btnLogin;
        EditText loginAcc, loginPwd;
        btnRegister = view.findViewById(R.id.btnRegister);
        btnLogin = view.findViewById(R.id.btnLogin);
        loginAcc = view.findViewById(R.id.loginAcc);
        loginPwd = view.findViewById(R.id.loginPwd);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController controller = Navigation.findNavController(v);
                controller.navigate(R.id.action_loginFragment_to_registerFragment);
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Account account = MainActivity.accDatabase.getAccDao().findByName(loginAcc.getText().toString(), loginPwd.getText().toString());
                NavController controller = Navigation.findNavController(v);
                if(account != null){
                    //Toast.makeText(getActivity(),"",Toast.LENGTH_SHORT).show();
                    Toast.makeText(getActivity(),"密碼匹配",Toast.LENGTH_SHORT).show();
                    controller.navigate(R.id.action_loginFragment_to_guideFragment);
                }
            }
            /*
            public void onClick(View v) {
                Account account = MainActivity.accDatabase.getAccDao().findByName(loginAcc.getText().toString());
                NavController controller = Navigation.findNavController(v);
                if(account != null){
                    //Toast.makeText(getActivity(),"",Toast.LENGTH_SHORT).show();
                    if(account.getPwd() == loginPwd.getText().toString()){
                        Toast.makeText(getActivity(),"密碼匹配",Toast.LENGTH_SHORT).show();
                        controller.navigate(R.id.action_loginFragment_to_mainFragment);
                    }
                }
            }

             */
        });
        return view;
    }
/*
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button buttonRegister;
        buttonRegister = getView().findViewById(R.id.buttonRegister);
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavController controller = Navigation.findNavController(view);
                controller.navigate(R.id.action_loginFragment_to_registerFragment);
            }
        });
    }

 */
}