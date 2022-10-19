<h2>1.- Implementa el siguiente programa y realiza ejecuciones para los siguientes datos de edad: 15,18 y 60. ¿Cuáles son los resultados?</h2>

public class Tutorial {
        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Introduce tu edad:");

                int edad = scanner.nextInt();

                if (edad >= 18) {
                        System.out.println("Es mayor de edad");
                } else {
                        System.out.println("No es mayor de edad");
                }

                System.out.print("mostrar la edad: ");
                System.out.println(edad);
        }

}

<p>Resultados:</p>
<ul>
  <li>15= Es menor de edad</li>
  <li>18= Es mayor de edad</li>
  <li>60= Es mayor de edad</li>
</ul>
  

<h2>3.- ¿Qué devuelven estas expresiones?</h2>
    
    //a
    boolean unaCondicion = true;
    resultado = unaCondicion ? valor1 : valor2;
    
    //b
    int x = 10;
    int y = (x > 9) ? 100 : 200;
    
    //c
    int publico = 19500;
    int vendidas = 19000; 
    int aforo = 2000;
    String status = (publico < aforo) ? "Cabe mas gente": (vendidas < aforo) ? "Aun no hemos vendido todo" : "Esta todo vendido";
      
<p>Resultado</p>
  <ul>
    <li>a: valor1</li>
    <li>b: 100</li>
    <li>c: Esta todo vendido</li>
  </ul>

<h2>8.- ¿Qué realiza el siguiente programa Java?</h2>

public class Curso {

   public static void main(String args[]){
      char departamento = 'B';

      switch(departamento)
      {
         case 'A' :
            System.out.println("Desarrollo");
            break;
         case 'B' :
        System.out.println(“Recursos Humanos");
            break;
         case 'C' :
            System.out.println("Finanzas");
            break;
         case 'D' :
            System.out.println("Mercadeo");
         default :
            System.out.println(“Departamento no válido");
      }
      System.out.println(“Código para el departamento es " + departamento);
   }
}

<p>Resultado</p>
  <ul>
    <li>Te dice a que departamento pertenece el codigo B, es decir, Recursos humanos</li>
  </ul>

<h2>9.- ¿Cuánto vale variable2 al finalizar la ejecución del switch?</h2>
int variable=3, variable2;
switch(variable)
    
    {
    case 1:
        variable2=5;
        break;
    case 2:
        variable2=20;
        break;
    case 3:
        variable2=30;
    case 4:
        variable2=10;
    default:
        variable2=100;
        break; 
    }
    
<p>Resultado</p>
  <ul>
    <li>100</li>
  </ul>

10.- Modifica el código anterior para que variable2 valga 30.

    {
    case 1:
        variable2=5;
        break;
    case 2:
        variable2=20;
        break;
    case 3:
        variable2=30;
        break;
    case 4:
        variable2=10;
    default:
        variable2=100;
        break; 
    }
