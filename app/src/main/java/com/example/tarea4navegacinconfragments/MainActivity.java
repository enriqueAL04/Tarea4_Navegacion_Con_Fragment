package com.example.tarea4navegacinconfragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar el BottomNavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Obtener el FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Configurar el fragmento inicial
        fragmentManager.beginTransaction()
                .replace(R.id.fragment_container, new com.example.tarea4navegacinconfragments.RedFragment()) // Colocamos el fragmento inicial (Rojo)
                .commit();

        // Configurar el listener para el BottomNavigationView
        bottomNavigationView.setOnItemSelectedListener(item -> {
            Fragment selectedFragment = null;

            // Lógica de navegación entre los fragmentos
            if (item.getItemId() == R.id.nav_red) {
                selectedFragment = new com.example.tarea4navegacinconfragments.RedFragment();
            } else if (item.getItemId() == R.id.nav_blue) {
                selectedFragment = new com.example.tarea4navegacinconfragments.BlueFragment();
            } else if (item.getItemId() == R.id.nav_green) {
                selectedFragment = new com.example.tarea4navegacinconfragments.GreenFragment();
            }

            // Reemplazar el fragmento
            if (selectedFragment != null) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.fragment_container, selectedFragment); // Reemplaza el fragmento actual
                transaction.addToBackStack(null); // Añadir a la pila de retroceso para permitir la navegación hacia atrás
                transaction.commit();
            }

            return true; // Indicar que el ítem fue seleccionado correctamente
        });
    }
}
