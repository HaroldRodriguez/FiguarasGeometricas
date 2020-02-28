package figurasgeometricasherencia;


/**
 * @author Camila Urueña
 * @author Harold Gomez
 */

//Objetos donde solicitamos puntos para hallar la figura, las tres figuras tienen minimo 2 puntos
public class Figura {
 
    //  Objeto punto1=(x,y)
    protected Punto punto1;
    //  Objeto punto2=(x,y) 
    protected Punto punto2;
    //  Area figura
    protected double area;
    //  Perimetro figura
    protected double perimetro;

    /**
     * Constructor de la clase
     * @param punto1
     * @param punto2 
     */
    
    public Figura(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    /**
     * Obtener el Lado1=AB (Triangulo, Rectangulo, Cuadrado)
     * @return lado1
     */
    public double darLado1(){
        double lado1 = Math.pow(this.punto2.getX()-this.punto1.getX(),2) + Math.pow(this.punto2.getY()-this.punto1.getY(),2);
        lado1 = Math.sqrt(lado1);
        return lado1;
    }
    
    /**
     * Llama valor del Punto1 (x,y)
     * @return punto1
     */
    public Punto getPunto1() {
        return punto1;
    }
    
    /**
     * Modifica el valor del Punto1 (x,y)
     * @param punto1 
     */
    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    /**
     * Llama el valor del Punto2 (x,y)
     * @return punto2
     */
    public Punto getPunto2() {
        return punto2;
    }

    /**
     * Modifica el valor del Punto2 (x,y)
     * @param punto2
     */
    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    /**
     * Llama el valor del Area
     * @return area
     */
    public double getArea() {
        return area;
    }

    /**
     * Modifica el valor del Area
     * @param area 
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Llama el valor del Perimetro
     * @return perimetro
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     * Modifica el valor del perimetro
     * @param perimetro 
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
}
