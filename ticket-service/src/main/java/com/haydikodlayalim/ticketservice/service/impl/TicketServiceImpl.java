package com.haydikodlayalim.ticketservice.service.impl;

import com.haydikodlayalim.ticketservice.dto.TicketDto;
import com.haydikodlayalim.ticketservice.repository.TicketRepository;
import com.haydikodlayalim.ticketservice.repository.es.TicketElasticRepository;
import com.haydikodlayalim.ticketservice.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {
    /*
      Save yaparken adımlar
      1- Eureka git account Servislerden getir birtanesini, servis üzerinden ticket üzerindeki assigne kişisi doğrumu.
      Doğruysa Ticket oluştur.
      2-Git kuyruğa notification oluştur.
      3-Notification account sahibine git notification gönder git mail at gibi.
       */

    private final TicketElasticRepository ticketElasticRepository;
    private final TicketRepository ticketRepository;
    private final ModelMapper modelMapper;

    @Override
    public TicketDto save(TicketDto ticketDto) {
        // Ticket Entity dönüşümünü yap
        // mysql kaydet
        // TicketModel Nesnesi yarat
        // elastic kaydet
        // oluşan nesneyi döndür
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
