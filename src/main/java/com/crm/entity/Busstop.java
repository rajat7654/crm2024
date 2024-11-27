package com.crm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "busstop")
public class Busstop {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "bus_Id")
    private Bus bus;

    @ManyToOne(optional = false)
    @JoinColumn(name = "stop_Id")
    private Stop stop;

    @Column(name = "order_Number", nullable = false)
    private Integer orderNumber;

    @Column(name="departureTime",nullable=false)
    private LocalTime departureTime;

}