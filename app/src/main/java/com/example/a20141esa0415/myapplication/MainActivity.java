package com.example.a20141esa0415.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //EditText editText = (EditText) findViewById(R.id.editText);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // variaveis locais ao metodo e somente podem ser visualizadas aqui
        //String emailUsuario;
        //emailUsuario = String.valueOf(editText.getText());

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void topClick(View v){
        Toast.makeText(this, "Top button clicked",
                Toast.LENGTH_SHORT).show();
        Log.i("info","The user clicked the top button");
    }
    public void bottomClick(View v){
        Toast.makeText(this, "Bottom button clicked",
                Toast.LENGTH_SHORT).show();
        Log.i("info","The user clicked the bottom button");
    }

}
