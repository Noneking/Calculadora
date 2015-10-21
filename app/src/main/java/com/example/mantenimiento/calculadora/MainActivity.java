package com.example.mantenimiento.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText editTextUno;
    private EditText editTextDos;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void accion(View v)
    {
        editTextUno= (EditText) findViewById(R.id.editTextUno);
        editTextDos= (EditText) findViewById(R.id.editTextDos);
        textViewResultado= (TextView) findViewById(R.id.textViewResultado);

        Double firstData= Double.parseDouble(editTextUno.getText().toString());
        Double secondData= Double.parseDouble(editTextDos.getText().toString());
        Double resultado=0.0;

        switch(v.getId())
        {
            case R.id.buttonMas:
                resultado=firstData+secondData;
                break;
            case R.id.buttonMenos:
                resultado=firstData-secondData;
                break;
            case R.id.buttonMultiplicacion:
                resultado=firstData*secondData;
                break;
            case R.id.buttonDivision:
                resultado=firstData/secondData;
                break;
        }
        textViewResultado.setText(String.valueOf(resultado));
    }

}
