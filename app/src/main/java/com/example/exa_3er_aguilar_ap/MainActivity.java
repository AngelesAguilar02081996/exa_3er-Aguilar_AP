package com.example.exa_3er_aguilar_ap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button  btnAudioVideo;


    @Override
    protected void onCreate(Bundle savedInstanceState) { //Inicia metodo onCl¿reate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAudioVideo=findViewById(R.id.btnAudioVideo);

        //LLamo al login
        //Intent AbrirLogin= new Intent(MainActivity.this,Login.class);
        //startActivity(AbrirLogin);
        //finish();

        btnAudioVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AbrirAudioVideo= new Intent(view.getContext(),AudioVideo.class);
                startActivity(AbrirAudioVideo);
            }
        });
    } //Termina el metodo onCreate


}