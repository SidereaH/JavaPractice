package org.javapractice.oct15.kt.files;

public class Main {
    public static void main(String[] args) {
        File[] files = new File[] {
                new TextFile("document.txt"),
                new ImageFile("photo.jpg"),
                new AudioFile("song.mp3")
        };

        FileManager manager = new FileManager(files);
        manager.processFiles();
    }
}
