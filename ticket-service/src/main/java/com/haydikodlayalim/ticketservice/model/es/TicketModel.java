package com.haydikodlayalim.ticketservice.model.es;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Data
@Builder
@EqualsAndHashCode(of={"id"})
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "ticket")  //Her bir kaydımızı tutan veriyapısı indextir. ElasticSearch de
//Ticket olarak indexi tutuyoruz. TicketModeli
public class TicketModel {

    @Id
    private String id;

    private String description;

    private String notes;

    private String assignee;

    private Date ticketDate;

    private String priorityType;

    private String ticketStatus;
}
