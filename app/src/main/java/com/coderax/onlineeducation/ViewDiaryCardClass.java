package com.coderax.onlineeducation;

public class ViewDiaryCardClass {
    private int imageResource;
    private String textName;
    private String textClass;

    public ViewDiaryCardClass(int imageResource, String textName, String textClass) {
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
