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
 *         &lt;element name="NAFSS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "nafss"
})
@XmlRootElement(name = "ValidarNAFSS")
public class ValidarNAFSS {

    @XmlElement(name = "NAFSS", required = true)
    protected String nafss;

    /**
     * Obtiene el valor de la propiedad nafss.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAFSS() {
        return nafss;
    }

    /**
     * Define el valor de la propiedad nafss.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAFSS(String value) {
        this.nafss = value;
    }

}
