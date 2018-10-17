package com.mcerbauskas.demoapp;

import android.support.v7.app.AppCompatActivity; //makes sure it's backwards compatible with older versions
import android.os.Bundle;
import android.util.Log;
import android.view.View; //galima addint naudojant alt+enter
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity { // this will add some code to AppCompatActivity

    
    //method when the button is clicked
    public void clickFunction(View view)  // View means this is called by a view (anything displayed on the phone screen), "view" yra View pavadinimas
    {
        
        //search through all id's and find the myTextField id
        // (EditText) converts View into Edit Text
        EditText myTextField = (EditText) findViewById(R.id.myTextField); //text field is a type of Edit Text (myTextField doesn't have to match, but it's recommended)
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);

        //toast - text pops up from bottom and then dissapears
        Toast.makeText(MainActivity.this,"Hi there, " + myTextField.getText().toString(), Toast.LENGTH_SHORT).show();

        //to put information in the Logs (information) when button pressed
        Log.i("Info", myTextField.getText().toString()); //is Edit Text pasiimame teksta ir konvertuojame i string'a
        Log.i ("Info", myTextField2.getText().toString());

    }

    @Override // means that we are adding some code to onCreate function (cuz it's already created)
    protected void onCreate(Bundle savedInstanceState) {  //protected - only accesable within this package, void - does some stuff, doesn't return anything
        super.onCreate(savedInstanceState); // if there's a saved state within the user's phone it will restore that
        setContentView(R.layout.activity_main); //R - resources, layout - layoutas package'e, linking MainActivity to activity_main.xml
    }
}
