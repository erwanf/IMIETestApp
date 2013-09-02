package com.IMIE.imietestapp;

import android.os.Bundle;
import android.app.Activity;
import android.text.InputType;
import android.view.Menu;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	TextView textView = null;
	TextView text1 = null;
	TextView text2 = null;
	TextView monTexte = null;
	TextView text = null;
	RelativeLayout layout = null;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     

//        monTexte = (TextView)findViewById(R.id.text);
//        monTexte.setText("Le texte de notre TextView");
//        monTexte.setPadding(50, 60, 70, 90);
        
        // On récupère notre layout par désérialisation. La méthode inflate retourne un View
        // C'est pourquoi on caste (on convertit) le retour de la méthode avec le vrai type de notre layout, c'est-à-dire RelativeLayout
        layout = (RelativeLayout) RelativeLayout.inflate(this, R.layout.activity_main, null);
        // … puis on récupère TextView grâce à son identifiant
        text = (TextView) layout.findViewById(R.id.text);
        text.setText("Et cette fois, ça fonctionne !");
        setContentView(layout);
        // On aurait très bien pu utiliser « setContentView(R.layout.activity_main) » bien sûr !       
        //  setContentView(R.layout.activity_main);
        
        TextView textView1 = new TextView(this);
        textView1 = (TextView)(TextView)findViewById(R.id.textView1);
        textView1.setText("mon textView");
        textView1.setTextSize(6);
      //  textView1.setTextColor(0x112233);
      
        EditText editText = new EditText(this);
   //     editText.setHint(R.string.editText);
        editText.setInputType(InputType.TYPE_TEXT_FLAG_MULTI_LINE);
        editText.setLines(5); 
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
