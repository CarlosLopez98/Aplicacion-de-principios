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
public class Consola {
    InfoCliente IC = new InfoCliente();
    Persona p = new Persona();
    TipoHelados th = new TipoHelados();
    TipoSaborA tsa = new TipoSaborA();
    TiposSaborY tsy = new TiposSaborY();
    Consola(){
        inicio();
    }
    
    public void inicio(){
        System.out.println("Bienvenido a la heladeria del pinguino");
        IC.obtener(p);
        System.out.println("¿que tipo de helado desea?");
        
        switch(th.listartipos()){
            case 0:
                System.out.println("¿que sabor desea?");
                tsa.listartipos();
            break;
            case 1:
                System.out.println("¿que sabor desea?");
                tsy.listartipos();
        }
    }
}
