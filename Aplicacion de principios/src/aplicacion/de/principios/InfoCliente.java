/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.de.principios;



/**
 *
 * @author Juancho
 */
public class InfoCliente {
    
    public void obtener(Persona P){
        Lector l = new Lector();
        P.Nombre = l.leerstring("digite el nombre del cliente");
        P.id =l.leerint("digite el codigo del cliente");
    }
}
