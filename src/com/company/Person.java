package com.company;

import java.util.Objects;

public class Person {

    public  String firstname;
    public  String lastname;
    public   Address address;



    public Person(String firstname, String lastname, Address address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Address getAddress() {
        return address;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
//        return "Person {" +
//                "firstName = " + firstname +
//                ", LastName = " + lastname +
//                ", address: " + address.getInfo()+
//                '}'+"\n";
        return "" + firstname + "; " + lastname + "; " + address.getInfo()+"\n";
  }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstname, person.firstname) && Objects.equals(lastname, person.lastname) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, address);
    }
}
