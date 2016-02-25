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
public class Triangulo extends FiguraGeometrica {
    
    private Long base;
    private Long altura;
    private Long ladoA;
    private Long ladoB;
    private Long ladoC;
    
    public Triangulo(Long base, Long altura, Long ladoA, Long ladoB, Long ladoC) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public Long getArea() {
        return this.base * this.altura / 2;
        
    }

    @Override
    public Long getPerimetro() {
        return this.ladoA + this.ladoB + this.ladoC;
        
    }
    
}
