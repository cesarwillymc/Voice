package com.example.willy.voice.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.willy.voice.R;
import com.example.willy.voice.adapters.Adapter_list;

import java.util.ArrayList;


public class Perfil extends Fragment {
    ListView lista;
    ArrayList<String> nombres;
    ArrayAdapter<String> adaptador;
    Adapter_list myAdapter;
    private int incrementador=0;

    public Perfil() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_perfil, container, false);
        lista = (ListView)view.findViewById(R.id.list);
        // ASIGNAMOS VALORES PARA EL ARRAY LIST
        nombres = new ArrayList<String>();
        nombres.add("Nombre  :   "+"Juanito ");
        nombres.add("Apellido:   "+"Alchachofa R.");
        nombres.add("Area    :   "+"Logistica");
        nombres.add("Puesto  :   "+"Empleado");
        // CREAMOS UN ADAPTADOR CON EL CONTEXTO, EL LAYAUT DE ANDROID, Y EL ARRAY ANTES CREADO
        // adaptador = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,nombres);
        //ADAPTADOR PERSONALIZADO
        myAdapter= new Adapter_list(getContext(),R.layout.list_view_new,nombres);
        //ASIGNAMOS QUE EL LISTVIEW  ES EL ADAPTADOR
        // lista.setAdapter(adaptador);
        lista.setAdapter(myAdapter);
        /*lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this,"Palabra: "+nombres.get(position),Toast.LENGTH_SHORT).show();
            }
        });*/
        registerForContextMenu(lista);
        return view;
    }

}
