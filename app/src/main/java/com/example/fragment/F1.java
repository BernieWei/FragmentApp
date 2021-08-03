package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class F1 extends Fragment {
    private  View mainView;
    private TextView mesg;
    private String showMesg;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mainView = inflater.inflate(R.layout.fragment_f1, container, false);
        mesg = mainView.findViewById(R.id.mesg);
        mesg.setText(showMesg);
        return mainView;
    }
    public void setMesg(String strMesg) {
        Log.v("Bernie",strMesg);
        showMesg = strMesg;
    }
}