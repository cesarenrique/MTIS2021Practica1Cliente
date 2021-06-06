//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.06.06 a las 11:58:08 AM CEST 
//


package org.mtis.www.empleados;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mtis.www.empleados package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mtis.www.empleados
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Nuevo }
     * 
     */
    public Nuevo createNuevo() {
        return new Nuevo();
    }

    /**
     * Create an instance of {@link NuevoResponse }
     * 
     */
    public NuevoResponse createNuevoResponse() {
        return new NuevoResponse();
    }

    /**
     * Create an instance of {@link Borrar }
     * 
     */
    public Borrar createBorrar() {
        return new Borrar();
    }

    /**
     * Create an instance of {@link BorrarResponse }
     * 
     */
    public BorrarResponse createBorrarResponse() {
        return new BorrarResponse();
    }

    /**
     * Create an instance of {@link Modificar }
     * 
     */
    public Modificar createModificar() {
        return new Modificar();
    }

    /**
     * Create an instance of {@link ModificarResponse }
     * 
     */
    public ModificarResponse createModificarResponse() {
        return new ModificarResponse();
    }

    /**
     * Create an instance of {@link Consultar }
     * 
     */
    public Consultar createConsultar() {
        return new Consultar();
    }

    /**
     * Create an instance of {@link ConsultarResponse }
     * 
     */
    public ConsultarResponse createConsultarResponse() {
        return new ConsultarResponse();
    }

}
