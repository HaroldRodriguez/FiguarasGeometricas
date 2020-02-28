/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricasherencia;

/**
 *
 * @author Camila Urueña
 * @author Harold Gomez
 */

public class Triangulo extends Figura {
    //  Objeto que guarda las coordenadas del punto3 (x,y)
    private Punto punto3;

    /**
     * Constructor de la clase Triangulo
     * @param punto1
     * @param punto2
     * @param punto3 
     */
    
    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        super(punto1, punto2);
        this.punto3 = punto3;
        calcularArea();
        calcularPerimetro();
    }
    
    /**
     * Calcula el Lado2 (BC) del triangulo
     * @return lado2
     */
    public double darLado2(){
        double lado2 = Math.pow(this.punto3.getX()-this.punto2.getX(),2) + Math.pow(this.punto3.getY()-this.punto2.getY(),2);
        lado2 = Math.sqrt(lado2);
        return lado2;
    }
    
    /**
     * Calcula el Lado3 (CA) del triangulo
     * @return lado3
     */
    public double darLado3(){
        double lado3 = Math.pow(this.punto1.getX()-this.punto3.getX(),2) + Math.pow(this.punto1.getY()-this.punto3.getY(),2);
        lado3 = Math.sqrt(lado3);
        return lado3;
    }
    
    /**
     * Calcula el area del Triangulo
     */
    public void calcularArea(){
        calcularPerimetro();
        double heron = getPerimetro() / 2;
        this.area = heron*(heron - darLado1())*(heron - darLado2())*(heron - darLado3());
        this.area = Math.sqrt(area);
    }
    
    /**
     * Calcula el perimetro del triangulo
     */
    public void calcularPerimetro(){
        this.perimetro = darLado1() + darLado2() + darLado3();
    }
    
    /**
     * Validar que los puntos formen un triangulo
     * @return validar
     */
    public boolean validarPuntos(){
        boolean validar = false;
        double diagonal1 = (punto2.getY() - punto1.getY()) / (punto2.getX() - punto1.getX());
        double diagonal2 = (punto3.getY() - punto2.getY()) / (punto3.getX() - punto2.getX());
        double diagonal3 = (punto1.getY() - punto3.getY()) / (punto1.getX() - punto3.getX());
        if(diagonal1 != diagonal2 && diagonal1 != diagonal3 && diagonal2 != diagonal3){
            validar = true;
        }
        return validar;
    }
    
    /**
     * Nos dice que tipo de triangulo es, por sus lados
     * @return String
     */
    public String tipoTriangulo(){
        if((darLado1() - darLado2() > -0.3 && darLado1() - darLado2() < 0.3) &&
            (darLado1() - darLado3() > -0.3 && darLado1() - darLado3() < 0.3) &&
            (darLado2() - darLado3() > -0.3 && darLado2() - darLado3() < 0.3)){
            return "Equilatero";
        }
        else if(darLado1() == darLado2() || darLado1() == darLado3() || darLado2() == darLado3()){
            return "Isosceles";
        }
        else{
            return "Escaleno";
        }
    }

    /**
     * Llama el valor del Punto3 (x,y)
     * @return punto3
     */
    public Punto getPunto3() {
        return punto3;
    }

    /**
     * Modifica el valor del Punto3 (x,y)
     * @param punto3 
     */
    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }
    
}
