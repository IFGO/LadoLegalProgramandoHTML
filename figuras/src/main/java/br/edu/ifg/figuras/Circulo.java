/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.figuras;

/**
 *
 * @author aluno
 */
    public class Circulo extends FiguraGeometrica{

        private Long raio;
        
        public Circulo(Long raio) {
            this.raio = raio;
        }
        
    @Override
    public Long getArea() {
        return (long) (Math.PI * Math.pow(this.raio, 2));
        
    }

    @Override
    public Long getPerimetro() {
            return (long) (2*Math.PI * this.raio);
   
    }
        
        
        
}
