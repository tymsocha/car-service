package com.carservice.modules.clients.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Builder
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "nip_number")
    Long nipNumber;

    @Column(name = "company")
    String company;

    @Column(name = "address_city")
    String cityAddress;

    @Column(name = "address_street")
    String streetAddress;

    @Column(name = "phone_number")
    String phoneNumber;
}
