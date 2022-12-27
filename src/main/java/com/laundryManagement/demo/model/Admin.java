package com.laundryManagement.demo.model;


import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="admin")
public class Admin {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String password;
}
