package az.unibank.softpos.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Getter
@Setter
@Slf4j

public class Credentials implements Serializable {

    private String username;
    private String password;

    // Getters and setters omitted
}
