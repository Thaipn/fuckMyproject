package com.example.fuckMyProject.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@ToString
//@Table(uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    @NotEmpty(message = "Role Name can not empty")
    private String name;

    public Role(String name) {
        this.name = name;
    }

    public Role() {

    }
}
