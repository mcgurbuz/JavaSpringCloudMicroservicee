package com.haydikodlayalim.ticketservice.dto;

import com.haydikodlayalim.ticketservice.model.PriorityType;
import com.haydikodlayalim.ticketservice.model.TicketStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TicketDto {

    private String id;

    private String description;

    private String notes;

    private String assignee;

    private Date ticketDate;

    private String priorityType; //Enum detaylarını dışarıya açarken Enum detaylarını bilmeye gerek yok.Dışarıya STRİNG olarak dönsün.

    private String ticketStatus;
}
