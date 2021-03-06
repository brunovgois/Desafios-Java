package com.invillia.studentsCRUD.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Setter
@Getter
@Entity(name = "STUDENT")
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer age;

}