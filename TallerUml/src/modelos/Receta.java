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
public class Receta {
    protected Date fecha;
    protected Paciente paciente;
    protected Doctor doctor;
    protected Set<Medicamento> medicamentos;

    public Receta() {
        medicamentos = new TreeSet<>();
    }
    
}
