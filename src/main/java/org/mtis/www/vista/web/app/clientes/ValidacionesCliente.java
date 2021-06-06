package org.mtis.www.vista.web.app.clientes;

import org.mtis.www.validaciones.ObjectFactory;
import org.mtis.www.validaciones.ValidarIBAN;
import org.mtis.www.validaciones.ValidarIBANResponse;
import org.mtis.www.validaciones.ValidarNAFSS;
import org.mtis.www.validaciones.ValidarNAFSSResponse;
import org.mtis.www.validaciones.ValidarNIF;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;


import org.mtis.www.validaciones.ValidarNIFResponse;


public class ValidacionesCliente extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(ValidacionesCliente.class);


    public ValidarNIFResponse validadNIF(String NIF) {

        ValidarNIFResponse response;
        ObjectFactory objfactory=new ObjectFactory();

        ValidarNIF request = objfactory.createValidarNIF() ;
        request.setNIF(NIF);


        response = (ValidarNIFResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/axis2/services/Validaciones?wsdl",request);

        return response;
    }
    
    public ValidarIBANResponse validadIBAN(String IBAN) {

        ValidarIBANResponse response;
        ObjectFactory objfactory=new ObjectFactory();

        ValidarIBAN request = objfactory.createValidarIBAN() ;
        request.setIBAN(IBAN);


        response = (ValidarIBANResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/axis2/services/Validaciones?wsdl",request);

        return response;
    }
    
    
    public ValidarNAFSSResponse validadNAFSS(String NAFSS) {

        ValidarNAFSSResponse response;
        ObjectFactory objfactory=new ObjectFactory();

        ValidarNAFSS request = objfactory.createValidarNAFSS() ;
        request.setNAFSS(NAFSS);


        response = (ValidarNAFSSResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/axis2/services/Validaciones?wsdl",request);

        return response;
    }

}