package com.example.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class F2 extends Fragment {
    private View mainView;
    private MainActivity mainActivity;
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mainActivity = (MainActivity)context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mainView = inflater.inflate(R.layout.fragment_f2, container, false);
        Button f2btn = mainView.findViewById(R.id.F2BTN);
        f2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                test1();
            }
        });
        return mainView;
    }
    private void test1() {
        Log.v("Bernie","Click");
        mainActivity.GetF1().setMesg("Lottery:" + (int)(Math.random()*49+1));
    }
}