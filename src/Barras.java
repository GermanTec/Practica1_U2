/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro Orozco
 */
public class Barras {
    int x;
    int y;
    Barras barra;
    BarraEstadistica b;
    int ancho;
    int alto;
    BarraEstadistica puntero;
    public Barras(int posx,int posy,int posancho,int posalto){
    x=posx;
    y=posy;
    //barra=new Barras();
    ancho=posancho;
    alto=posalto;
    }
}
