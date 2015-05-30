package com.example.fadheelahdaham.courses;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends Activity {

    Spinner spinner;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner= (Spinner) findViewById(R.id.spinner);
        text= (TextView) findViewById(R.id.textView);
        ArrayAdapter <CharSequence> adapter= ArrayAdapter.createFromResource(this, R.array.course,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new function());

    }

    private class function implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View arg1, int pos, long id) {


            String str= parent.getItemAtPosition(pos).toString();
            text.setText(str);

        }

        @Override
        public void onNothingSelected(AdapterView<?> arg0) {

        }

    }
}
