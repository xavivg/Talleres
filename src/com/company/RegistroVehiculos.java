package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class RegistroVehiculos {
    private Set<Coche> coches = new HashSet<>();

    public void registrarVehiculo(Coche coche) {

        coches.add(coche);
    }

    public void eliminarVehiculo(String matricula){
        Coche aux = null;
        for (Coche coche : coches){
            if (coche.getMatricula().equals(matricula)){
                aux = coche;
                break;
            }
        }
        if (aux!=null)coches.remove(aux);
    }

    public List<Coche> obtenerVehiculosMarca(String Marca) {
        List<Coche> cochesaux = new ArrayList<>();
        for (Coche coche : coches){
            if (coche.getMarca().equals(Marca)){
               cochesaux.add(coche);
            }
        }
        return cochesaux;
    }

    public List<Coche> obtenerTodos() {
        List<Coche> cochesall = new ArrayList<>();
        for (Coche cocheActual : coches) {
            cochesall.add(cocheActual);
        }
        return cochesall;
    }
    public  Optional<Coche> obtenerVehiculo(String matricula){
        return coches.stream().filter(coche -> coche.getMatricula().equals(matricula)).findFirst();
    }
    public Optional<Coche> obtenerVehiculoPrecioMax(){
        return coches.stream().max(Comparator.comparing(Coche::getPrecio));
    }
}
