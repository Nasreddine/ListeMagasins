package com.sc.listeMagasins;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    private ArrayList<Magasin> magasins;
    MagasinAdapter adapter;

    ListView listeMagasinView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.sc.listeMagasins.R.layout.activity_main);

        ListView listeMagasinView = (ListView) findViewById(com.sc.listeMagasins.R.id.listView);

        magasins = Magasin.getAllMagasins();

        adapter = new MagasinAdapter(this, magasins);
        listeMagasinView.setAdapter(adapter);


        listeMagasinView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Un exemple pour récupérer liberllé d'un produit
                //TODO: à faire ce traitement pour pour l'affichage des achat en groupe
                ArrayList<AchatGroupe> achatGroupes = Magasin.getAllAchatGroupe(1);
                AchatGroupe achatGroupe = achatGroupes.get(0);
                String libelle =  achatGroupe.getPromotion().getProduit().getLibelle();
                Toast.makeText(MainActivity.this,"libelle d'un produit:"+ libelle , Toast.LENGTH_SHORT).show();

            }
        });
    }


}
