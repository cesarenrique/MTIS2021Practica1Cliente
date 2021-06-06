package org.mtis.www.vista.web.app.clientes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ControlAccesoConfiguration {
	
    @Bean
    public Jaxb2Marshaller marshaller5() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("org.mtis.www.controlAcceso");
        return marshaller;
    }

    @Bean
    public ControlAccesoCliente controlAccesoClient(Jaxb2Marshaller marshaller5) {
    	ControlAccesoCliente client = new ControlAccesoCliente();
        client.setDefaultUri("http://localhost:8080/axis2/services/ControlAcceso/");
        client.setMarshaller(marshaller5);
        client.setUnmarshaller(marshaller5);
        return client;
    }
}
