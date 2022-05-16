package com.example.Timbrado_Enlaces.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ctl_sbdocumentos_timbrado_enlaces_detalle")
public class CtlSbDocumentosTimbradoEnlacesDetalle implements Serializable {

    @Id
    @Column(name = "folio_documento")
    private Long folioDocumento;

    @Id
    @Column(name = "bienes_transp")
    private String bienesTransp;

    @Column(name = "grupo", length = 36)
    private String grupo;

    @Column(name = "numero_identificacion")
    private Integer numeroIdentificacion;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "descripcion",nullable = false,length = 200)
    private String descripcion;

    @Column(name = "peso_kg",nullable = false)
    private Double pesoKg;

    @Column(name = "clave_unidad",nullable = false,length = 3)
    private String claveUnidad;

    @Column(name = "unidad_descripcion",nullable = false,length = 20)
    private String unidadDescripcion;

    @Column(name = "material_peligroso",nullable = false,precision = 0)
    private Integer materialPeligroso;

    @Column(name = "tipo",length = 1,nullable = false)
    private String tipo;

    @Column(name = "departamento",length = 1,nullable = false)
    private String departamento;

    @Column(columnDefinition = "TEXT",name = "guias",nullable = true)
    private String guias;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "folio_documento",foreignKey = @ForeignKey(name = "FK_detalle_bitacora"))
    private CtlSbDocumentosTimbradoEnlaces ctlSbDocumentosTimbradoEnlaces;
}
