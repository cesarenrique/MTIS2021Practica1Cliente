package org.mtis.www.vista.web.app.clientes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.mtis.www.controlAcceso.Consultar;
import org.mtis.www.controlAcceso.ConsultarResponse;
import org.mtis.www.controlAcceso.ObjectFactory;
import org.mtis.www.controlAcceso.Registrar;
import org.mtis.www.controlAcceso.RegistrarResponse;
import org.mtis.www.vista.web.app.controllers.EntidadAccesoData;
import org.mtis.www.vista.web.app.controllers.EntidadAccesoFechasData;


public class ControlAccesoCliente extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(ControlAccesoCliente.class);


    public RegistrarResponse controlAccesoRegistrar(EntidadAccesoData entidad) {

    	RegistrarResponse response;
        ObjectFactory objfactory=new ObjectFactory();

        Registrar request = objfactory.createRegistrar() ;
        request.setNIF(entidad.getNIF());
        request.setCodigoSala(entidad.getCodigoSala());
        request.setCodigoDispositivo(entidad.getCodigoDispositivo());

        response = (RegistrarResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/axis2/services/ControlAcceso?wsdl",request);

        return response;
    }
    

    public ConsultarResponse controlAccesoConsultar(EntidadAccesoFechasData entidad) {

    	ConsultarResponse response;
        ObjectFactory objfactory=new ObjectFactory();

        Consultar request = objfactory.createConsultar() ;
        request.setNIF(entidad.getNIF());
        request.setCodigoSala(entidad.getCodigoSala());
        request.setCodigoDispositivo(entidad.getCodigoDispositivo());
        request.setFechaDesde(entidad.getFechaDesde());
        request.setFechaHasta(entidad.getFechaHasta());

        response = (ConsultarResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/axis2/services/ControlAcceso?wsdl",request);

        return response;
    }


}