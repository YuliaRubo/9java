package com.company;

import java.io.*;
import java.util.ArrayList;


public class PersonIOUtil {


    public static void writePersons(String fileName, ArrayList<Person> persons) {
        //Определяем файл
        File file = new File(fileName);

        try (PrintWriter out = new PrintWriter(file.getAbsoluteFile());) {
            // Создание файла
            file.createNewFile();
            // Создание объекта FileWriter
            FileWriter writer = new FileWriter(file);
            // Запись содержимого в файл
            for(Person person : persons){
                writer.write(person.toString());
            }

            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String readPersons(String fileName) throws EmptySourceFileException {

        File file = new File(fileName);
        if (!file.exists()) throw new EmptySourceFileException();



        try (BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));) {

            String line = null;
            line = in.readLine();

            System.out.println("Данные персон из файла:");

            while (line != null) {
                String firstName = line.split("; ")[0];
                String lastName = line.split("; ")[1];
                String addresString  = line.split("; ")[2];

                String[] subStrAddres;
                subStrAddres = addresString.split(" ");

                 String city = subStrAddres[0];
                String street = subStrAddres[1];
                String numberStr = subStrAddres[2];

              Person person = new Person(firstName, lastName, new Address(city, street, Integer.parseInt(numberStr)));
                System.out.print(person.toString());


              line = in.readLine();
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();


        }
        return fileName;
    }
}





