package com.example.tarea4navegacinconfragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;


public class GreenFragment extends Fragment {

    public GreenFragment() {
        // Constructor vacío
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflar el layout correspondiente para este fragmento
        View view = inflater.inflate(R.layout.fragment_green, container, false);
        return view;
    }
}
