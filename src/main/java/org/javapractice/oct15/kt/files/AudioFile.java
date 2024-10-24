package org.javapractice.oct15.kt.files;

public class AudioFile extends File {
    public AudioFile(String filename) {
        super(filename);
    }

    @Override
    public String open() {
        // Имитация чтения аудио
        return "слцушаю аудио: " + filename;
    }
}
