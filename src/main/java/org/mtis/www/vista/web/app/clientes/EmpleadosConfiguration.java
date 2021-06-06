package org.mtis.www.vista.web.app.clientes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class EmpleadosConfiguration {
	
    @Bean
    public Jaxb2Marshaller marshaller2() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("org.mtis.www.empleados");
        return marshaller;
    }

    @Bean
    public EmpleadosCliente empleadosClient(Jaxb2Marshaller marshaller2) {
    	EmpleadosCliente client = new EmpleadosCliente();
        client.setDefaultUri("http://localhost:8080/axis2/services/Empleados/");
        client.setMarshaller(marshaller2);
        client.setUnmarshaller(marshaller2);
        return client;
    }
}
