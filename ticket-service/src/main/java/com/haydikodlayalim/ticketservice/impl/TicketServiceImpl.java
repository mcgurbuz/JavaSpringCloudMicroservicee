package com.haydikodlayalim.ticketservice.impl;

import com.haydikodlayalim.ticketservice.dto.TicketDto;
import com.haydikodlayalim.ticketservice.service.TicketService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class TicketServiceImpl implements TicketService {
    /*
      Save yaparken adımlar
      1- Eureka git account Servislerden getir birtanesini, servis üzerinden ticket üzerindeki assigne kişisi doğrumu.
      Doğruysa Ticket oluştur.
      2-Git kuyruğa notification oluştur.
      3-Notification account sahibine git notification gönder git mail at gibi.
       */

    @Override
    public TicketDto save(TicketDto ticketDto) {

        return null;
    }

    @Override
    public TicketDto update(String id,TicketDto ticketDto) {
        return null;
    }

    @Override
    public TicketDto getById(String ticketId) {
        return null;
    }

    @Override
    public Page<TicketDto> getPagination(Pageable pageable) {
        return null;
    }
}
