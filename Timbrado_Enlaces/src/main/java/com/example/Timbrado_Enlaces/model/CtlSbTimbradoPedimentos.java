package com.example.Timbrado_Enlaces.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ctl_sbtimbrado_pedimentos")
public class CtlSbTimbradoPedimentos {

    @Id
    @Column(name = "folio_documento")
    private Long folioDocumento;

    @Column(name = "bienes_transp",nullable = false,length = 10)
    private String bienesTransp;

    @Column(name = "pedimento",length = 25)
    private String pedimento;



}
