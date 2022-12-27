package com.laundryManagement.demo.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name="store")
public class Store {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private Long ownerId;

    private Long managerId;

    private String password;
}
