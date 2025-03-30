package org.backendlld.splitwise.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public abstract class BaseClass {
    @Id
    private int id;
    private Date createdAt;
    private Date updatedAt;
}
