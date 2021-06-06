package org.mtis.www.vista.web.app.clientes;

import org.mtis.www.controlPresencia.ControlEmpleadosSala;
import org.mtis.www.controlPresencia.ControlEmpleadosSalaResponse;
import org.mtis.www.controlPresencia.Eliminar;
import org.mtis.www.controlPresencia.EliminarResponse;
import org.mtis.www.controlPresencia.ObjectFactory;
import org.mtis.www.controlPresencia.Registrar;
import org.mtis.www.controlPresencia.RegistrarResponse;
import org.mtis.www.vista.web.app.controllers.ControlPresenciaData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;


public class ControlPresenciaCliente extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(ControlPresenciaCliente.class);


    public RegistrarResponse controlPresenciaRegistrar(ControlPresenciaData presencia) {

    	RegistrarResponse response;
        ObjectFactory objfactory=new ObjectFactory();

        Registrar request = objfactory.createRegistrar();
        request.setNIF(presencia.getNIF());
        request.setCodigoSala(presencia.getCodigoSala());

        response = (RegistrarResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/axis2/services/ControlPresencia?wsdl",request);

        return response;
    }
    

    public EliminarResponse controlPresenciaEliminar(ControlPresenciaData presencia) {

    	EliminarResponse response;
        ObjectFactory objfactory=new ObjectFactory();

        Eliminar request = objfactory.createEliminar();
        request.setNIF(presencia.getNIF());
        request.setCodigoSala(presencia.getCodigoSala());

        response = (EliminarResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/axis2/services/ControlPresencia?wsdl",request);

        return response;
    }
    
    
    public ControlEmpleadosSalaResponse controlPresenciaConsultar(String codigoSala) {

    	ControlEmpleadosSalaResponse response;
        ObjectFactory objfactory=new ObjectFactory();

        ControlEmpleadosSala request = objfactory.createControlEmpleadosSala();
        request.setCodigoSala(codigoSala);

        response = (ControlEmpleadosSalaResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/axis2/services/ControlPresencia?wsdl",request);

        return response;
    }
    



}