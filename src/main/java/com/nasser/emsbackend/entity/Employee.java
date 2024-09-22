package com.nasser.emsbackend.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emloyees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//automatically increment the primary key in db
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id", nullable = false, unique = true)//non nullable: cannot have null values + unique email
    private String email;
}
