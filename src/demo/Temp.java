package demo;

import java.util.Objects;

public class Temp {
    static class Person {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        private String name;
        private int age;
    }

    public static void changeName(Person person) {
        person.setAge(0);
        person.setName("");
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("a");
        person.setAge(66);
        System.out.println(person.getAge());
        System.out.println(person.getName());
        changeName(person);
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }
}
