/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;

/**
 *
 * @author Usuario
 */
public class CafeteraService {

    public void llenarCafetera(Cafetera c1) {
        c1.setCantidadActual(c1.getCapacidadMaxima());
        System.out.println("llenada exitosamente ");
    }

    public void servirTaza(Cafetera c1, int taza) {
        if (c1.getCantidadActual() < taza) {
            System.out.println("la cantidad de cafe no alcanza. ");
            System.out.println("la cantidad de la taza es: " + c1.getCantidadActual() + "ml");
            c1.setCantidadActual(0);
        } else {
            System.out.println("la taza esta llena ");
            c1.setCantidadActual(c1.getCantidadActual() - taza);
        }
    }

    public void vaciarCafetera(Cafetera c1) {
        c1.setCantidadActual(0);
        System.out.println("la cafetera esta vacía. ");
    }
    public void agregarCafe (Cafetera c1, int agregado) {
        if (c1.getCapacidadMaxima()- c1.getCantidadActual() >= agregado){
        c1.setCantidadActual(c1.getCantidadActual()+ agregado);
            System.out.println("cafe agregado exitosamente!");
        }
        else {
            System.out.println("no entra");
        }
    }
}
