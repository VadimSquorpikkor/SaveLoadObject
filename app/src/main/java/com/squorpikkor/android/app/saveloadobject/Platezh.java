package com.squorpikkor.android.app.saveloadobject;

// Created by VadimSquorpikkor on 12.06.2017.

class Platezh {
    private String var1;
    private String var2;
    private String obName;

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

    public void setObName(String obName) {
        this.obName = obName;
    }
}
