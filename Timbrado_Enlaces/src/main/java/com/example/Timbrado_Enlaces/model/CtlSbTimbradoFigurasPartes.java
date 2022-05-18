package com.example.Timbrado_Enlaces.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ctl_sbtimbrado_figuras_partes")
public class CtlSbTimbradoFigurasPartes {

    @Id
    @Column(name = "folio_cfdi")
    private Long folioCfdi;

    @Column(name = "rfc",length = 13)
    private String rfc;

    @Column(name = "parte_transporte",length = 6)
    private String parteTransporte;
}
