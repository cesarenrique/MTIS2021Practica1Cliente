//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.06.05 a las 01:46:24 PM CEST 
//


package org.mtis.www.validaciones;

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
 *         &lt;group ref="{http://www.mtis.org/Validaciones/}validacion"/&gt;
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
    "valido",
    "hecho",
    "tipo",
    "error"
})
@XmlRootElement(name = "ValidarNAFSSResponse")
public class ValidarNAFSSResponse {

    protected boolean valido;
    protected boolean hecho;
    protected int tipo;
    @XmlElement(required = true)
    protected String error;

    /**
     * Obtiene el valor de la propiedad valido.
     * 
     */
    public boolean isValido() {
        return valido;
    }

    /**
     * Define el valor de la propiedad valido.
     * 
     */
    public void setValido(boolean value) {
        this.valido = value;
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

}
