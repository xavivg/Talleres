package com.company;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Taller {
    private Map<Persona, Coche> reparaciones =
            new TreeMap<>(Comparator.comparing(Persona::getEdad));

    public void registrarReparacion(Persona persona, Coche coche) {

        reparaciones.putIfAbsent(persona, coche);
    }
    public Coche obtenerCoche(Persona persona){
        return reparaciones.get(persona);
    }

    public Set<Persona> obtenerClientes(){
        return reparaciones.keySet();
    }
}
