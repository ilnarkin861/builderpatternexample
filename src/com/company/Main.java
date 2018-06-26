package com.company;

public class Main {

    public static void main(String[] args) {
        UserAccount userAccount = new UserAccount.AccountCreator("Vasya", "vasya@ya.ru", "pass123").create();
        System.out.println(userAccount.getLogin());
    }
}
