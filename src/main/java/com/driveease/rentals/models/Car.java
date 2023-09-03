package com.driveease.rentals.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String mark;
    private String model;
    private int year;
    private double dailyRate;
    private boolean available;
    private LocalDate nextRentalDate;
    @OneToOne
    private Rental CurrentRental;
    @OneToMany(mappedBy = "car")
    private Set<Rental> rentals;


}
