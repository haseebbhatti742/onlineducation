package com.coderax.onlineeducation;

public class ClassesRecyclerViewCard {

    private int imageResource;
    private String textName;
    private String textClass;

    public ClassesRecyclerViewCard(int imageResource, String textName, String textClass){
        this.imageResource = imageResource;
        this.textName = textName;
        this.textClass = textClass;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTextName() {
        return textName;
    }

    public String getTextClass() {
        return textClass;
    }

}
