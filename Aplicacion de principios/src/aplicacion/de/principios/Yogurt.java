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
public class Yogurt extends Helado{
    int numerobolas;
    String[] helado;
    TiposSaborY tsy = new TiposSaborY();
    Lector l = new Lector();

    public Yogurt() {
    numerobolas = l.leerint("digite la cantidad de bolas que desea entre 1 y 4");
    Nombre =("helado de yogurt de "+numerobolas+" bola(s)");
    precio= 2000+ ((numerobolas-1)*1000);
    
    }
    
    public void definirhelado(){
        helado = new String[numerobolas];
        for (int i = 0; i < numerobolas; i++) {
            helado[i]= tsy.devolversabor(tsy.listartipos());
        }
    }
    
    @Override
    public void preparar(){
        for(int i = 0; i<=500000000; i++){
            switch(i){
                case 100000000:
                    System.err.println("preparando "+Nombre);
                    break;
                case 200000000:
                    System.err.println("colocando base de galleta :");
                    break;
                case 300000000:
                    for (int j = 0; j < numerobolas; j++) {
                        System.err.println("colocando bola de helado sabor: "+ helado[j]);
                    }
                    break;
                case 400000000:
                    System.err.println("agregando chispas de colores");
                    break;
                case 500000000:
                    System.err.println("sirviendo");
                    break;
            }
        }
    }
    
}
