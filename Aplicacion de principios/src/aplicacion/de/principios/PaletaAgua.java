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
    
    @Override
    public void preparar(){
        for(int i = 0; i<=500000000; i++){
            switch(i){
                case 100000000:
                    System.err.println("preparando paleta de agua sabor: "+sabor );
                    break;
                case 200000000:
                    System.err.println("licuando agua con saborizante : "+sabor);
                    break;
                case 300000000:
                    System.err.println("colocando molde");
                    break;
                case 400000000:
                    System.err.println("congelando");
                    break;
                case 500000000:
                    System.err.println("sirviendo paleta de agua sabor :"+sabor);
                    break;
            }
        }
    }
       
}
