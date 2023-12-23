package com.haydikodlayalim.ticketservice.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="ticket")
@EqualsAndHashCode(of = {"id"}) //İki nesnenin equals olmasının sağlayan şey İD fieldıdır diyoruz.
@NoArgsConstructor
@AllArgsConstructor
public class Ticket extends BaseEntityModel {

    @Id
    @Getter
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id") //32 yada 64 karakterli bir String değer verecek bize UUID standartında
    private String id;

    @Getter
    @Setter
    @Column(name = "description",length = 600)
    private String description;

    @Getter
    @Setter
    @Column(name = "notes",length = 4000)
    private String notes;

    @Getter
    @Setter
    @Column(name = "assignee",length = 64) //Diğer Account tarafının refi
    //Önemli Assigne account bağlanacak fakat ben join işlemi yapmayacağım.
    // Mikroservis bilmiyor. Bu servis diğer servise Eureka üzerinden assigne doğru mu validation bu şekilde yapacağız.
    private String assignee;

    @Getter
    @Setter
    @Column(name = "ticket_date")
    private Date ticketDate;

    @Getter
    @Setter
    @Enumerated   //Enumdur. ORDINAL dersek 0 1 2 diye tutar. Default ORDINAL
    @Column(name = "priority_type")
    private PriorityType priorityType; //enum

    @Getter
    @Setter
    @Enumerated
    @Column(name = "ticket_status")
    private TicketStatus ticketStatus;
    /*
    assignee mikroservis geliştiriyor. Mikroservis bilmiyor sadece bu servis eurekaservis üzerinden soracak assignee doğru mu? Yani foreign key vs olmayacak Join vs yapmayacağız.
     */




}
