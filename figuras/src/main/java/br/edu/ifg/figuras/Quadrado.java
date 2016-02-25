
package br.edu.ifg.figuras;


public class Quadrado extends FiguraGeometrica{
   private Long lado;
   
   public Quadrado(Long lado){
       this.lado = lado;
   }
    @Override
    public Long getArea() {
        return lado*lado;
    }

    @Override
    public Long getPerimetro() {
        return 4*lado;
    }
     
}
