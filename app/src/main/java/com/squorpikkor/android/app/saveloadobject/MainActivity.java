package com.squorpikkor.android.app.saveloadobject;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    TextView text1, text2, text3, text4;
    static public SharedPreferences sPref;;
//    SharedPreferences sPref2;
    HashMap<String, ?> mapOfPref = new HashMap<>();
    HashMap<String, Platezh> mapOfPlat = new HashMap<>();
    ArrayList<String> platNames = new ArrayList<>();
    ArrayList<Platezh> platList = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Platezh plat1 = new Platezh("something1", "something2", "name1");
//        if (!platNames.contains(plat1)) {
//
//        }
//        Platezh plat2 = new Platezh("something3", "something4", "name2");

        text1 = (TextView)findViewById(R.id.text1);
        text2 = (TextView)findViewById(R.id.text2);
        text3 = (TextView)findViewById(R.id.text3);
        text4 = (TextView)findViewById(R.id.text4);

        createObj("Something1", "something2", "name1");
        createObj("Something3", "something4", "name2");

//        text1.setText(plat1.getVar1());
//        text2.setText(plat1.getVar2());
//        text3.setText(plat2.getVar1());
//        text4.setText(plat2.getVar2());

        text1.setText(mapOfPlat.get("name1").getVar1());
        text2.setText(mapOfPlat.get("name1").getVar2());
        text3.setText(mapOfPlat.get("name2").getVar1());
        text4.setText(mapOfPlat.get("name2").getVar2());

//        sPref = getSharedPreferences("dataStore", Context.MODE_PRIVATE);
//        sPref2 = getSharedPreferences("objNameStore", Context.MODE_PRIVATE);
    }

    void createObj(String var1, String var2, String name) {
        Platezh plat = new Platezh(var1, var2, name);
//        if (!plat.contains(plat.getObName())) {
//            platNames.add(plat.getObName());
//        }
//        platList.add(new Platezh());

        if (!platNames.contains(plat.getObName())) {
            platNames.add(plat.getObName());
        }
        mapOfPlat.put(name, new Platezh(var1, var2, name));
    }

    void saveObject(Platezh platezh) {
        sPref = getSharedPreferences(platezh.getObName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sPref.edit();
        editor.putString(platezh.getObName() + "_var1", platezh.getVar1());
        editor.putString(platezh.getObName() + "_var2", platezh.getVar2());

//        SharedPreferences.Editor editor2 = sPref2.edit();
//        editor2.putString("name", platezh.getObName());
    }

    void loadAllObjects() {
//        mapOfPref = sPref.getAll();
    }

//    void loadObject(?Str)
}
