package com.jdcasas.lab_6_1act1;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Usuario on 10/10/2016.
 */
public class Izquierda extends Fragment {
    View rootView;
    Button boton;
    EditText campo;
    enviarMensaje EM;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate (R.layout.izquierdo, container, false);
        campo = (EditText) rootView.findViewById(R.id.editTxt);
        boton = (Button) rootView.findViewById(R.id.boton_izquierdo);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje;
                mensaje = campo.getText().toString();
                EM.enviarDatos(mensaje);
            }
        });

        return rootView;
    }

    public void onAttach(Context context){
        super.onAttach(getActivity());
        try{
            EM = (enviarMensaje) getActivity();
        } catch (ClassCastException e) {
            throw new ClassCastException ("Necesitas implementar mensaje");
        }
    }

}
