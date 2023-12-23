package com.haydikodlayalim.ticketservice.model;

import lombok.Getter;

@Getter
public enum TicketStatus {
    OPEN("Acik"),
    IN_PROGRESS("Üzerinde Çalışılıyor"),
    RESOLVED("Çözüldü"),
    CLOSED("Kapandi");

    private String  label;

    TicketStatus(String label){
        this.label=label;

    }
}
