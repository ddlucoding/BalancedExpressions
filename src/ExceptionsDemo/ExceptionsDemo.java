package ExceptionsDemo;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {

    public static void show(){
        try (var reader = new FileReader("file.txt")) {
            var data = reader.read();
        }
        catch(IOException ex){
            System.out.println("Yo, I can't read this file, c'mon man.");
        }

    }

    public void deposit(int money) throws IOException{
        if (money >= 0){
            throw new IOException();
        }
    }


}
