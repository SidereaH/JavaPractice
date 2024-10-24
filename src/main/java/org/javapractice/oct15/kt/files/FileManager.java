package org.javapractice.oct15.kt.files;

public class FileManager {
    private File[] files;

    public FileManager(File[] files) {
        this.files = files;
    }

    public void processFiles() {
        for (File file : files) {
            System.out.println(file.open());
        }

    }

    public File[] getFiles() {
        return files;
    }
}