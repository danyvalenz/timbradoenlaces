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

    public Long getFolioDocumento() {
        return folioDocumento;
    }

    public void setFolioDocumento(Long folioDocumento) {
        this.folioDocumento = folioDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getEmisorRfc() {
        return emisorRfc;
    }

    public void setEmisorRfc(String emisorRfc) {
        this.emisorRfc = emisorRfc;
    }

    public String getEmisorNombre() {
        return emisorNombre;
    }

    public void setEmisorNombre(String emisorNombre) {
        this.emisorNombre = emisorNombre;
    }

    public String getReceptorRfc() {
        return receptorRfc;
    }

    public void setReceptorRfc(String receptorRfc) {
        this.receptorRfc = receptorRfc;
    }

    public String getReceptorNombre() {
        return receptorNombre;
    }

    public void setReceptorNombre(String receptorNombre) {
        this.receptorNombre = receptorNombre;
    }

    public Integer getOrigen() {
        return origen;
    }

    public void setOrigen(Integer origen) {
        this.origen = origen;
    }

    public String getTipoOrigen() {
        return tipoOrigen;
    }

    public void setTipoOrigen(String tipoOrigen) {
        this.tipoOrigen = tipoOrigen;
    }

    public Integer getDestino() {
        return destino;
    }

    public void setDestino(Integer destino) {
        this.destino = destino;
    }

    public String getTipoDestino() {
        return tipoDestino;
    }

    public void setTipoDestino(String tipoDestino) {
        this.tipoDestino = tipoDestino;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
