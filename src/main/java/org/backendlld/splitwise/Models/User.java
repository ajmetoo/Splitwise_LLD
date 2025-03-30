package org.backendlld.splitwise.Models;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity( name="Users" )
@Data
public class User extends BaseClass {
    private String name;
    private String email;
    private String password;
    private String mobileNumber;

}
