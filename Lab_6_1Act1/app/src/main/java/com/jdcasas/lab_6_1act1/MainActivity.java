package com.jdcasas.lab_6_1act1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity  implements enviarMensaje {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_buscar:
                Toast.makeText(MainActivity.this, "Buscar", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_nuevo:
                Toast.makeText(MainActivity.this, "Nuevo", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_add1:
                Toast.makeText(MainActivity.this, "Adicional1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_add2:
                Toast.makeText(MainActivity.this, "Adicional2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_add3:
                Toast.makeText(MainActivity.this, "Adicional3", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

    @Override
    public void enviarDatos(String mensaje) {
        Derecha derecha = (Derecha) getSupportFragmentManager().findFragmentById(R.id.derecho);
        derecha.obtenerDatos(mensaje);
    }
}
