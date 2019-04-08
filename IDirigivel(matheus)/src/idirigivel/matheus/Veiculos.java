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
 abstract class Veiculos {
    private int Id;
    private double DistanciaPercorrida = 0;
    private String LocalInicio;
    private String LocalFinal;

    public String getLocalInicio() {
        return LocalInicio;
    }

    public void setLocalInicio(String LocalInicio) {
        this.LocalInicio = LocalInicio;
    }

    public String getLocalFinal() {
        return LocalFinal;
    }

    public void setLocalFinal(String LocalFinal) {
        this.LocalFinal = LocalFinal;
    }
    
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public double getDistanciaPercorrida() {
        return DistanciaPercorrida;
    }

    /*
        Metodo igual a o Rodar que é necessario pois esta no exercicio pdf gg
    
    public void setDistanciaPercorrida(double DistanciaPercorrida) {
        this.DistanciaPercorrida = DistanciaPercorrida;
    } */
    
    
    public void rodar(double km) {
        this.DistanciaPercorrida += km;
    }
    
    
}
