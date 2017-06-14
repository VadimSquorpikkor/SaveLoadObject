package com.squorpikkor.android.app.saveloadobject;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    TextView text1, text2, text3, text4;
    SharedPreferences sPref;;
//    SharedPreferences sPref2;
    HashMap<String, ?> mapOfPref = new HashMap<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Platezh plat1 = new Platezh("something1", "something2", "name1");
        Platezh plat2 = new Platezh("something3", "something4", "name2");

        text1 = (TextView)findViewById(R.id.text1);
        text2 = (TextView)findViewById(R.id.text2);
        text3 = (TextView)findViewById(R.id.text3);
        text4 = (TextView)findViewById(R.id.text4);

        text1.setText(plat1.getVar1());
        text2.setText(plat1.getVar2());
        text3.setText(plat2.getVar1());
        text4.setText(plat2.getVar2());

        sPref = getSharedPreferences("dataStore", Context.MODE_PRIVATE);
//        sPref2 = getSharedPreferences("objNameStore", Context.MODE_PRIVATE);
    }

    void saveObject(Platezh platezh) {
        SharedPreferences.Editor editor = sPref.edit();
        editor.putString(platezh.getObName() + "_var1", platezh.getVar1());
        editor.putString(platezh.getObName() + "_var2", platezh.getVar2());

//        SharedPreferences.Editor editor2 = sPref2.edit();
//        editor2.putString("name", platezh.getObName());
    }

    void loadObject() {
//        mapOfPref = sPref.getAll();


    }
}
