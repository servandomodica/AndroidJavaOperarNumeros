package com.example.proyectospinner;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText et1,et2;
	Spinner spinner1;
	TextView tv1;
	
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.editText1);
        et2=(EditText)findViewById(R.id.editText2);
        spinner1=(Spinner)findViewById(R.id.spinner1);
        tv1=(TextView)findViewById(R.id.textView1);
        
    	String [] operaciones={"Sumar","Restar","Multiplicar","Dividir"};
        ArrayAdapter <String> adaptador1=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, operaciones);
        spinner1.setAdapter(adaptador1);
    }
    
    public void operar (View v) {
    	String s1=et1.getText().toString();
    	int v1=Integer.parseInt(s1);
    	String s2=et2.getText().toString();
    	int v2=Integer.parseInt(s2);
    	
    	String opcion=spinner1.getSelectedItem().toString();
    	
    	if (opcion.equals("Sumar")) {
    		int suma=v1+v2;
    		tv1.setText("La suma es: "+suma);
    	}
    	if (opcion.equals("Restar")) {
    		int resta=v1-v2;
    		tv1.setText("La resta es: "+resta);
    	}
    	if (opcion.equals("Multiplicar")) {
    		int multi=v1*v2;
    		tv1.setText("La multiplicación es: "+multi);
    	}
    	if (opcion.equals("Dividir")) {
    		float divi=(float)v1/v2;
    		tv1.setText("La división es: "+divi);
    	}
    }
   
}
