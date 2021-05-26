package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PersonIOUtil {


        public static void writePersons(String fileName, Person persons) throws IOException {
            try(FileWriter writer = new FileWriter("notes3.txt", false))
            {
                // запись всей строки
                String text = "Hello Gold!";
                writer.write(text);
                // запись по символам
                writer.append('\n');
                writer.append('E');

                writer.flush();
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
        }
}


