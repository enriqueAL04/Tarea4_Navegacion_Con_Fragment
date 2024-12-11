package com.example.tarea4navegacinconfragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

import com.example.tarea4navegacinconfragments.R;

public class BlueFragment extends Fragment {

    public BlueFragment() {
        // Constructor vacío
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflar el layout correspondiente para este fragmento
        View view = inflater.inflate(R.layout.fragment_blue, container, false);
        return view;
    }
}
