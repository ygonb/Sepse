package com.example.ygo.sepse;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static com.example.ygo.sepse.R.id.bt_ant_como_saber6;
import static com.example.ygo.sepse.R.id.bt_prox_como_saber6;
import static com.example.ygo.sepse.R.id.rg_6;
import static com.example.ygo.sepse.R.id.tv_pontuacao6;
import static com.example.ygo.sepse.R.layout.como_saber_6;

public class ComoSaber6Activity extends DebugActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(como_saber_6);

        final TextView tv_pontuacao6 = (TextView) findViewById(R.id.tv_pontuacao6);
        final RadioGroup grupo6 = (RadioGroup) findViewById(rg_6);
        final RadioButton rb_sim6 = (RadioButton) findViewById(R.id.rb_sim6);
        final RadioButton rb_nao6 = (RadioButton) findViewById(R.id.rb_nao6);
        tv_pontuacao6.setText(Integer.toString(pontuacao5));

        grupo6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup grupo6, int checkedId){
                boolean sim = R.id.rb_sim6==checkedId;
                boolean nao = R.id.rb_nao6==checkedId;

                if (sim){
                    Log.i(TAG,"Sim "+checkedId);
                    pontuacao6 = pontuacao5 + 10;
                    tv_pontuacao6.setText(Integer.toString(pontuacao6));
                } else if (nao){
                    Log.i(TAG,"Nao "+checkedId);
                    pontuacao6 = pontuacao5;
                    tv_pontuacao6.setText(Integer.toString(pontuacao6));
                }
            }});

        Button btAnt = (Button) findViewById(bt_ant_como_saber6);

        btAnt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent (getBaseContext(), ComoSaber5Activity.class);
                startActivity(intent);
            }});

        Button btProx = (Button) findViewById(bt_prox_como_saber6);

        btProx.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                if (rb_sim6.isChecked()||rb_nao6.isChecked()){
                    Intent intent = new Intent (getBaseContext(), ComoSaber7Activity.class);
                    startActivity(intent);}
            }});
    }
}
