package tools.kata.jackson;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    private String name;
    private int age;
    private Residence residence;
    private Date dob;

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
