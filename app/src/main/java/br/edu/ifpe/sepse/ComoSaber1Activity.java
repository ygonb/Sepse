package br.edu.ifpe.sepse;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ComoSaber1Activity extends DebugActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.como_saber_1);

        Button btProx = (Button) findViewById(R.id.bt_prox_como_saber1);
        final TextView tv_pontuacao1 = (TextView) findViewById(R.id.tv_pontuacao1);
        RadioGroup grupo1 = (RadioGroup) findViewById(R.id.rg_1);
        final RadioButton rb_sim1 = (RadioButton) findViewById(R.id.rb_sim1);
        final RadioButton rb_nao1 = (RadioButton) findViewById(R.id.rb_nao1);
        tv_pontuacao1.setText(Integer.toString(pontuacao0));

        grupo1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
           public void onCheckedChanged(RadioGroup grupo1, int checkedId){
            boolean sim = R.id.rb_sim1==checkedId;
            boolean nao = R.id.rb_nao1==checkedId;

            if (sim){
                Log.i(TAG,"Sim "+checkedId);
                pontuacao1 = pontuacao0 + 30;
                tv_pontuacao1.setText(Integer.toString(pontuacao1));
            } else if (nao){
                Log.i(TAG,"Nao "+checkedId);
                pontuacao1 = pontuacao0;
                tv_pontuacao1.setText(Integer.toString(pontuacao1));
            }
           }});


        btProx.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                if (rb_sim1.isChecked()||rb_nao1.isChecked()){
                Intent intent = new Intent (getBaseContext(), ComoSaber2Activity.class);
                startActivity(intent);}
            }});
    }
}
