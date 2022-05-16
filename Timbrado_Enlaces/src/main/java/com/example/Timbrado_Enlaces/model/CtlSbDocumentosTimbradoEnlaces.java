package com.example.Timbrado_Enlaces.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="ctl_sbdocumentos_timbrado_enlaces")
public class CtlSbDocumentosTimbradoEnlaces {

    @Id
    @Column(name = "folio_documento")
    private Long folioDocumento;

    @Column(name = "tipo_documento", nullable = false, length = 60)
    private String tipoDocumento;

    @Column(name = "emisor_rfc",nullable = false,length = 13)
    private String emisorRfc;

    @Column(name = "emisor_nombre",nullable = false,length = 80)
    private String emisorNombre;

    @Column(name = "receptor_rfc", nullable = false,length = 13)
    private String receptorRfc;

    @Column(name = "receptor_nombre",nullable = false,length = 80)
    private String receptorNombre;

    @Column(name = "origen",nullable = false)
    private Integer origen;

    @Column(name = "tipo_origen",nullable = false,length = 40)
    private String tipoOrigen;

    @Column(name = "destino")
    private Integer destino;

    @Column(name = "tipo_destino", nullable = false,length = 40)
    private String tipoDestino;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha")
    private Date fecha;


}
