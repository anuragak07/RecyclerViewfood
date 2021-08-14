package com.masai.recyclerview.Model;

public class MenuModel {
   private int pic;
    private String text;
    public MenuModel(int pic,String text){
        this.pic =pic;
        this.text=text;
    }
    public int getPic(){
        return pic;
    }
    public void setPic(int pic){
        this.pic = pic;
    }
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text=text;
    }
}
