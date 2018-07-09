package com.comabernices.comabernices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public Spinner hostSpinner;
    public EditText celebrityEditText;

    public void addItemsOnHostSpinner() {

        hostSpinner = (Spinner) findViewById(R.id.hostSpinner);
        List<String> list = new ArrayList<String>();
        list.add("Conan O' Brien");
        list.add("Jimmy Fallon");
        list.add("Jimmy Kimmel");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hostSpinner.setAdapter(dataAdapter);
    }

    public void showVideos(View view) {

        hostSpinner = (Spinner) findViewById(R.id.hostSpinner);
        celebrityEditText = (EditText) findViewById(R.id.celebrityEditText);
        Toast.makeText(this, hostSpinner.getSelectedItem().toString() + " - " +
                celebrityEditText.getText(), Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addItemsOnHostSpinner();
    }
}
