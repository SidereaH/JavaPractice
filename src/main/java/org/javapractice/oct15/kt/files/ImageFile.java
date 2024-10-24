package org.javapractice.oct15.kt.files;

public class ImageFile extends File {
    public ImageFile(String filename) {
        super(filename);
    }

    @Override
    public String open() {
        return "смотрю картнки: " + filename;
    }
}
