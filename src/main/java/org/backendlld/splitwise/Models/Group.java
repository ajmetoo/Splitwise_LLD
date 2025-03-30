package org.backendlld.splitwise.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Group extends BaseClass{
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private User admin;
    @OneToMany
    private List<User> members;
}
