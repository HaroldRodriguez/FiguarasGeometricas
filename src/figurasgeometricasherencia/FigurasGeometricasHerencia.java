
package figurasgeometricasherencia;
import java.util.Scanner;
/**
 *
 * @author Camila Urueña
 * @author Harold Gomez
 */

public class FigurasGeometricasHerencia {
    //  Objeto de la clase Scanner
    Scanner leer = new Scanner(System.in);
    //  Objeto de la clase Triangulo
    private Triangulo triangulo;
    //  Objeto de la clase Cuadrado
    private Cuadrado cuadrado;

    
    /**
     * Constructor de la clase Padre
     */
    public FigurasGeometricasHerencia() {
        menu();
    }
    
    /**
     * Menu figuras
     */
    private void menu(){
        byte opcion = 0;
        while(opcion != 3){
            System.out.println("Inserte el numero de la opción que desea");
            System.out.println("1. Triangulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            opcion = leer.nextByte();
            switch(opcion){
                case 1:
                    iniciarTriangulo();
                    break;
                case 2:
                    iniciarCuadrado();
                    break;
               
            }
        }
    }
    
    /**
     * Metodo Triangulo
     */
    private void iniciarTriangulo(){
        ingresarPuntosTriangulo();
        menuTriangulo();
    }
    
    /**
     * Metodo ingresar puntos
     */
    private void ingresarPuntosTriangulo(){
        boolean validar = false;
        while(validar == false){
        System.out.print("Digite punto x1: ");
        double x = leer.nextDouble();
        System.out.print("Digite punto y1: ");
        double y = leer.nextDouble();
        Punto punto1 = new Punto(x, y);
        System.out.print("Digite punto x2: ");
        x = leer.nextDouble();
        System.out.print("Digite punto y2: ");
        y = leer.nextDouble();
        Punto punto2 = new Punto(x, y);
        System.out.print("Digite punto x3: ");
        x = leer.nextDouble();
        System.out.print("Digite punto y3: ");
        y = leer.nextDouble();
        Punto punto3 = new Punto(x, y);
        //Se envian los puntos digitados al metodo Triangulo
        triangulo = new Triangulo(punto1, punto2, punto3);
        //Realiza validacion si los puntos digitados son validos, de no ser correcro es porque no es un Triangulo 
        validar = triangulo.validarPuntos();  
        if(validar == false)
            System.out.println("No es un TRIANGULO");
        }
    }
    
    /**
     * Menu opciones triangulo
     */
    private void menuTriangulo(){
        byte opcion = 0;
        while(opcion != 4){
            System.out.println("Inserte el numero de la opción que desea");
            System.out.println("1. Hallar perimetro");
            System.out.println("2. Hallar area");
            System.out.println("3. Tipo de triangulo");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = leer.nextByte();
            imprimirResultadosTriangulo(opcion);
        }
    }
    
    /**
     * Muestra resultado
     * @param opcion 
     */
    private void imprimirResultadosTriangulo(byte opcion){
        switch(opcion){
            case 1:
                triangulo.calcularPerimetro();
                System.out.println("Peimetro Triangulo: "+triangulo.getPerimetro());
                break;
            case 2:
                triangulo.calcularArea();
                System.out.println("Area Triangulo: "+triangulo.getArea());
                break;
            case 3:
                System.out.println("Tipo de Triangulo: "+triangulo.tipoTriangulo());
                break;
        }
    }
    
    /**
     * Inicia a ejecutar dichas operaciones de las figuras
     */
    private void iniciarCuadrado(){
        solicitarPuntosCuadrado();
        menuCuadrado();
    }
    
    /**
     * Metodo que solicita los puntos del cuadrado o rectangulo
     */
    private void solicitarPuntosCuadrado(){
        boolean validar = false;
        while(validar == false){
            System.out.print("Punto x1: ");
            double x = leer.nextDouble();
            System.out.print("Punto y1: ");
            double y = leer.nextDouble();
            Punto punto1 = new Punto(x, y);
            System.out.print("Punto x2: ");
            x = leer.nextDouble();
            System.out.print("Punto y2: ");
            y = leer.nextDouble();
            Punto punto2 = new Punto(x, y);
            System.out.print("Punto x3: ");
            x = leer.nextDouble();
            System.out.print("Punto y3: ");
            y = leer.nextDouble();
            Punto punto3 = new Punto(x, y);
            System.out.print("Punto x4: ");
            x = leer.nextDouble();
            System.out.print("Punto y4: ");
            y = leer.nextDouble();
            Punto punto4 = new Punto(x, y);
            //Se envian los puntos digitados al metodo Cuadrado
            cuadrado = new Cuadrado(punto1, punto2, punto3, punto4); 
            //Realiza validacion si los puntos digitados son validos, para saber si forma un cuadrado o rectangulo, de no ser correcro es porque no es un Cuadrilatero 
            validar = cuadrado.validarPuntos();
            if(validar == false)
                System.out.println("No es un cuadrilatero");
        }
    }
    
    /**
     * Menu opciones cuadrado o rectangulo
     */
    private void menuCuadrado(){
        byte opcion = 0;
        while(opcion != 4){
            System.out.println("Menu de opciones para un Cuadrado o Rectangulo");
            System.out.println("1. Hallar perimetro");
            System.out.println("2. Hallar area");
            System.out.println("3. Tipo cuadrilatero (cuandrado/rectangulo)");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = leer.nextByte();
            imprimirResultadosCuadrado(opcion);
        }
    }
    
    /**
     * Imprime los resultados de la opcion escojida
     * @param opcion 
     */
    private void imprimirResultadosCuadrado(byte opcion){
        switch(opcion){
            case 1:
                cuadrado.calcularPerimetro();
                System.out.println("Peimetro Cuadrado: "+cuadrado.getPerimetro());
                break;
            case 2:
                cuadrado.calcularArea();
                System.out.println("Area Cuadrado: "+cuadrado.getArea());
                break;
            case 3:
                System.out.println("Tipo : "+cuadrado.tipo());
                break;
        }
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FigurasGeometricasHerencia figurasGeometricasHerencia = new FigurasGeometricasHerencia();
    }
    
}
