/**
 * 
 * 
 * 
 * @author Pablo Jesus Reyes Podadera
 */
public class EX17pjrp3{

  public static void main(String[] args) {
    
      System.out.print("Introduzca un número: ");
      int numeroIntroducido = Integer.parseInt(System.console().readLine());
      int num = numeroIntroducido;
      int suma = 0;
      while(num >= 10)  {
        suma = suma + (num % 10);
        num = num / 10;
      }
      suma = suma + num;
      System.out.println("La suma de sus dígitos es " + suma);
  }
}





