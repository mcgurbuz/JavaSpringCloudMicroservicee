package com.haydikodlayalim.accountservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import java.util.Date;
import java.util.UUID;

/*
Dış dünyaya gösterilecek halini koyacağız DTO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
    /*
    Dışarıya ilgilendiren gidip gelen fieldlar bunlar
    */

    private String id;

    private String username;

    private String name;

    private String surname;

    private String email;

    private Date birthDate;
}
