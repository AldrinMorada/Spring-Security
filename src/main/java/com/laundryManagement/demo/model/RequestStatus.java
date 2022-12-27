package com.laundryManagement.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="request_status")
public class RequestStatus {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
}
