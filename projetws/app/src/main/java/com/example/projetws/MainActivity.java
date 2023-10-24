package com.example.projetws;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import com.example.projetws.beans.Etudiant;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Création d'une liste d'étudiants (exemple)
        ArrayList<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant(1, "John", "Doe", "New York", "Homme"));
        etudiants.add(new Etudiant(2, "Jane", "Smith", "Los Angeles", "Femme"));

        // Création d'un adaptateur personnalisé pour afficher les étudiants dans la ListView
        ArrayAdapter<Etudiant> adapter = new ArrayAdapter<>(this, R.layout.item, R.id.textViewNomPrenom, etudiants);
        setListAdapter(adapter);
    }
}
