//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.06.06 a las 06:10:02 PM CEST 
//


package org.mtis.www.controlAcceso;

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
 *         &lt;group ref="{http://www.mtis.org/ControlAcceso/}Acceso"/&gt;
 *         &lt;element name="fechaDesde" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaHasta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "nif",
    "codigoSala",
    "codigoDispositivo",
    "fechaDesde",
    "fechaHasta"
})
@XmlRootElement(name = "Consultar")
public class Consultar {

    @XmlElement(name = "NIF", required = true)
    protected String nif;
    @XmlElement(required = true)
    protected String codigoSala;
    @XmlElement(required = true)
    protected String codigoDispositivo;
    @XmlElement(required = true)
    protected String fechaDesde;
    @XmlElement(required = true)
    protected String fechaHasta;

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
     * Obtiene el valor de la propiedad fechaDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDesde() {
        return fechaDesde;
    }

    /**
     * Define el valor de la propiedad fechaDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDesde(String value) {
        this.fechaDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaHasta() {
        return fechaHasta;
    }

    /**
     * Define el valor de la propiedad fechaHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaHasta(String value) {
        this.fechaHasta = value;
    }

}
