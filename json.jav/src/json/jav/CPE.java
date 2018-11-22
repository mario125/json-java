/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json.jav;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Mario
 */
public class CPE {
        private int       ID                   ;   
        private int       ITEMS                ;   
        private String    TIPO_OPERACION       ;
        private String    FECHA_REGISTRO       ;
        private int       ID_EMPRESA           ;  
        private int       ID_CLIENTE_CPE       ;   
        private double    TOTAL_GRAVADAS       ;
        private double    TOTAL_INAFECTA       ;
        private double    TOTAL_EXONERADAS     ;
        private double    TOTAL_GRATUITAS      ;
        private double    TOTAL_PERCEPCIONES   ;
        private double    TOTAL_RETENCIONES    ;
        private double    TOTAL_DETRACCIONES   ;
        private double    TOTAL_BONIFICACIONES ;
        private double    TOTAL_DESCUENTO      ;
        private double    SUB_TOTAL            ;
        private double    TOTAL_IGV            ;
        private double    TOTAL_ISC            ;
        private double    TOTAL_OTR_IMP        ;
        private double    TOTAL                ;
        
        private String TOTAL_LETRAS                   ;
        private String NRO_GUIA_REMISION              ;
        private String COD_GUIA_REMISION              ;
        private String NRO_OTR_COMPROBANTE            ;
        private String COD_OTR_COMPROBANTE            ;
        private String OBS_DOC                        ;
        private String HASH_DOC                      ;
        private String TIPO_COMPROBANTE_MODIFICA    ;
        private String NRO_DOCUMENTO_MODIFICA            ;
        private String COD_TIPO_MOTIVO              ;
        private String DESCRIPCION_MOTIVO                ;
        private String NRO_COMPROBANTE               ;
        private String FECHA_DOCUMENTO               ;
        private String COD_TIPO_DOCUMENTO            ;
        private String COD_MONEDA                       ;
        private String NRO_DOCUMENTO_CLIENTE             ;
        private String COD_SUNAT                        ;
        private String RAZON_SOCIAL_CLIENTE              ;
        private String TIPO_DOCUMENTO_CLIENTE            ;
        private String DIRECCION_CLIENTE                ;
        private String CIUDAD_CLIENTE                   ;
        private String COD_PAIS_CLIENTE                  ;
        private String NRO_DOCUMENTO_EMPRESA            ;
        private String TIPO_DOC                         ;
        
        private String TIPO_DOCUMENTO_EMPRESA                               ;
        private String NOMBRE_COMERCIAL_EMPRESA                                  ;
        private String CODIGO_UBIGEO_EMPRESA                                  ;
        private String DIRECCION_EMPRESA                                  ;
        private String DEPARTAMENTO_EMPRESA                                  ;
        private String PROVINCIA_EMPRESA                                 ;
        private String DISTRITO_EMPRESA                                ;
        private String CODIGO_PAIS_EMPRESA                                ;
        private String RAZON_SOCIAL_EMPRESA                                  ;
        private String LOGO_EMP                               ;
        private String FIRMA_EMP                                  ;
        private String WEB_EMP                               ;
        private String USUARIO_SOL_EMPRESA                               ;
        private String PASS_SOL_EMPRESA                               ;
        private String CONTRA                                     ;
        private String CONTRA_FIRMA                   ;
        private String COD_RESPUESTA_SUNAT               ;
        private String DESCRIPCION_RESPUESTA                 ;
        private String PLACA_VEHICULO                        ;
        private String NRO_COMPROBANTE_REF_ANT                   ;
        private String MONEDA_REGU_ANTICIPO                      ;
        private String TIPO_DOCUMENTO_EMP_REGU_ANT                ;
        private String NRO_DOCUMENTO_EMP_REGU_ANT                 ;
        private String ESTADO                            ;
        private String HASH_CPE                                  ;
        private String HASH_CDR                              ;
        private String ID_USUARIO                                ;       
        private String FECHA_VTO                             ;
        private String TELEFONO_PRINCIPAL                                 ;
        private String COD_SUCURSAL                                  ;
        private String DIRECCION_SUCURSAL                    ;
        private String TELEFONO_SUCURSAL                             ;
        private String FORMA_PAGO                                    ;
        private String GLOSA                                 ;
        private String SERIE                                                 ;
        private String NUMERO                                                        ;
        private String RUTA_PDF                                                          ;
        private String RUTA_PDF_2_NUVE                                   ;
        private String ESTADO_DE_DOC                             ;
        private String RUTA_CODIGO_BARRA                         ;
        
        private double MONTO_REGU_ANTICIPO                     ;
        private int  TIPO_PROCESO                   ;        
        private int  FLG_ANTICIPO                   ;
        private int  FLG_REGU_ANTICIPO              ;                  
        private int  TIPO                   ;        
        private int  ID_FORMA_PAGO                  ;
        private int  ID_ALMACEN                     ;      
        private int  ID_REFERENCIA                  ;
        public List<CPE_DETALLE> myList = new ArrayList<>();
        
        

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the ITEMS
     */
    public int getITEMS() {
        return ITEMS;
    }

    /**
     * @param ITEMS the ITEMS to set
     */
    public void setITEMS(int ITEMS) {
        this.ITEMS = ITEMS;
    }

    /**
     * @return the TIPO_OPERACION
     */
    public String getTIPO_OPERACION() {
        return TIPO_OPERACION;
    }

    /**
     * @param TIPO_OPERACION the TIPO_OPERACION to set
     */
    public void setTIPO_OPERACION(String TIPO_OPERACION) {
        this.TIPO_OPERACION = TIPO_OPERACION;
    }

    /**
     * @return the FECHA_REGISTRO
     */
    public String getFECHA_REGISTRO() {
        return FECHA_REGISTRO;
    }

    /**
     * @param FECHA_REGISTRO the FECHA_REGISTRO to set
     */
    public void setFECHA_REGISTRO(String FECHA_REGISTRO) {
        this.FECHA_REGISTRO = FECHA_REGISTRO;
    }

    /**
     * @return the ID_EMPRESA
     */
    public int getID_EMPRESA() {
        return ID_EMPRESA;
    }

    /**
     * @param ID_EMPRESA the ID_EMPRESA to set
     */
    public void setID_EMPRESA(int ID_EMPRESA) {
        this.ID_EMPRESA = ID_EMPRESA;
    }

    /**
     * @return the ID_CLIENTE_CPE
     */
    public int getID_CLIENTE_CPE() {
        return ID_CLIENTE_CPE;
    }

    /**
     * @param ID_CLIENTE_CPE the ID_CLIENTE_CPE to set
     */
    public void setID_CLIENTE_CPE(int ID_CLIENTE_CPE) {
        this.ID_CLIENTE_CPE = ID_CLIENTE_CPE;
    }

    /**
     * @return the TOTAL_GRAVADAS
     */
    public double getTOTAL_GRAVADAS() {
        return TOTAL_GRAVADAS;
    }

    /**
     * @param TOTAL_GRAVADAS the TOTAL_GRAVADAS to set
     */
    public void setTOTAL_GRAVADAS(double TOTAL_GRAVADAS) {
        this.TOTAL_GRAVADAS = TOTAL_GRAVADAS;
    }

    /**
     * @return the TOTAL_INAFECTA
     */
    public double getTOTAL_INAFECTA() {
        return TOTAL_INAFECTA;
    }

    /**
     * @param TOTAL_INAFECTA the TOTAL_INAFECTA to set
     */
    public void setTOTAL_INAFECTA(double TOTAL_INAFECTA) {
        this.TOTAL_INAFECTA = TOTAL_INAFECTA;
    }

    /**
     * @return the TOTAL_EXONERADAS
     */
    public double getTOTAL_EXONERADAS() {
        return TOTAL_EXONERADAS;
    }

    /**
     * @param TOTAL_EXONERADAS the TOTAL_EXONERADAS to set
     */
    public void setTOTAL_EXONERADAS(double TOTAL_EXONERADAS) {
        this.TOTAL_EXONERADAS = TOTAL_EXONERADAS;
    }

    /**
     * @return the TOTAL_GRATUITAS
     */
    public double getTOTAL_GRATUITAS() {
        return TOTAL_GRATUITAS;
    }

    /**
     * @param TOTAL_GRATUITAS the TOTAL_GRATUITAS to set
     */
    public void setTOTAL_GRATUITAS(double TOTAL_GRATUITAS) {
        this.TOTAL_GRATUITAS = TOTAL_GRATUITAS;
    }

    /**
     * @return the TOTAL_PERCEPCIONES
     */
    public double getTOTAL_PERCEPCIONES() {
        return TOTAL_PERCEPCIONES;
    }

    /**
     * @param TOTAL_PERCEPCIONES the TOTAL_PERCEPCIONES to set
     */
    public void setTOTAL_PERCEPCIONES(double TOTAL_PERCEPCIONES) {
        this.TOTAL_PERCEPCIONES = TOTAL_PERCEPCIONES;
    }

    /**
     * @return the TOTAL_RETENCIONES
     */
    public double getTOTAL_RETENCIONES() {
        return TOTAL_RETENCIONES;
    }

    /**
     * @param TOTAL_RETENCIONES the TOTAL_RETENCIONES to set
     */
    public void setTOTAL_RETENCIONES(double TOTAL_RETENCIONES) {
        this.TOTAL_RETENCIONES = TOTAL_RETENCIONES;
    }

    /**
     * @return the TOTAL_DETRACCIONES
     */
    public double getTOTAL_DETRACCIONES() {
        return TOTAL_DETRACCIONES;
    }

    /**
     * @param TOTAL_DETRACCIONES the TOTAL_DETRACCIONES to set
     */
    public void setTOTAL_DETRACCIONES(double TOTAL_DETRACCIONES) {
        this.TOTAL_DETRACCIONES = TOTAL_DETRACCIONES;
    }

    /**
     * @return the TOTAL_BONIFICACIONES
     */
    public double getTOTAL_BONIFICACIONES() {
        return TOTAL_BONIFICACIONES;
    }

    /**
     * @param TOTAL_BONIFICACIONES the TOTAL_BONIFICACIONES to set
     */
    public void setTOTAL_BONIFICACIONES(double TOTAL_BONIFICACIONES) {
        this.TOTAL_BONIFICACIONES = TOTAL_BONIFICACIONES;
    }

    /**
     * @return the TOTAL_DESCUENTO
     */
    public double getTOTAL_DESCUENTO() {
        return TOTAL_DESCUENTO;
    }

    /**
     * @param TOTAL_DESCUENTO the TOTAL_DESCUENTO to set
     */
    public void setTOTAL_DESCUENTO(double TOTAL_DESCUENTO) {
        this.TOTAL_DESCUENTO = TOTAL_DESCUENTO;
    }

    /**
     * @return the SUB_TOTAL
     */
    public double getSUB_TOTAL() {
        return SUB_TOTAL;
    }

    /**
     * @param SUB_TOTAL the SUB_TOTAL to set
     */
    public void setSUB_TOTAL(double SUB_TOTAL) {
        this.SUB_TOTAL = SUB_TOTAL;
    }

    /**
     * @return the TOTAL_IGV
     */
    public double getTOTAL_IGV() {
        return TOTAL_IGV;
    }

    /**
     * @param TOTAL_IGV the TOTAL_IGV to set
     */
    public void setTOTAL_IGV(double TOTAL_IGV) {
        this.TOTAL_IGV = TOTAL_IGV;
    }

    /**
     * @return the TOTAL_ISC
     */
    public double getTOTAL_ISC() {
        return TOTAL_ISC;
    }

    /**
     * @param TOTAL_ISC the TOTAL_ISC to set
     */
    public void setTOTAL_ISC(double TOTAL_ISC) {
        this.TOTAL_ISC = TOTAL_ISC;
    }

    /**
     * @return the TOTAL_OTR_IMP
     */
    public double getTOTAL_OTR_IMP() {
        return TOTAL_OTR_IMP;
    }

    /**
     * @param TOTAL_OTR_IMP the TOTAL_OTR_IMP to set
     */
    public void setTOTAL_OTR_IMP(double TOTAL_OTR_IMP) {
        this.TOTAL_OTR_IMP = TOTAL_OTR_IMP;
    }

    /**
     * @return the TOTAL
     */
    public double getTOTAL() {
        return TOTAL;
    }

    /**
     * @param TOTAL the TOTAL to set
     */
    public void setTOTAL(double TOTAL) {
        this.TOTAL = TOTAL;
    }

    /**
     * @return the TOTAL_LETRAS
     */
    public String getTOTAL_LETRAS() {
        return TOTAL_LETRAS;
    }

    /**
     * @param TOTAL_LETRAS the TOTAL_LETRAS to set
     */
    public void setTOTAL_LETRAS(String TOTAL_LETRAS) {
        this.TOTAL_LETRAS = TOTAL_LETRAS;
    }

    /**
     * @return the NRO_GUIA_REMISION
     */
    public String getNRO_GUIA_REMISION() {
        return NRO_GUIA_REMISION;
    }

    /**
     * @param NRO_GUIA_REMISION the NRO_GUIA_REMISION to set
     */
    public void setNRO_GUIA_REMISION(String NRO_GUIA_REMISION) {
        this.NRO_GUIA_REMISION = NRO_GUIA_REMISION;
    }

    /**
     * @return the COD_GUIA_REMISION
     */
    public String getCOD_GUIA_REMISION() {
        return COD_GUIA_REMISION;
    }

    /**
     * @param COD_GUIA_REMISION the COD_GUIA_REMISION to set
     */
    public void setCOD_GUIA_REMISION(String COD_GUIA_REMISION) {
        this.COD_GUIA_REMISION = COD_GUIA_REMISION;
    }

    /**
     * @return the NRO_OTR_COMPROBANTE
     */
    public String getNRO_OTR_COMPROBANTE() {
        return NRO_OTR_COMPROBANTE;
    }

    /**
     * @param NRO_OTR_COMPROBANTE the NRO_OTR_COMPROBANTE to set
     */
    public void setNRO_OTR_COMPROBANTE(String NRO_OTR_COMPROBANTE) {
        this.NRO_OTR_COMPROBANTE = NRO_OTR_COMPROBANTE;
    }

    /**
     * @return the COD_OTR_COMPROBANTE
     */
    public String getCOD_OTR_COMPROBANTE() {
        return COD_OTR_COMPROBANTE;
    }

    /**
     * @param COD_OTR_COMPROBANTE the COD_OTR_COMPROBANTE to set
     */
    public void setCOD_OTR_COMPROBANTE(String COD_OTR_COMPROBANTE) {
        this.COD_OTR_COMPROBANTE = COD_OTR_COMPROBANTE;
    }

    /**
     * @return the OBS_DOC
     */
    public String getOBS_DOC() {
        return OBS_DOC;
    }

    /**
     * @param OBS_DOC the OBS_DOC to set
     */
    public void setOBS_DOC(String OBS_DOC) {
        this.OBS_DOC = OBS_DOC;
    }

    /**
     * @return the HASH_DOC
     */
    public String getHASH_DOC() {
        return HASH_DOC;
    }

    /**
     * @param HASH_DOC the HASH_DOC to set
     */
    public void setHASH_DOC(String HASH_DOC) {
        this.HASH_DOC = HASH_DOC;
    }

    /**
     * @return the TIPO_COMPROBANTE_MODIFICA
     */
    public String getTIPO_COMPROBANTE_MODIFICA() {
        return TIPO_COMPROBANTE_MODIFICA;
    }

    /**
     * @param TIPO_COMPROBANTE_MODIFICA the TIPO_COMPROBANTE_MODIFICA to set
     */
    public void setTIPO_COMPROBANTE_MODIFICA(String TIPO_COMPROBANTE_MODIFICA) {
        this.TIPO_COMPROBANTE_MODIFICA = TIPO_COMPROBANTE_MODIFICA;
    }

    /**
     * @return the NRO_DOCUMENTO_MODIFICA
     */
    public String getNRO_DOCUMENTO_MODIFICA() {
        return NRO_DOCUMENTO_MODIFICA;
    }

    /**
     * @param NRO_DOCUMENTO_MODIFICA the NRO_DOCUMENTO_MODIFICA to set
     */
    public void setNRO_DOCUMENTO_MODIFICA(String NRO_DOCUMENTO_MODIFICA) {
        this.NRO_DOCUMENTO_MODIFICA = NRO_DOCUMENTO_MODIFICA;
    }

    /**
     * @return the COD_TIPO_MOTIVO
     */
    public String getCOD_TIPO_MOTIVO() {
        return COD_TIPO_MOTIVO;
    }

    /**
     * @param COD_TIPO_MOTIVO the COD_TIPO_MOTIVO to set
     */
    public void setCOD_TIPO_MOTIVO(String COD_TIPO_MOTIVO) {
        this.COD_TIPO_MOTIVO = COD_TIPO_MOTIVO;
    }

    /**
     * @return the DESCRIPCION_MOTIVO
     */
    public String getDESCRIPCION_MOTIVO() {
        return DESCRIPCION_MOTIVO;
    }

    /**
     * @param DESCRIPCION_MOTIVO the DESCRIPCION_MOTIVO to set
     */
    public void setDESCRIPCION_MOTIVO(String DESCRIPCION_MOTIVO) {
        this.DESCRIPCION_MOTIVO = DESCRIPCION_MOTIVO;
    }

    /**
     * @return the NRO_COMPROBANTE
     */
    public String getNRO_COMPROBANTE() {
        return NRO_COMPROBANTE;
    }

    /**
     * @param NRO_COMPROBANTE the NRO_COMPROBANTE to set
     */
    public void setNRO_COMPROBANTE(String NRO_COMPROBANTE) {
        this.NRO_COMPROBANTE = NRO_COMPROBANTE;
    }

    /**
     * @return the FECHA_DOCUMENTO
     */
    public String getFECHA_DOCUMENTO() {
        return FECHA_DOCUMENTO;
    }

    /**
     * @param FECHA_DOCUMENTO the FECHA_DOCUMENTO to set
     */
    public void setFECHA_DOCUMENTO(String FECHA_DOCUMENTO) {
        this.FECHA_DOCUMENTO = FECHA_DOCUMENTO;
    }

    /**
     * @return the COD_TIPO_DOCUMENTO
     */
    public String getCOD_TIPO_DOCUMENTO() {
        return COD_TIPO_DOCUMENTO;
    }

    /**
     * @param COD_TIPO_DOCUMENTO the COD_TIPO_DOCUMENTO to set
     */
    public void setCOD_TIPO_DOCUMENTO(String COD_TIPO_DOCUMENTO) {
        this.COD_TIPO_DOCUMENTO = COD_TIPO_DOCUMENTO;
    }

    /**
     * @return the COD_MONEDA
     */
    public String getCOD_MONEDA() {
        return COD_MONEDA;
    }

    /**
     * @param COD_MONEDA the COD_MONEDA to set
     */
    public void setCOD_MONEDA(String COD_MONEDA) {
        this.COD_MONEDA = COD_MONEDA;
    }

    /**
     * @return the NRO_DOCUMENTO_CLIENTE
     */
    public String getNRO_DOCUMENTO_CLIENTE() {
        return NRO_DOCUMENTO_CLIENTE;
    }

    /**
     * @param NRO_DOCUMENTO_CLIENTE the NRO_DOCUMENTO_CLIENTE to set
     */
    public void setNRO_DOCUMENTO_CLIENTE(String NRO_DOCUMENTO_CLIENTE) {
        this.NRO_DOCUMENTO_CLIENTE = NRO_DOCUMENTO_CLIENTE;
    }

    /**
     * @return the COD_SUNAT
     */
    public String getCOD_SUNAT() {
        return COD_SUNAT;
    }

    /**
     * @param COD_SUNAT the COD_SUNAT to set
     */
    public void setCOD_SUNAT(String COD_SUNAT) {
        this.COD_SUNAT = COD_SUNAT;
    }

    /**
     * @return the RAZON_SOCIAL_CLIENTE
     */
    public String getRAZON_SOCIAL_CLIENTE() {
        return RAZON_SOCIAL_CLIENTE;
    }

    /**
     * @param RAZON_SOCIAL_CLIENTE the RAZON_SOCIAL_CLIENTE to set
     */
    public void setRAZON_SOCIAL_CLIENTE(String RAZON_SOCIAL_CLIENTE) {
        this.RAZON_SOCIAL_CLIENTE = RAZON_SOCIAL_CLIENTE;
    }

    /**
     * @return the TIPO_DOCUMENTO_CLIENTE
     */
    public String getTIPO_DOCUMENTO_CLIENTE() {
        return TIPO_DOCUMENTO_CLIENTE;
    }

    /**
     * @param TIPO_DOCUMENTO_CLIENTE the TIPO_DOCUMENTO_CLIENTE to set
     */
    public void setTIPO_DOCUMENTO_CLIENTE(String TIPO_DOCUMENTO_CLIENTE) {
        this.TIPO_DOCUMENTO_CLIENTE = TIPO_DOCUMENTO_CLIENTE;
    }

    /**
     * @return the DIRECCION_CLIENTE
     */
    public String getDIRECCION_CLIENTE() {
        return DIRECCION_CLIENTE;
    }

    /**
     * @param DIRECCION_CLIENTE the DIRECCION_CLIENTE to set
     */
    public void setDIRECCION_CLIENTE(String DIRECCION_CLIENTE) {
        this.DIRECCION_CLIENTE = DIRECCION_CLIENTE;
    }

    /**
     * @return the CIUDAD_CLIENTE
     */
    public String getCIUDAD_CLIENTE() {
        return CIUDAD_CLIENTE;
    }

    /**
     * @param CIUDAD_CLIENTE the CIUDAD_CLIENTE to set
     */
    public void setCIUDAD_CLIENTE(String CIUDAD_CLIENTE) {
        this.CIUDAD_CLIENTE = CIUDAD_CLIENTE;
    }

    /**
     * @return the COD_PAIS_CLIENTE
     */
    public String getCOD_PAIS_CLIENTE() {
        return COD_PAIS_CLIENTE;
    }

    /**
     * @param COD_PAIS_CLIENTE the COD_PAIS_CLIENTE to set
     */
    public void setCOD_PAIS_CLIENTE(String COD_PAIS_CLIENTE) {
        this.COD_PAIS_CLIENTE = COD_PAIS_CLIENTE;
    }

    /**
     * @return the NRO_DOCUMENTO_EMPRESA
     */
    public String getNRO_DOCUMENTO_EMPRESA() {
        return NRO_DOCUMENTO_EMPRESA;
    }

    /**
     * @param NRO_DOCUMENTO_EMPRESA the NRO_DOCUMENTO_EMPRESA to set
     */
    public void setNRO_DOCUMENTO_EMPRESA(String NRO_DOCUMENTO_EMPRESA) {
        this.NRO_DOCUMENTO_EMPRESA = NRO_DOCUMENTO_EMPRESA;
    }

    /**
     * @return the TIPO_DOC
     */
    public String getTIPO_DOC() {
        return TIPO_DOC;
    }

    /**
     * @param TIPO_DOC the TIPO_DOC to set
     */
    public void setTIPO_DOC(String TIPO_DOC) {
        this.TIPO_DOC = TIPO_DOC;
    }

    /**
     * @return the TIPO_DOCUMENTO_EMPRESA
     */
    public String getTIPO_DOCUMENTO_EMPRESA() {
        return TIPO_DOCUMENTO_EMPRESA;
    }

    /**
     * @param TIPO_DOCUMENTO_EMPRESA the TIPO_DOCUMENTO_EMPRESA to set
     */
    public void setTIPO_DOCUMENTO_EMPRESA(String TIPO_DOCUMENTO_EMPRESA) {
        this.TIPO_DOCUMENTO_EMPRESA = TIPO_DOCUMENTO_EMPRESA;
    }

    /**
     * @return the NOMBRE_COMERCIAL_EMPRESA
     */
    public String getNOMBRE_COMERCIAL_EMPRESA() {
        return NOMBRE_COMERCIAL_EMPRESA;
    }

    /**
     * @param NOMBRE_COMERCIAL_EMPRESA the NOMBRE_COMERCIAL_EMPRESA to set
     */
    public void setNOMBRE_COMERCIAL_EMPRESA(String NOMBRE_COMERCIAL_EMPRESA) {
        this.NOMBRE_COMERCIAL_EMPRESA = NOMBRE_COMERCIAL_EMPRESA;
    }

    /**
     * @return the CODIGO_UBIGEO_EMPRESA
     */
    public String getCODIGO_UBIGEO_EMPRESA() {
        return CODIGO_UBIGEO_EMPRESA;
    }

    /**
     * @param CODIGO_UBIGEO_EMPRESA the CODIGO_UBIGEO_EMPRESA to set
     */
    public void setCODIGO_UBIGEO_EMPRESA(String CODIGO_UBIGEO_EMPRESA) {
        this.CODIGO_UBIGEO_EMPRESA = CODIGO_UBIGEO_EMPRESA;
    }

    /**
     * @return the DIRECCION_EMPRESA
     */
    public String getDIRECCION_EMPRESA() {
        return DIRECCION_EMPRESA;
    }

    /**
     * @param DIRECCION_EMPRESA the DIRECCION_EMPRESA to set
     */
    public void setDIRECCION_EMPRESA(String DIRECCION_EMPRESA) {
        this.DIRECCION_EMPRESA = DIRECCION_EMPRESA;
    }

    /**
     * @return the DEPARTAMENTO_EMPRESA
     */
    public String getDEPARTAMENTO_EMPRESA() {
        return DEPARTAMENTO_EMPRESA;
    }

    /**
     * @param DEPARTAMENTO_EMPRESA the DEPARTAMENTO_EMPRESA to set
     */
    public void setDEPARTAMENTO_EMPRESA(String DEPARTAMENTO_EMPRESA) {
        this.DEPARTAMENTO_EMPRESA = DEPARTAMENTO_EMPRESA;
    }

    /**
     * @return the PROVINCIA_EMPRESA
     */
    public String getPROVINCIA_EMPRESA() {
        return PROVINCIA_EMPRESA;
    }

    /**
     * @param PROVINCIA_EMPRESA the PROVINCIA_EMPRESA to set
     */
    public void setPROVINCIA_EMPRESA(String PROVINCIA_EMPRESA) {
        this.PROVINCIA_EMPRESA = PROVINCIA_EMPRESA;
    }

    /**
     * @return the DISTRITO_EMPRESA
     */
    public String getDISTRITO_EMPRESA() {
        return DISTRITO_EMPRESA;
    }

    /**
     * @param DISTRITO_EMPRESA the DISTRITO_EMPRESA to set
     */
    public void setDISTRITO_EMPRESA(String DISTRITO_EMPRESA) {
        this.DISTRITO_EMPRESA = DISTRITO_EMPRESA;
    }

    /**
     * @return the CODIGO_PAIS_EMPRESA
     */
    public String getCODIGO_PAIS_EMPRESA() {
        return CODIGO_PAIS_EMPRESA;
    }

    /**
     * @param CODIGO_PAIS_EMPRESA the CODIGO_PAIS_EMPRESA to set
     */
    public void setCODIGO_PAIS_EMPRESA(String CODIGO_PAIS_EMPRESA) {
        this.CODIGO_PAIS_EMPRESA = CODIGO_PAIS_EMPRESA;
    }

    /**
     * @return the RAZON_SOCIAL_EMPRESA
     */
    public String getRAZON_SOCIAL_EMPRESA() {
        return RAZON_SOCIAL_EMPRESA;
    }

    /**
     * @param RAZON_SOCIAL_EMPRESA the RAZON_SOCIAL_EMPRESA to set
     */
    public void setRAZON_SOCIAL_EMPRESA(String RAZON_SOCIAL_EMPRESA) {
        this.RAZON_SOCIAL_EMPRESA = RAZON_SOCIAL_EMPRESA;
    }

    /**
     * @return the LOGO_EMP
     */
    public String getLOGO_EMP() {
        return LOGO_EMP;
    }

    /**
     * @param LOGO_EMP the LOGO_EMP to set
     */
    public void setLOGO_EMP(String LOGO_EMP) {
        this.LOGO_EMP = LOGO_EMP;
    }

    /**
     * @return the FIRMA_EMP
     */
    public String getFIRMA_EMP() {
        return FIRMA_EMP;
    }

    /**
     * @param FIRMA_EMP the FIRMA_EMP to set
     */
    public void setFIRMA_EMP(String FIRMA_EMP) {
        this.FIRMA_EMP = FIRMA_EMP;
    }

    /**
     * @return the WEB_EMP
     */
    public String getWEB_EMP() {
        return WEB_EMP;
    }

    /**
     * @param WEB_EMP the WEB_EMP to set
     */
    public void setWEB_EMP(String WEB_EMP) {
        this.WEB_EMP = WEB_EMP;
    }

    /**
     * @return the USUARIO_SOL_EMPRESA
     */
    public String getUSUARIO_SOL_EMPRESA() {
        return USUARIO_SOL_EMPRESA;
    }

    /**
     * @param USUARIO_SOL_EMPRESA the USUARIO_SOL_EMPRESA to set
     */
    public void setUSUARIO_SOL_EMPRESA(String USUARIO_SOL_EMPRESA) {
        this.USUARIO_SOL_EMPRESA = USUARIO_SOL_EMPRESA;
    }

    /**
     * @return the PASS_SOL_EMPRESA
     */
    public String getPASS_SOL_EMPRESA() {
        return PASS_SOL_EMPRESA;
    }

    /**
     * @param PASS_SOL_EMPRESA the PASS_SOL_EMPRESA to set
     */
    public void setPASS_SOL_EMPRESA(String PASS_SOL_EMPRESA) {
        this.PASS_SOL_EMPRESA = PASS_SOL_EMPRESA;
    }

    /**
     * @return the CONTRA
     */
    public String getCONTRA() {
        return CONTRA;
    }

    /**
     * @param CONTRA the CONTRA to set
     */
    public void setCONTRA(String CONTRA) {
        this.CONTRA = CONTRA;
    }

    /**
     * @return the CONTRA_FIRMA
     */
    public String getCONTRA_FIRMA() {
        return CONTRA_FIRMA;
    }

    /**
     * @param CONTRA_FIRMA the CONTRA_FIRMA to set
     */
    public void setCONTRA_FIRMA(String CONTRA_FIRMA) {
        this.CONTRA_FIRMA = CONTRA_FIRMA;
    }

    /**
     * @return the COD_RESPUESTA_SUNAT
     */
    public String getCOD_RESPUESTA_SUNAT() {
        return COD_RESPUESTA_SUNAT;
    }

    /**
     * @param COD_RESPUESTA_SUNAT the COD_RESPUESTA_SUNAT to set
     */
    public void setCOD_RESPUESTA_SUNAT(String COD_RESPUESTA_SUNAT) {
        this.COD_RESPUESTA_SUNAT = COD_RESPUESTA_SUNAT;
    }

    /**
     * @return the DESCRIPCION_RESPUESTA
     */
    public String getDESCRIPCION_RESPUESTA() {
        return DESCRIPCION_RESPUESTA;
    }

    /**
     * @param DESCRIPCION_RESPUESTA the DESCRIPCION_RESPUESTA to set
     */
    public void setDESCRIPCION_RESPUESTA(String DESCRIPCION_RESPUESTA) {
        this.DESCRIPCION_RESPUESTA = DESCRIPCION_RESPUESTA;
    }

    /**
     * @return the PLACA_VEHICULO
     */
    public String getPLACA_VEHICULO() {
        return PLACA_VEHICULO;
    }

    /**
     * @param PLACA_VEHICULO the PLACA_VEHICULO to set
     */
    public void setPLACA_VEHICULO(String PLACA_VEHICULO) {
        this.PLACA_VEHICULO = PLACA_VEHICULO;
    }

    /**
     * @return the NRO_COMPROBANTE_REF_ANT
     */
    public String getNRO_COMPROBANTE_REF_ANT() {
        return NRO_COMPROBANTE_REF_ANT;
    }

    /**
     * @param NRO_COMPROBANTE_REF_ANT the NRO_COMPROBANTE_REF_ANT to set
     */
    public void setNRO_COMPROBANTE_REF_ANT(String NRO_COMPROBANTE_REF_ANT) {
        this.NRO_COMPROBANTE_REF_ANT = NRO_COMPROBANTE_REF_ANT;
    }

    /**
     * @return the MONEDA_REGU_ANTICIPO
     */
    public String getMONEDA_REGU_ANTICIPO() {
        return MONEDA_REGU_ANTICIPO;
    }

    /**
     * @param MONEDA_REGU_ANTICIPO the MONEDA_REGU_ANTICIPO to set
     */
    public void setMONEDA_REGU_ANTICIPO(String MONEDA_REGU_ANTICIPO) {
        this.MONEDA_REGU_ANTICIPO = MONEDA_REGU_ANTICIPO;
    }

    /**
     * @return the TIPO_DOCUMENTO_EMP_REGU_ANT
     */
    public String getTIPO_DOCUMENTO_EMP_REGU_ANT() {
        return TIPO_DOCUMENTO_EMP_REGU_ANT;
    }

    /**
     * @param TIPO_DOCUMENTO_EMP_REGU_ANT the TIPO_DOCUMENTO_EMP_REGU_ANT to set
     */
    public void setTIPO_DOCUMENTO_EMP_REGU_ANT(String TIPO_DOCUMENTO_EMP_REGU_ANT) {
        this.TIPO_DOCUMENTO_EMP_REGU_ANT = TIPO_DOCUMENTO_EMP_REGU_ANT;
    }

    /**
     * @return the NRO_DOCUMENTO_EMP_REGU_ANT
     */
    public String getNRO_DOCUMENTO_EMP_REGU_ANT() {
        return NRO_DOCUMENTO_EMP_REGU_ANT;
    }

    /**
     * @param NRO_DOCUMENTO_EMP_REGU_ANT the NRO_DOCUMENTO_EMP_REGU_ANT to set
     */
    public void setNRO_DOCUMENTO_EMP_REGU_ANT(String NRO_DOCUMENTO_EMP_REGU_ANT) {
        this.NRO_DOCUMENTO_EMP_REGU_ANT = NRO_DOCUMENTO_EMP_REGU_ANT;
    }

    /**
     * @return the ESTADO
     */
    public String getESTADO() {
        return ESTADO;
    }

    /**
     * @param ESTADO the ESTADO to set
     */
    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }

    /**
     * @return the HASH_CPE
     */
    public String getHASH_CPE() {
        return HASH_CPE;
    }

    /**
     * @param HASH_CPE the HASH_CPE to set
     */
    public void setHASH_CPE(String HASH_CPE) {
        this.HASH_CPE = HASH_CPE;
    }

    /**
     * @return the HASH_CDR
     */
    public String getHASH_CDR() {
        return HASH_CDR;
    }

    /**
     * @param HASH_CDR the HASH_CDR to set
     */
    public void setHASH_CDR(String HASH_CDR) {
        this.HASH_CDR = HASH_CDR;
    }

    /**
     * @return the ID_USUARIO
     */
    public String getID_USUARIO() {
        return ID_USUARIO;
    }

    /**
     * @param ID_USUARIO the ID_USUARIO to set
     */
    public void setID_USUARIO(String ID_USUARIO) {
        this.ID_USUARIO = ID_USUARIO;
    }

    /**
     * @return the FECHA_VTO
     */
    public String getFECHA_VTO() {
        return FECHA_VTO;
    }

    /**
     * @param FECHA_VTO the FECHA_VTO to set
     */
    public void setFECHA_VTO(String FECHA_VTO) {
        this.FECHA_VTO = FECHA_VTO;
    }

    /**
     * @return the TELEFONO_PRINCIPAL
     */
    public String getTELEFONO_PRINCIPAL() {
        return TELEFONO_PRINCIPAL;
    }

    /**
     * @param TELEFONO_PRINCIPAL the TELEFONO_PRINCIPAL to set
     */
    public void setTELEFONO_PRINCIPAL(String TELEFONO_PRINCIPAL) {
        this.TELEFONO_PRINCIPAL = TELEFONO_PRINCIPAL;
    }

    /**
     * @return the COD_SUCURSAL
     */
    public String getCOD_SUCURSAL() {
        return COD_SUCURSAL;
    }

    /**
     * @param COD_SUCURSAL the COD_SUCURSAL to set
     */
    public void setCOD_SUCURSAL(String COD_SUCURSAL) {
        this.COD_SUCURSAL = COD_SUCURSAL;
    }

    /**
     * @return the DIRECCION_SUCURSAL
     */
    public String getDIRECCION_SUCURSAL() {
        return DIRECCION_SUCURSAL;
    }

    /**
     * @param DIRECCION_SUCURSAL the DIRECCION_SUCURSAL to set
     */
    public void setDIRECCION_SUCURSAL(String DIRECCION_SUCURSAL) {
        this.DIRECCION_SUCURSAL = DIRECCION_SUCURSAL;
    }

    /**
     * @return the TELEFONO_SUCURSAL
     */
    public String getTELEFONO_SUCURSAL() {
        return TELEFONO_SUCURSAL;
    }

    /**
     * @param TELEFONO_SUCURSAL the TELEFONO_SUCURSAL to set
     */
    public void setTELEFONO_SUCURSAL(String TELEFONO_SUCURSAL) {
        this.TELEFONO_SUCURSAL = TELEFONO_SUCURSAL;
    }

    /**
     * @return the FORMA_PAGO
     */
    public String getFORMA_PAGO() {
        return FORMA_PAGO;
    }

    /**
     * @param FORMA_PAGO the FORMA_PAGO to set
     */
    public void setFORMA_PAGO(String FORMA_PAGO) {
        this.FORMA_PAGO = FORMA_PAGO;
    }

    /**
     * @return the GLOSA
     */
    public String getGLOSA() {
        return GLOSA;
    }

    /**
     * @param GLOSA the GLOSA to set
     */
    public void setGLOSA(String GLOSA) {
        this.GLOSA = GLOSA;
    }

    /**
     * @return the SERIE
     */
    public String getSERIE() {
        return SERIE;
    }

    /**
     * @param SERIE the SERIE to set
     */
    public void setSERIE(String SERIE) {
        this.SERIE = SERIE;
    }

    /**
     * @return the NUMERO
     */
    public String getNUMERO() {
        return NUMERO;
    }

    /**
     * @param NUMERO the NUMERO to set
     */
    public void setNUMERO(String NUMERO) {
        this.NUMERO = NUMERO;
    }

    /**
     * @return the RUTA_PDF
     */
    public String getRUTA_PDF() {
        return RUTA_PDF;
    }

    /**
     * @param RUTA_PDF the RUTA_PDF to set
     */
    public void setRUTA_PDF(String RUTA_PDF) {
        this.RUTA_PDF = RUTA_PDF;
    }

    /**
     * @return the RUTA_PDF_2_NUVE
     */
    public String getRUTA_PDF_2_NUVE() {
        return RUTA_PDF_2_NUVE;
    }

    /**
     * @param RUTA_PDF_2_NUVE the RUTA_PDF_2_NUVE to set
     */
    public void setRUTA_PDF_2_NUVE(String RUTA_PDF_2_NUVE) {
        this.RUTA_PDF_2_NUVE = RUTA_PDF_2_NUVE;
    }

    /**
     * @return the ESTADO_DE_DOC
     */
    public String getESTADO_DE_DOC() {
        return ESTADO_DE_DOC;
    }

    /**
     * @param ESTADO_DE_DOC the ESTADO_DE_DOC to set
     */
    public void setESTADO_DE_DOC(String ESTADO_DE_DOC) {
        this.ESTADO_DE_DOC = ESTADO_DE_DOC;
    }

    /**
     * @return the RUTA_CODIGO_BARRA
     */
    public String getRUTA_CODIGO_BARRA() {
        return RUTA_CODIGO_BARRA;
    }

    /**
     * @param RUTA_CODIGO_BARRA the RUTA_CODIGO_BARRA to set
     */
    public void setRUTA_CODIGO_BARRA(String RUTA_CODIGO_BARRA) {
        this.RUTA_CODIGO_BARRA = RUTA_CODIGO_BARRA;
    }

    /**
     * @return the MONTO_REGU_ANTICIPO
     */
    public double getMONTO_REGU_ANTICIPO() {
        return MONTO_REGU_ANTICIPO;
    }

    /**
     * @param MONTO_REGU_ANTICIPO the MONTO_REGU_ANTICIPO to set
     */
    public void setMONTO_REGU_ANTICIPO(double MONTO_REGU_ANTICIPO) {
        this.MONTO_REGU_ANTICIPO = MONTO_REGU_ANTICIPO;
    }

    /**
     * @return the TIPO_PROCESO
     */
    public int getTIPO_PROCESO() {
        return TIPO_PROCESO;
    }

    /**
     * @param TIPO_PROCESO the TIPO_PROCESO to set
     */
    public void setTIPO_PROCESO(int TIPO_PROCESO) {
        this.TIPO_PROCESO = TIPO_PROCESO;
    }

    /**
     * @return the FLG_ANTICIPO
     */
    public int getFLG_ANTICIPO() {
        return FLG_ANTICIPO;
    }

    /**
     * @param FLG_ANTICIPO the FLG_ANTICIPO to set
     */
    public void setFLG_ANTICIPO(int FLG_ANTICIPO) {
        this.FLG_ANTICIPO = FLG_ANTICIPO;
    }

    /**
     * @return the FLG_REGU_ANTICIPO
     */
    public int getFLG_REGU_ANTICIPO() {
        return FLG_REGU_ANTICIPO;
    }

    /**
     * @param FLG_REGU_ANTICIPO the FLG_REGU_ANTICIPO to set
     */
    public void setFLG_REGU_ANTICIPO(int FLG_REGU_ANTICIPO) {
        this.FLG_REGU_ANTICIPO = FLG_REGU_ANTICIPO;
    }

    /**
     * @return the TIPO
     */
    public int getTIPO() {
        return TIPO;
    }

    /**
     * @param TIPO the TIPO to set
     */
    public void setTIPO(int TIPO) {
        this.TIPO = TIPO;
    }

    /**
     * @return the ID_FORMA_PAGO
     */
    public int getID_FORMA_PAGO() {
        return ID_FORMA_PAGO;
    }

    /**
     * @param ID_FORMA_PAGO the ID_FORMA_PAGO to set
     */
    public void setID_FORMA_PAGO(int ID_FORMA_PAGO) {
        this.ID_FORMA_PAGO = ID_FORMA_PAGO;
    }

    /**
     * @return the ID_ALMACEN
     */
    public int getID_ALMACEN() {
        return ID_ALMACEN;
    }

    /**
     * @param ID_ALMACEN the ID_ALMACEN to set
     */
    public void setID_ALMACEN(int ID_ALMACEN) {
        this.ID_ALMACEN = ID_ALMACEN;
    }

    /**
     * @return the ID_REFERENCIA
     */
    public int getID_REFERENCIA() {
        return ID_REFERENCIA;
    }

    /**
     * @param ID_REFERENCIA the ID_REFERENCIA to set
     */
    public void setID_REFERENCIA(int ID_REFERENCIA) {
        this.ID_REFERENCIA = ID_REFERENCIA;
    }
        
   




 
}
