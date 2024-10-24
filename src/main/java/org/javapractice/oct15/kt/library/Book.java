package org.javapractice.oct15.kt.library;

import java.time.LocalDate;

public class Book extends LibraryItem {
    private String name;
    public Book(String name) {
        this.name = name;
        super.setFee(1.5f);
        super.setDueDays(10);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
