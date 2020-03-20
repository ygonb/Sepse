package com.example.ygo.sepse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SaibaMais extends DebugActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saiba_mais);


        Button bt_prox_saiba_mais;
        bt_prox_saiba_mais = (Button)
                this.<View>findViewById(R.id.bt_prox_saiba_mais);

        bt_prox_saiba_mais.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v) {
                Intent it = new
                        Intent(getBaseContext(), SaibaMais2Activity.class);
                startActivity(it);}});
    }
}
