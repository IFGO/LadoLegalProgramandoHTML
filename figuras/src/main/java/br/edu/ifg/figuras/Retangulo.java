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
public class Retangulo extends FiguraGeometrica {
    
    private Long ladoX;
    private Long ladoY;

    @Override
    public Long getArea() {
        return ladoX * ladoY;
        
    }

    @Override
    public Long getPerimetro() {
        return 2*(ladoX + ladoY);
        
    }

    public Retangulo(Long ladoX, Long ladoY) {
        this.ladoX = ladoX;
        this.ladoY = ladoY;
    }
    
    
    
}
