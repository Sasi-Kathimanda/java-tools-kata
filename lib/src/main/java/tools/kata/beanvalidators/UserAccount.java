package tools.kata.beanvalidators;

import lombok.Data;
import lombok.NonNull;


@Data
public class UserAccount {
    @NonNull
    private String userName;
    private String password;

    public UserAccount(@NonNull String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
