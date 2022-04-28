package tools.kata.jackson;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {
    private String name;
    private int age;
    private Residence residence;
    private Date dob;

    public Person(String name, int age , Date dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Residence getResidence() {
        return residence;
    }

    public Date getDob() {
        return dob;
    }
}
