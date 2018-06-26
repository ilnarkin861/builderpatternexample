package com.company;

public class UserAccount {

    private String login;
    private String email;
    private String password;

    //Optional params
    private String firstName;
    private String lastName;
    private int age;


    private UserAccount(String login, String email, String password, String firstName, String lastName, int age) {
        this.login = login;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public static class AccountCreator{

        private String login;
        private String email;
        private String password;

        //Optional params
        private String firstName;
        private String lastName;
        private int age;

        public AccountCreator(String login, String email, String password) {
            this.login = login;
            this.email = email;
            this.password = password;
        }

        public AccountCreator setLogin(String login) {this.login = login; return this;}

        public AccountCreator setEmail(String email) {this.email = email; return this;}

        public AccountCreator setPassword(String password) {this.password = password; return this;}

        public AccountCreator setFirstName(String firstName) {this.firstName = firstName; return this;}

        public AccountCreator setLastName(String lastName) {this.lastName = lastName; return this;}

        public AccountCreator setAge(int age) {this.age = age; return this;}

        public UserAccount create(){
            return new UserAccount(
                        login,
                        email,
                        password,
                        firstName,
                        lastName,
                        age

                        );

        }

    }
}
