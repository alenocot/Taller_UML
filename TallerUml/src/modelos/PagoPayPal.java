/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author John
 */
public class PagoPayPal implements Pago{
    
    protected float monto;
    protected String email;

    public PagoPayPal(float monto, String email) {
        this.monto = monto;
        this.email = email;
    }
    
    @Override
    public boolean realizarPago(float monto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
