package br.edu.ifpe.sepse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ComoSaber_res3Activity extends DebugActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.como_saber_res3);

        final TextView tv_pontuacao_res3 = (TextView) findViewById(R.id.tv_pontuacao_res3);
        tv_pontuacao_res3.setText(Integer.toString(somatorio));

        Button btAnt = (Button) findViewById(R.id.bt_ant_como_saber_res3);

        btAnt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent (getBaseContext(), ComoSaber7Activity.class);
                startActivity(intent);
            }});

        Button btProx = (Button) findViewById(R.id.bt_prox_como_saber_res3);

        btProx.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent (getBaseContext(), Inicio.class);;
                startActivity(intent);
            }});
    }
}
