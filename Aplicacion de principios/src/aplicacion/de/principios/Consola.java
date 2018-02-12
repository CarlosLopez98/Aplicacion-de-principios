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
    
    Consola(){
        inicio();
    }
    
    public void inicio(){
        System.out.println("Bienvenido a la heladeria del pinguino");
        IC.obtener(p);
        System.out.println("¿que tipo de helado desea?");
        
        switch(th.listartipos()){
            case 0:
                PaletaAgua pa = new PaletaAgua();
                pa.preparar();

            break;
            case 1:
                Yogurt y = new Yogurt();
                y.definirhelado();
                y.preparar();
            break;
        }
    }
}
