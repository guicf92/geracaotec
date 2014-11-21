package com.example.aula02_radiobutton;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;


public class MainActivity extends ActionBarActivity {

	EditText primeiroNumero;
	EditText segundoNumero;
	EditText resultado;
	Button cancular;
	RadioGroup radiogroup;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        primeiroNumero = (EditText) findViewById(R.id.editText1);
        segundoNumero = (EditText) findViewById(R.id.editText2);
        resultado =  (EditText) findViewById(R.id.editText3);
        cancular = (Button) findViewById(R.id.button1);
        
        radiogroup = (RadioGroup) findViewById(R.id.radioGroup1);
        
        cancular.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			 
				float a =  Float.parseFloat(primeiroNumero.getText().toString());
				float b =  Float.parseFloat(segundoNumero.getText().toString());
				
				float result = 0;
				switch (radiogroup.getCheckedRadioButtonId()) {
				case R.id.radio0:
					result=a+b;
					break;
					
				case R.id.radio1:
					result=a-b;
					break;
				case R.id.radio2:
					result=a*b;
					break;
				case R.id.radio3:
					result=a/b;
					break;
				default:
					break;
				}
				
				resultado.setText(""+result);
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
