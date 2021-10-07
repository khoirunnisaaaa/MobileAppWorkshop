package com.example.recyclerview_khoirunnisa;

public class ModelClass {

    //inisialisasikan imageView1, textView1, textView2, textView3, divider
    private int imageview1;
    private String textview1;
    private String textview2;
    private String textview3;
    private String divider;

    //membuat method/function ModelClass
    ModelClass(int imageview1, String textview1, String textview2, String textview3, String divider){
        this.imageview1 = imageview1;
        this.textview1 = textview1;
        this.textview2 = textview2;
        this.textview3 = textview3;
        this.divider = divider;
    }

    //Buat getter dari masing-masing variabel

    public int getImageview1() {
        return imageview1;
    }

    public String getTextview1() {
        return textview1;
    }

    public String getTextview2() {
        return textview2;
    }

    public String getTextview3() {
        return textview3;
    }

    public String getDivider() {
        return divider;
    }
}
