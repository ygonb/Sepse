package com.example.ygo.sepse;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ComoSaber5Activity extends DebugActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.como_saber_5);

        final TextView tv_pontuacao5 = (TextView) findViewById(R.id.tv_pontuacao5);
        final RadioGroup grupo5 = (RadioGroup) findViewById(R.id.rg_5);
        final RadioButton rb_sim5 = (RadioButton) findViewById(R.id.rb_sim5);
        final RadioButton rb_nao5 = (RadioButton) findViewById(R.id.rb_nao5);
        tv_pontuacao5.setText(Integer.toString(pontuacao4));

        grupo5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup grupo5, int checkedId){
                boolean sim = R.id.rb_sim5==checkedId;
                boolean nao = R.id.rb_nao5==checkedId;

                if (sim){
                    Log.i(TAG,"Sim "+checkedId);
                    pontuacao5 = pontuacao4 + 10;
                    tv_pontuacao5.setText(Integer.toString(pontuacao5));
                } else if (nao){
                    Log.i(TAG,"Nao "+checkedId);
                    pontuacao5 = pontuacao4;
                    tv_pontuacao5.setText(Integer.toString(pontuacao5));
                }
            }});


        Button btAnt = (Button) findViewById(R.id.bt_ant_como_saber5);

        btAnt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent (getBaseContext(), ComoSaber4Activity.class);
                startActivity(intent);
            }});

        Button btProx = (Button) findViewById(R.id.bt_prox_como_saber5);

        btProx.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                if (rb_sim5.isChecked()||rb_nao5.isChecked()){
                    Intent intent = new Intent (getBaseContext(), ComoSaber6Activity.class);
                    startActivity(intent);}
            }});
    }
}
