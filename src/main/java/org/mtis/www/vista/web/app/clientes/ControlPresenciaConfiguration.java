package org.mtis.www.vista.web.app.clientes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ControlPresenciaConfiguration {
	
    @Bean
    public Jaxb2Marshaller marshaller3() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("org.mtis.www.controlPresencia");
        return marshaller;
    }

    @Bean
    public ControlPresenciaCliente controlPresenciaClient(Jaxb2Marshaller marshaller3) {
    	ControlPresenciaCliente client = new ControlPresenciaCliente();
        client.setDefaultUri("http://localhost:8080/axis2/services/ControlPresencia");
        client.setMarshaller(marshaller3);
        client.setUnmarshaller(marshaller3);
        return client;
    }
}
