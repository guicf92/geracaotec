package com.example.aula01;

import android.app.Activity;
import android.os.Bundle;
import android.renderscript.Sampler.Value;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	EditText primeiroNumero;
	EditText segundoNumero;
	EditText resultado;
	Button cancular;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        primeiroNumero = (EditText) findViewById(R.id.editText1);
        segundoNumero = (EditText) findViewById(R.id.editText2);
        resultado =  (EditText) findViewById(R.id.editText3);
        cancular = (Button) findViewById(R.id.button1);
        
    
        cancular.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			 
				float a =  Float.parseFloat(primeiroNumero.getText().toString());
				float b =  Float.parseFloat(segundoNumero.getText().toString());
				float result = a*b;
				resultado.setText(""+result);
				
			}
		});
        
        
    }
}
