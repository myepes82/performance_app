package com.perfomance.application.domain;


import com.perfomance.application.domain.enums.Currencies;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "workers")
public class Worker {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private final String id;

    private final String name;

    @Column(name = "last_name")
    private final String lastName;

    private final Integer age;

    private final String country;

    @Enumerated
    private Currencies currency;

    private Double amount;

    @Column(name = "bonus_available")
    private Boolean bonusAvailable;

    @Column(name = "created_at")
    private LocalDate createdAt;
}
