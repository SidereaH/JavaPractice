package org.javapractice.oct15.files;

import org.javapractice.october4.nestedclasses.innerclasses.practice.Pair;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        var path = Path.of("/home/siderea/Документы/КТ2.docx");
        var directory = Path.of("~/Документы");
        System.out.println(path.getFileName().toString());
//        Files.createFile(Path.of("/home/siderea/Документы/zxc1.md"));
        System.out.println(Files.isDirectory(directory));
        System.out.println(Files.isDirectory(path));
        System.out.println(Files.size(path));
//
//        try {
//            File file = new File("/home/siderea/Документы/zxc.md");
//            if (file.createNewFile()) {
//                System.out.println("Файл создан");
//            } else {
//                System.out.println("Файл уже существует");
//            }
//        } catch (IOException e) {
//            System.out.println("Ошибка при создании файла");
//            e.printStackTrace();
//        }
    }
}
