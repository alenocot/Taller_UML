/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.*;

/**
 *
 * @author John
 */
public class Paciente extends Persona{   
    protected HistoriaClinica  historiaClinica;
    protected Set<Receta> recetas;
    protected Cita cita;
    protected String email;

    public Paciente() {
        this.historiaClinica = new HistoriaClinica();
        this.recetas = new TreeSet<>();
    }
    
    public boolean solicitarCita(){
        return false;
    }
}
