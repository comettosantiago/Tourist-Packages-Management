/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controls.ClienteData;
import Controls.Conexion;
import Controls.DestinoData;
import Controls.TransporteData;
import Models.Cliente;
import Models.Destino;
import Models.Transporte;

/**
 *
 * @author Santiago Cometto
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //conexiones-----------------------------------
        Conexion con = new Conexion();

        ClienteData cd = new ClienteData(con);

        DestinoData dd = new DestinoData(con);

        //clientes-------------------------------------
        Cliente santi = new Cliente(5, 42278453, "Santiago", "Cometto", "Calle 123", "San Luis", "2657770031", "santiagustinvm@gmail.com");

        Cliente lean = new Cliente(31125897, "Leando", "Damiani", "Calle 321", "San Luis", "2657751698", "leandroelfacha@gmail.com");
        
        //System.out.println(cd.buscarCliente(8));

        //System.out.println(cd.listarClientes());

        //destinos--------------------------------------
        Destino villacp = new Destino(9, "Villa Carlos Paz", "Argentina", true);
        
        //System.out.println(dd.buscarDestino(7));
        
        //dd.editarDestino(villacp);
        
        //dd.eliminarDestino(5);
        
        //System.out.println(dd.listarTodosLosDestinos());
        
        //transportes----------------------------------
        TransporteData td = new TransporteData(con);
        
        Transporte avionazo = new Transporte(19, villacp, "Colectivo", 8000, true);
        
        //System.out.println(avionazo.getCostoTransporte());
        
        //td.agregarTransporte(avionazo);            
        
        //System.out.println(td.buscarTransporte(13));
        
        //td.eliminarTransporte(2);
        
        //td.editarTransporte(avionazo);
        
        //System.out.println(td.listarTransportesActivos());
        
        //System.out.println(td.listarTodosLosTransportes());
        
        
            
            
            
            
            
        
        
        
        

    }

}
