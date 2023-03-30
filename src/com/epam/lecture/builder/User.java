package com.epam.lecture.builder;

public class User {

    private int id;         // mandatory
    private String name;    // mandatory
    private String middleName;
    private String lastName;
    private String address;
    private String phone;
    private long birthDate;
    private boolean isAdmin;

    public User(int id, String name, String middleName, String lastName, String address, String phone, long birthDate, boolean isAdmin) {
        this.id = id;
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.birthDate = birthDate;
        this.isAdmin = isAdmin;
    }

    public User(int id, String name, String lastName, String address, boolean isAdmin) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.isAdmin = isAdmin;
    }

    public User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", birthDate=" + birthDate +
                ", isAdmin=" + isAdmin +
                '}';
    }

    public class UserBuilder {

        public UserBuilder() {

        }

        public UserBuilder(int id, String name) {
            User.this.id = id;
            User.this.name = name;
        }

        public UserBuilder setMiddleName(String middleName) {
            User.this.middleName = middleName;
            return this;
        }

        public UserBuilder setLastName(String lastName) {
            User.this.lastName = lastName;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            User.this.phone = phone;
            return this;
        }

        public UserBuilder setIsAdmin(boolean isAdmin) {
            User.this.isAdmin = isAdmin;
            return this;
        }

        public User build() {
            return User.this;
        }
    }
}
