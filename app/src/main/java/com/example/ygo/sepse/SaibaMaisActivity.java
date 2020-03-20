package com.example.ygo.sepse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SaibaMaisActivity extends Activity {
}@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.saiba_mais);

    btProx.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick (View view){
            if
                Intent intent = new Intent (getBaseContext(), SaibaMais2Activity.class);
                startActivity(intent);}
        }});
}
}
