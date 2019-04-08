/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idirigivel.matheus;

/**
 *
 * @author Matheus Prado
 */
public abstract class VCMotor extends Veiculos {
    
    private int Tanque;
    private float Combustivel ;
    
    public VCMotor(){
    this.Combustivel= 100;
}

    public int getTanque() {
        return Tanque;
    }

    public void setTanque(int Tanque) {
        this.Tanque = Tanque;
    }

    public float getCombustivel() {
        return Combustivel;
    }

    public void setCombustivel(float Combustivel) {
        this.Combustivel = Combustivel;
    }
    
}
