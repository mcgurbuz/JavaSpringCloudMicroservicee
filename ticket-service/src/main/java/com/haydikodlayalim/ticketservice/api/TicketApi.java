package com.haydikodlayalim.ticketservice.api;

import com.haydikodlayalim.ticketservice.dto.TicketDto;
import com.haydikodlayalim.ticketservice.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/ticket")
@RestController
@RequiredArgsConstructor //Bu nesne oluşturulurken ihtiyaç duyduğu dependencyleri inject et.
public class TicketApi {

    private final TicketService ticketService;

    @GetMapping("/{id}") //id path parametresiyle eşleştireceğiz
    public ResponseEntity<TicketDto> getById(@PathVariable String id){
        return ResponseEntity.ok(ticketService.getById(id));
    }

   @PostMapping
    public ResponseEntity<TicketDto> createTicket(@RequestBody TicketDto ticketDto){
        return ResponseEntity.ok(ticketService.save(ticketDto));
    }
    @PutMapping("/{id}")
    public ResponseEntity<TicketDto> updateTicket(@PathVariable String id,@RequestBody TicketDto ticketDto){
        return ResponseEntity.ok(ticketService.update(id,ticketDto));
    }

    @GetMapping
    public ResponseEntity<Page<TicketDto>> getAll(Pageable pageable){
        return ResponseEntity.ok(ticketService.getPagination(pageable));
    }

}
