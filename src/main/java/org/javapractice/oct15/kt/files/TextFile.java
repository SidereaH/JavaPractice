package org.javapractice.oct15.kt.files;

public class TextFile extends File {
    public TextFile(String filename) {
        super(filename);
    }

    @Override
    public String open() {
        return "читаю: " + filename;
    }
}
