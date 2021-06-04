package com.company;

import com.sun.source.tree.CatchTree;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Person m1 = new Person("Mar", "Teo", new Address("Vitebsk", "Pobeda", 5));
           if (m1.firstname == null) {
               throw new NullFieldException("Введите данные");
           }
           if (m1.lastname == null) {
            throw new NullFieldException("Введите данные");
           }
           if (m1.address == null) {
            throw new NullFieldException("Введите данные");
           }

        Person m2 = new Person("Well", "Tig", new Address("Vitebsk", "lazo", 7));
           if (m2.firstname == null) {
            throw new NullFieldException("Введите данные");
            }
            if (m2.lastname == null) {
            throw new NullFieldException("Введите данные");
            }
            if (m2.address == null) {
            throw new NullFieldException("Введите данные");
            }
        Person m3 = new Person("Dell", "Jip", new Address("Minsk", "Tree", 9));
            if (m3.firstname == null) {
            throw new NullFieldException("Введите данные");
            }
            if (m3.lastname == null) {
            throw new NullFieldException("Введите данные");
            }
            if (m3.address == null) {
            throw new NullFieldException("Введите данные");
        }

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(m1);
        persons.add(m2);
        persons.add(m3);
        System.out.println( persons.toString());


        PersonIOUtil.writePersons( "infoCollection4.txt", persons);

        try {
            PersonIOUtil.readPersons("infoCollection4.txt");
        } catch (EmptySourceFileException e) {
            e.printStackTrace();
        }



    }


    }


