package com.example.Timbrado_Enlaces.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ctl_sbtimbrado_figuras")
public class CtlSbTimbradoFiguras {

    @Id
    @Column(name = "folio_cfdi")
    private Long folioCfdi;

    @Column(name = "rfc", length = 13)
    private String rfc;

    @Column(name = "tipo_figura",length = 2)
    private String tipoFigura;

    @Column(name = "licencia",length = 20)
    private String licencia;


}
