package org.javapractice.oct15.kt.library;

public class Magazine extends LibraryItem {
    private String name;
    public Magazine(String name) {
        this.name = name;
        super.setFee(10);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
