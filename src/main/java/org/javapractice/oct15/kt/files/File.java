package org.javapractice.oct15.kt.files;

public abstract class File {
    protected String filename;

    public File(String filename) {
        this.filename = filename;
    }

    abstract String open();
}