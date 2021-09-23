package com.example.recyclerveiwtwoq.ModelClass;

import android.widget.TextView;

public class Modelclass {
    String txtfooditem, txtweight, txtrupees,txtnumbercount;


    public Modelclass(String txtfooditem, String txtweight, String txtrupees, String txtnumbercount) {
        this.txtfooditem = txtfooditem;
        this.txtweight = txtweight;
        this.txtrupees = txtrupees;
        this.txtnumbercount = txtnumbercount;
    }

    public String getTxtfooditem() {
        return txtfooditem;
    }

    public void setTxtfooditem(String txtfooditem) {
        this.txtfooditem = txtfooditem;
    }

    public String getTxtweight() {
        return txtweight;
    }

    public void setTxtweight(String txtweight) {
        this.txtweight = txtweight;
    }

    public String getTxtrupees() {
        return txtrupees;
    }

    public void setTxtrupees(String txtrupees) {
        this.txtrupees = txtrupees;
    }

    public String getTxtnumbercount() {
        return txtnumbercount;
    }

    public void setTxtnumbercount(String txtnumbercount) {
        this.txtnumbercount = txtnumbercount;
    }
}