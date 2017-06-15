package com.squorpikkor.android.app.saveloadobject;

// Created by VadimSquorpikkor on 12.06.2017.

import android.content.SharedPreferences;

import static com.squorpikkor.android.app.saveloadobject.MainActivity.sPref;

class Platezh {
    private String var1;
    private String var2;
    private String obName;
//    SharedPreferences


    Platezh(String s1, String s2, String name) {
        var1 = s1;
        var2 = s2;
        obName = name;
    }

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public String getVar2() {
        return var2;
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }

    public String getObName() {
        return obName;
    }

//    void save() {
//        sPref = getSharedPreferences
//    }
}
