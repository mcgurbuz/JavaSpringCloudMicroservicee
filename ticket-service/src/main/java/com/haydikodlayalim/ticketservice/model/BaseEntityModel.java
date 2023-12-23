package com.haydikodlayalim.ticketservice.model;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass  //Bu miras yolunu açıyor. Bu kolonları diğer classlara vermemizi sağlıyor.
public abstract class BaseEntityModel implements Serializable {
    @CreatedDate
    @Column(name="created_at")
    private Date cretedAt;

    @Column(name="updated_at")
    private Date updatedAt;
}
