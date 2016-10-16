package com.jdcasas.lab_6_1act1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v4.app.Fragment;

/**
 * Created by Usuario on 10/10/2016.
 */

public class Derecha extends Fragment {

    View rootView;
    TextView txt;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate (R.layout.derecho, container, false);
        txt = (TextView) rootView.findViewById(R.id.textView2);
        return rootView;
    }

    public void obtenerDatos(String mensaje){
        txt.setText(mensaje);
    }
}
