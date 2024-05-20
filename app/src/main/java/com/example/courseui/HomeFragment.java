package com.example.courseui;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.e("course","Reload Home");
    }
    public void onAttach(@NonNull Context context){
        super.onAttach(context);
        Log.e("course","Home");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}