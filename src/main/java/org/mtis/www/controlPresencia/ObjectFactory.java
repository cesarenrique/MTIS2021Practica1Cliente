//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.06.06 a las 08:08:53 PM CEST 
//


package org.mtis.www.controlPresencia;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mtis.www.controlPresencia package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mtis.www.controlPresencia
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Registrar }
     * 
     */
    public Registrar createRegistrar() {
        return new Registrar();
    }

    /**
     * Create an instance of {@link RegistrarResponse }
     * 
     */
    public RegistrarResponse createRegistrarResponse() {
        return new RegistrarResponse();
    }

    /**
     * Create an instance of {@link Eliminar }
     * 
     */
    public Eliminar createEliminar() {
        return new Eliminar();
    }

    /**
     * Create an instance of {@link EliminarResponse }
     * 
     */
    public EliminarResponse createEliminarResponse() {
        return new EliminarResponse();
    }

    /**
     * Create an instance of {@link ControlEmpleadosSala }
     * 
     */
    public ControlEmpleadosSala createControlEmpleadosSala() {
        return new ControlEmpleadosSala();
    }

    /**
     * Create an instance of {@link ControlEmpleadosSalaResponse }
     * 
     */
    public ControlEmpleadosSalaResponse createControlEmpleadosSalaResponse() {
        return new ControlEmpleadosSalaResponse();
    }

}
