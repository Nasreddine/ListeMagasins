package com.sc.listeMagasins;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    private ArrayList<Magasin>  magasins;
    MagasinAdapter adapter;

    ListView listview;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.sc.listeMagasins.R.layout.activity_main);

        ListView listview = (ListView) findViewById(com.sc.listeMagasins.R.id.listView);

        magasins = Magasin.getAllMagasins();

        adapter = new MagasinAdapter(this, magasins);
        listview.setAdapter(adapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }




}
