package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@ToString @AllArgsConstructor @NoArgsConstructor
public class Accounts extends BaseEntity{

    @Id
    private Long accountNumber;

    private String accountType;

    private String branchAddress;

    private Long customerId;

    private String name;

    private String email;

    private String mobileNumber;
}
