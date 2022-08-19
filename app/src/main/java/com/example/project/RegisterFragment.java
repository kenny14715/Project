package com.example.project;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.Room;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;


public class RegisterFragment extends Fragment{


    private EditText text_name, text_phoneNumber, text_email, text_account, text_password, text_confirmPassword;
    private Button registerConfirm;
    public RegisterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_register, container, false);
        text_phoneNumber = view.findViewById(R.id.phoneNumber);
        text_email = view.findViewById(R.id.email);
        text_account = view.findViewById(R.id.account);
        text_name = view.findViewById(R.id.name);
        text_password = view.findViewById(R.id.password);
        text_confirmPassword = view.findViewById(R.id.confirmPassword);
        registerConfirm = view.findViewById(R.id.registerConfirm);
        registerConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = text_name.getText().toString();
                String phone = text_phoneNumber.getText().toString();
                String email = text_email.getText().toString();
                String account = text_account.getText().toString();
                String password = text_password.getText().toString();

                Account newAccount = new Account();
                newAccount.setUsername(name);
                newAccount.setPhone(phone);
                newAccount.setEmail(email);
                newAccount.setAcc(account);
                newAccount.setPwd(password);

                MainActivity.accDatabase.getAccDao().insertAccs(newAccount);
                Toast.makeText(getActivity(),"註冊成功",Toast.LENGTH_SHORT).show();

                text_phoneNumber.setText("");
                text_email.setText("");
                text_account.setText("");
                text_name.setText("");
                text_password.setText("");
                text_confirmPassword.setText("");
            }
        });
        return view;
    }



    /*
    text_name = getView().findViewById(R.id.name);
        text_phoneNumber = getView().findViewById(R.id.phoneNumber);
        text_email = getView().findViewById(R.id.email);
        text_account = getView().findViewById(R.id.account);
        text_password = getView().findViewById(R.id.password);
        text_confirmPassword = getView().findViewById(R.id.confirmPassword);
        registerConfirm = getView().findViewById(R.id.registerConfirm);
        registerConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //account.getText().toString(),password.getText().toString(),phoneNumber.getText().toString(),email.getText().toString(),name.getText().toString()
                String name, phone, email, account, password;
                name = text_account.getText().toString();
                phone = text_phoneNumber.getText().toString();
                email = text_email.getText().toString();
                account = text_account.getText().toString();
                password = text_password.getText().toString();
                Account newAccount = new Account(account,password,phone,email,name);

                //accDao.insertAccs(newAccount);
            }
        });
     */

}