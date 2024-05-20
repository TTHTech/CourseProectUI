package com.example.courseui;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CartFragment extends Fragment {



    public CartFragment(){

    }
    public void onAttach(@NonNull Context context){
        super.onAttach(context);
        Log.e("course","Cart");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.e("course","Reload Cart");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cart, container, false);
    }
}