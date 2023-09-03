package com.driveease.rentals.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "rental")
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Car car;
    @ManyToOne
    private Customer customer;
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalCost;

}