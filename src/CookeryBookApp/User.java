package CookeryBookApp;

import java.util.Date;
import java.util.Scanner;

public class User {
    // define all users states / variables
    String firstName;
    String surname;
    String passWord;

    // define get and set methods for variables

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
