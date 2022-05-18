package com.example.Timbrado_Enlaces.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ctl_sbtimbrado_remolques")
public class CtlSbTimbradoRemolques {

    @Id
    @Column(name = "folio_cfdi")
    private Long folioCfdi;

    @Column(name = "placa",length = 8)
    private String placa;

    @Column(name = "subtipo_remolque",length = 6)
    private String subtipoRemolque;



}
