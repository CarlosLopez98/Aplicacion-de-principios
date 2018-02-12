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
public class PaletaAgua extends Helado{
     private String sabor;
     TipoSaborA tsa = new TipoSaborA();

    public PaletaAgua() {
        precio=2000;
        sabor= (tsa.devolversabor(tsa.listartipos()));
        Nombre=("paleta de agua sabor: "+sabor);
    }
    
    public void preparar(){
        System.err.println("preparando paleta de agua sabor: "+sabor );
        System.err.println("licuando agua con saborizante : "+sabor);
        System.err.println("colocando en molde");
        System.err.println("congelando");
        System.err.println("sirviendo paleta de agua sabor : "+sabor);
    }
       
}
