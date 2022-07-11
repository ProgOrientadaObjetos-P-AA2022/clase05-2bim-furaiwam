/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;


import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Persona est1= new Persona("Jose miguel", 20);
        Persona est2= new Persona("Juan miguel", 22);
        Persona est3= new Persona("Mario miguel", 23);
        Persona est4= new Persona("Leonardo miguel", 19);
        ArrayList<Persona> listado =new ArrayList<>();


        listado.add(est1);
        listado.add(est2);
        listado.add(est3);
        listado.add(est4);
        OperacionesEstudiantes operaciones=new OperacionesEstudiantes();
        operaciones.establecerEstudiante(listado);
        operaciones.establecerPromedioEdades();
        operaciones.obtenerEstudiante();

        System.out.printf("%s/n", operaciones);

    }
}
