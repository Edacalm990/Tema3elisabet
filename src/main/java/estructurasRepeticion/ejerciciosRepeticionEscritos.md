<h2>1.- Intenta averiguar qué realiza el siguiente programa, sin implementarlo. Implementa el programa en el entorno y compara tus resultados con la ejecución.</h2>

    public class EstructuraRepetitivaWhile {
        public static void main(String[] args) {
        int x = 1;
       
        while (x<=100) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }
        }
    }
    
<ul>
  <li>Respuesta =  Mientras x sea menor de 100 imprimira x - (x+1) y sumara 1 a x </li>
</ul>
<h2>2.-  Intenta averiguar qué realiza el siguiente programa, sin implementarlo. Implementa el programa en el entorno y compara tus resultados con la ejecución.</h2>

    import java.util.Scanner;

    public class EstructuraRepetitivaWhile2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n,x;
        System.out.print("Ingrese el valor final:");
        n=teclado.nextInt();
        x=1;
        while (x<=n) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }
    }
    }
    
<ul>
  <li>Respuesta =  Mientras x sea menor que el número introducido por consola imprimira x - (x+1) y sumara 1 a x </li>
</ul>

<h2>4.- Intenta averiguar qué realiza el siguiente programa, sin implementarlo. Implementa el programa en el entorno y compara tus resultados con la ejecución.</h2>

    public class Ejemplo    {
         public static void main(String[] args) {
          int numero = 1;
         
          while (numero < 11)
          {
               System.out.println("Número: " + numero);
               numero++;
          }
          do {
               System.out.println("Número: " + --numero);
          } while(numero > 1);
         }
    }

<ul>
  <li>Respuesta =  Aquí hay dos bucles, el bucle while dice mientras numero sea menor de 11 (empieza en 1) imprimirá el valor de numero e incrementará su valor en 1 hasta llegar a 11, cuando llegue a 11 pasará al do que dice imprime numero en pantalla menos 1 y después comprueba si numero es mayor a 1 si es mayor volverá ha hacerlo hasta que numero sea menor o igual a 1</li>
</ul>

<h2>Intenta averiguar qué realiza el siguiente programa, sin implementarlo. Implementa el programa en el entorno y compara tus resultados con la ejecución.</h2>

     public class Buclefor {
        public static void main (public static void main ()){
            int j=1;
            for (int=-13; i<=-10; i++) {
            j++;
            System.out.println(j);
     }

    }


}