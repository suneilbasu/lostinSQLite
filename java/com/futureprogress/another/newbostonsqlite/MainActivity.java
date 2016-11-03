package com.futureprogress.another.newbostonsqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText userInput;
    EditText userColour;
    TextView records_TextView;
    MyDBHandler dbHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInput = (EditText) findViewById(R.id.user_Input);
        userColour = (EditText) findViewById(R.id.user_Colour);
        records_TextView = (TextView) findViewById(R.id.records_TextView);
        dbHandler = new MyDBHandler(this, null, null, 1);
        printDatabase();
    }

    public void addButtonClicked(View view) {
        Products product = new Products();
        dbHandler.addProduct(product);
        printDatabase();
    }

    public void deleteButtonClicked(View view) {
        String inputText = userInput.getText().toString();
        dbHandler.deleteProduct(inputText);
        printDatabase();
    }

     public void printDatabase(){
         String dbString = dbHandler.databaseToString();
         records_TextView.setText(dbString);
         userInput.setText("");
         userColour.setText("");

    }
}
