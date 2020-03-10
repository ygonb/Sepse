package com.example.ygo.sepse;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SaibaMais extends DebugActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saiba_mais);


       // Button btProx = (Button) findViewById(R.id.bt_prox_saiba_mais);

        //btProx.setOnClickListener(new View.OnClickListener(){
        //    public void onClick (View view){
        //        Intent intent = new Intent (getBaseContext(), Inicio.class);;
        //        startActivity(intent);
        //    }});
    }
}
