//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.06.06 a las 06:10:02 PM CEST 
//


package org.mtis.www.controlAcceso;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.mtis.org/ControlAcceso/}registro" maxOccurs="unbounded"/&gt;
 *         &lt;group ref="{http://www.mtis.org/ControlAcceso/}resultado"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "registro",
    "hecho",
    "tipo",
    "error"
})
@XmlRootElement(name = "ConsultarResponse")
public class ConsultarResponse {

    @XmlElement(name = "entidad", required = true)
    protected List<ConsultarResponse.Entidad> registro;
    protected boolean hecho;
    protected int tipo;
    @XmlElement(required = true)
    protected String error;

    /**
     * Gets the value of the registro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultarResponse.Entidad }
     * 
     * 
     */
    public List<ConsultarResponse.Entidad> getRegistro() {
        if (registro == null) {
            registro = new ArrayList<ConsultarResponse.Entidad>();
        }
        return this.registro;
    }

    /**
     * Obtiene el valor de la propiedad hecho.
     * 
     */
    public boolean isHecho() {
        return hecho;
    }

    /**
     * Define el valor de la propiedad hecho.
     * 
     */
    public void setHecho(boolean value) {
        this.hecho = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     */
    public void setTipo(int value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad error.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Define el valor de la propiedad error.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;group ref="{http://www.mtis.org/ControlAcceso/}tupla"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nif",
        "codigoSala",
        "codigoDispositivo",
        "fechaHora"
    })
    public static class Entidad {

        @XmlElement(name = "NIF", required = true)
        protected String nif;
        @XmlElement(required = true)
        protected String codigoSala;
        @XmlElement(required = true)
        protected String codigoDispositivo;
        @XmlElement(required = true)
        protected String fechaHora;

        /**
         * Obtiene el valor de la propiedad nif.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNIF() {
            return nif;
        }

        /**
         * Define el valor de la propiedad nif.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNIF(String value) {
            this.nif = value;
        }

        /**
         * Obtiene el valor de la propiedad codigoSala.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoSala() {
            return codigoSala;
        }

        /**
         * Define el valor de la propiedad codigoSala.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoSala(String value) {
            this.codigoSala = value;
        }

        /**
         * Obtiene el valor de la propiedad codigoDispositivo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoDispositivo() {
            return codigoDispositivo;
        }

        /**
         * Define el valor de la propiedad codigoDispositivo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoDispositivo(String value) {
            this.codigoDispositivo = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaHora.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFechaHora() {
            return fechaHora;
        }

        /**
         * Define el valor de la propiedad fechaHora.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFechaHora(String value) {
            this.fechaHora = value;
        }

    }

}
