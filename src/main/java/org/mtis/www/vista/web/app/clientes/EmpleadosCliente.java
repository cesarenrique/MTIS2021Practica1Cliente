package org.mtis.www.vista.web.app.clientes;

import org.mtis.www.empleados.Borrar;
import org.mtis.www.empleados.BorrarResponse;
import org.mtis.www.empleados.Consultar;
import org.mtis.www.empleados.ConsultarResponse;
import org.mtis.www.empleados.Modificar;
import org.mtis.www.empleados.ModificarResponse;
import org.mtis.www.empleados.Nuevo;
import org.mtis.www.empleados.NuevoResponse;
import org.mtis.www.empleados.ObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import org.mtis.www.vista.web.app.controllers.EmpleadoData;


public class EmpleadosCliente extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(EmpleadosCliente.class);


    public NuevoResponse crearNuevoEmpleado(EmpleadoData empleado) {

    	NuevoResponse response;
        ObjectFactory objfactory=new ObjectFactory();

        Nuevo request = objfactory.createNuevo() ;
        request.setNIF(empleado.getNIF());
        request.setNombre(empleado.getNombre());
        request.setApellidos(empleado.getApellidos());
        request.setDireccion(empleado.getDireccion());
        request.setPoblacion(empleado.getPoblacion());
        request.setTelefono(empleado.getTelefono());
        request.setEmail(empleado.getEmail());
        request.setFechaNacimiento(empleado.getFechaNacimiento());
        request.setNaf(empleado.getNaf());
        request.setIban(empleado.getIban());
        request.setIban(empleado.getIban());
        request.setNivel(empleado.getNivel());
        request.setUsuario(empleado.getUsuario());
        request.setPassword(empleado.getPassword());
        request.setValido(empleado.getValido());
        
        response = (NuevoResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/axis2/services/Empleados?wsdl",request);

        return response;
    }

    public ConsultarResponse consultarEmpleado(String NIF) {

    	ConsultarResponse response;
        ObjectFactory objfactory=new ObjectFactory();
        Consultar request=objfactory.createConsultar();
        request.setNIF(NIF);
        
        response = (ConsultarResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/axis2/services/Empleados?wsdl",request);

        return response;
    }
    
    public ModificarResponse modificarEmpleado(EmpleadoData empleado) {

    	ModificarResponse response;
        ObjectFactory objfactory=new ObjectFactory();
        Modificar request=objfactory.createModificar();
        request.setNIF(empleado.getNIF());
        request.setNombre(empleado.getNombre());
        request.setApellidos(empleado.getApellidos());
        request.setDireccion(empleado.getDireccion());
        request.setPoblacion(empleado.getPoblacion());
        request.setTelefono(empleado.getTelefono());
        request.setEmail(empleado.getEmail());
        request.setFechaNacimiento(empleado.getFechaNacimiento());
        request.setNaf(empleado.getNaf());
        request.setIban(empleado.getIban());
        request.setIban(empleado.getIban());
        request.setNivel(empleado.getNivel());
        request.setUsuario(empleado.getUsuario());
        request.setPassword(empleado.getPassword());
        request.setValido(empleado.getValido());
        
        response = (ModificarResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/axis2/services/Empleados?wsdl",request);

        return response;
    }
    
    public BorrarResponse borrarEmpleado(String NIF) {

    	BorrarResponse response;
        ObjectFactory objfactory=new ObjectFactory();
        Borrar request=objfactory.createBorrar();
        request.setNIF(NIF);
        
        response = (BorrarResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/axis2/services/Empleados?wsdl",request);

        return response;
    }
}