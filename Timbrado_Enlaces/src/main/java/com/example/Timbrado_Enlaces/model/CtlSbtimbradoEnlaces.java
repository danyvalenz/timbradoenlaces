package com.example.Timbrado_Enlaces.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ctl_sbtimbrado_enlaces")
public class CtlSbtimbradoEnlaces {

    @Id
    @Column(name = "folio_cfdi")
    private Long folioCfdi;

    @Column(name = "folio_documento",nullable = false)
    private Long folioDocumento;

    @Column(name = "numero_certificado", nullable = false,length = 20)
    private String numeroCertificado;

    @Column(name = "permiso_num",nullable = false,length = 12)
    private String permisoNum;

    @Column(name = "permiso",nullable = false,length = 12)
    private String permiso;

    @Column(name = "modelo",nullable = false,length = 4)
    private String modelo;

    @Column(name = "configuracion_vehicular", nullable = false,length = 10)
    private String configuracionVehicular;

    @Column(name = "placas",nullable = false,length = 10)
    private String placas;

    @Column(name = "poliza",nullable = false,length = 30)
    private String poliza;

    @Column(name = "aseguradora_nombre",nullable = false,length = 50)
    private String aseguradoraNombre;

    @Column(name = "fecha_hora_salida",nullable = false,columnDefinition = "now()")
    private Date fechaHoraSalida;

    @Column(name = "fecha_hora_llegada",nullable = false)
    private Date fechaHoraLlegada;

    @Column(name = "distancia_recorrida",nullable = false)
    private Double distanciaRecorrida;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "uuid",columnDefinition = "TEXT",nullable = false)
    private String uuid;

    @Column(name = "sello", columnDefinition = "TEXT",nullable = false)
    private String sello;

    @Column(name = "fecha_timbrado")
    private Date fechaTimbrado;

    @Column(name = "proveedor_certificado_rfc",nullable = false,length = 13)
    private String proveedorCertificadoRfc;

    @Column(name = "numero_certificado_sat",nullable = false,length = 20)
    private String numeroCertificadoSat;

    @Column(name = "sello_sat",columnDefinition = "TEXT")
    private String selloSat;

    @Column(name = "cadena_original", columnDefinition = "TEXT")
    private String cadenaOriginal;

    @Column(name = "qr", columnDefinition = "TEXT")
    private String qr;

    @OneToOne(cascade = {CascadeType.REMOVE},orphanRemoval = true)
    @JoinColumn(referencedColumnName = "folio_documento",foreignKey = @ForeignKey(name = "FK_timbrado_timbradoenlaces"))
    private CtlSbDocumentosTimbradoEnlaces ctlSbDocumentosTimbradoEnlaces;

    public Long getFolioCfdi() {
        return folioCfdi;
    }

    public void setFolioCfdi(Long folioCfdi) {
        this.folioCfdi = folioCfdi;
    }

    public Long getFolioDocumento() {
        return folioDocumento;
    }

    public void setFolioDocumento(Long folioDocumento) {
        this.folioDocumento = folioDocumento;
    }

    public String getNumeroCertificado() {
        return numeroCertificado;
    }

    public void setNumeroCertificado(String numeroCertificado) {
        this.numeroCertificado = numeroCertificado;
    }

    public String getPermisoNum() {
        return permisoNum;
    }

    public void setPermisoNum(String permisoNum) {
        this.permisoNum = permisoNum;
    }

    public String getPermiso() {
        return permiso;
    }

    public void setPermiso(String permiso) {
        this.permiso = permiso;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getConfiguracionVehicular() {
        return configuracionVehicular;
    }

    public void setConfiguracionVehicular(String configuracionVehicular) {
        this.configuracionVehicular = configuracionVehicular;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getPoliza() {
        return poliza;
    }

    public void setPoliza(String poliza) {
        this.poliza = poliza;
    }

    public String getAseguradoraNombre() {
        return aseguradoraNombre;
    }

    public void setAseguradoraNombre(String aseguradoraNombre) {
        this.aseguradoraNombre = aseguradoraNombre;
    }

    public Date getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(Date fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public Date getFechaHoraLlegada() {
        return fechaHoraLlegada;
    }

    public void setFechaHoraLlegada(Date fechaHoraLlegada) {
        this.fechaHoraLlegada = fechaHoraLlegada;
    }

    public Double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(Double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSello() {
        return sello;
    }

    public void setSello(String sello) {
        this.sello = sello;
    }

    public Date getFechaTimbrado() {
        return fechaTimbrado;
    }

    public void setFechaTimbrado(Date fechaTimbrado) {
        this.fechaTimbrado = fechaTimbrado;
    }

    public String getProveedorCertificadoRfc() {
        return proveedorCertificadoRfc;
    }

    public void setProveedorCertificadoRfc(String proveedorCertificadoRfc) {
        this.proveedorCertificadoRfc = proveedorCertificadoRfc;
    }

    public String getNumeroCertificadoSat() {
        return numeroCertificadoSat;
    }

    public void setNumeroCertificadoSat(String numeroCertificadoSat) {
        this.numeroCertificadoSat = numeroCertificadoSat;
    }

    public String getSelloSat() {
        return selloSat;
    }

    public void setSelloSat(String selloSat) {
        this.selloSat = selloSat;
    }

    public String getCadenaOriginal() {
        return cadenaOriginal;
    }

    public void setCadenaOriginal(String cadenaOriginal) {
        this.cadenaOriginal = cadenaOriginal;
    }

    public String getQr() {
        return qr;
    }

    public void setQr(String qr) {
        this.qr = qr;
    }

    public CtlSbDocumentosTimbradoEnlaces getCtlSbDocumentosTimbradoEnlaces() {
        return ctlSbDocumentosTimbradoEnlaces;
    }

    public void setCtlSbDocumentosTimbradoEnlaces(CtlSbDocumentosTimbradoEnlaces ctlSbDocumentosTimbradoEnlaces) {
        this.ctlSbDocumentosTimbradoEnlaces = ctlSbDocumentosTimbradoEnlaces;
    }
}
