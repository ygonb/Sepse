package com.example.ygo.sepse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.ygo.sepse.R.id.bt_ant_como_saber_res2;
import static com.example.ygo.sepse.R.id.bt_prox_como_saber_res2;
import static com.example.ygo.sepse.R.id.tv_pontuacao_res2;
import static com.example.ygo.sepse.R.layout.como_saber_res2;

public class ComoSaber_res2Activity extends DebugActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(como_saber_res2);

        final TextView tv_pontuacao_res2 = (TextView) findViewById(R.id.tv_pontuacao_res2);
        tv_pontuacao_res2.setText(Integer.toString(somatorio));

        Button btAnt = (Button) findViewById(bt_ant_como_saber_res2);

        btAnt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent (getBaseContext(), ComoSaber7Activity.class);
                startActivity(intent);
            }});

        Button btProx = (Button) findViewById(bt_prox_como_saber_res2);

        btProx.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent (getBaseContext(), Inicio.class);;
                startActivity(intent);
            }});
    }
}
