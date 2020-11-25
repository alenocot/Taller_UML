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
public class Cita {
    //protected DateTime fecha;
    protected boolean pagada;
    protected String registradoPor;
    protected Paciente paciente;

    public Cita(boolean pagada, String registradoPor, Paciente paciente) {
        this.pagada = pagada;
        this.registradoPor = registradoPor;
        this.paciente = paciente;
    }
    
    public void realizarPago(Pago pago){
        
    }
}
