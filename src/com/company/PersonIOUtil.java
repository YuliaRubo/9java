package com.company;

import java.io.*;
import java.util.ArrayList;


public class PersonIOUtil {


    public static void writePersons(String fileName, ArrayList<Person> persons) {
        //Определяем файл
        File file = new File(fileName);

        try {
            //проверяем, что если файл не существует то создаем его
            if(!file.exists()){
                file.createNewFile();
            }

            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                //Записываем текст в файл
                out.print(persons);
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static String readPersons(String fileName) throws EmptySourceFileException {

        File file = new File(fileName);
        if (!file.exists()) throw new EmptySourceFileException();

        StringBuilder sb = new StringBuilder();

        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
            try {

                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {

                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        return fileName;
    }

}



