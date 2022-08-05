package com.salat.sigurtest.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Getter
@Setter
public class Guest extends Person {
    private OffsetDateTime visitTime;

    // к одному работнику может прийти несколько гостей
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Guest() {
        super();
        this.type = Type.GUEST;
    }
}
