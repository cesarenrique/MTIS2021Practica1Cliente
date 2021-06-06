package org.mtis.www.vista.web.app.clientes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ValidacionesConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("org.mtis.www.validaciones");
        return marshaller;
    }

 
    @Bean
    public ValidacionesCliente validacionesClient(Jaxb2Marshaller marshaller) {
        ValidacionesCliente client = new ValidacionesCliente();
        client.setDefaultUri("http://localhost:8080/axis2/services/Validaciones/");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}