package org.javapractice.oct15.kt.library;

public class DVD extends LibraryItem{
    private String name;
    public DVD(String name) {
        this.name = name;
        super.setFee(2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
