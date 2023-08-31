package com.picpaysimplificado.domain.user;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity(name="users")
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal balance;


    private String firstName;

    private String password;
    private String lastName;

    @Column(unique = true)
    private String document;

    @Column(unique = true)
    private String email;



    @Enumerated(EnumType.STRING)
    private UserType userType;
}
