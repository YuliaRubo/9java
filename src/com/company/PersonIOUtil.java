package com.company;

import java.io.*;
import java.util.ArrayList;


public class PersonIOUtil {


    public static void writePersons(String fileName, ArrayList<Person> persons) {
        //Определяем файл
        File file = new File(fileName);

        try (PrintWriter out = new PrintWriter(file.getAbsoluteFile());) {
            out.print(persons);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String readPersons(String fileName) throws EmptySourceFileException {

        File file = new File(fileName);
        if (!file.exists()) throw new EmptySourceFileException();

        StringBuilder sb = new StringBuilder();

        try (BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));) {
            //Объект для чтения файла в буфер
            String s;
            while ((s = in.readLine()) != null) {
                sb.append(s);
                sb.append("\n");
            }
            System.out.println(sb.toString());
        } catch (IOException ioException) {
            ioException.printStackTrace();


        }
        return fileName;
    }
}





