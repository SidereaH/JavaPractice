package org.javapractice.october8.trycatchexception;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("nums"));
            String line = reader.readLine();
            System.out.println(line);
            System.out.println(123/2);
            printFirstString("nuasdadms");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        }
        finally{
            if(reader != null){
                reader.close();
                System.out.println("closed");
            }
        }

    }

    public static void printFirstString(String fileName) throws IOException {

        var reader = new BufferedReader(new FileReader(fileName));
        String line = reader.readLine();
        System.out.println(line);


    }

}
