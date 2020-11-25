/**
 * 
 * 
 * 
 * @author Pablo Jesus Reyes Podadera
 */
public class EX17pjrp4{

  public static void main(String[] args) {
    
      System.out.print("Introduzca la longitud del tallo del girasol en milímetros: ");
      int longitud = Integer.parseInt(System.console().readLine());
      int ochos = 0;
      int sietes = 0;
      int num = longitud;
      
      while(num >= 10)  {
        if((num % 10) == 8)  {
          ochos++;
        }
        if(num % 10 == 7)  {
          sietes++;
        }
        num = num / 10;
      }
      if(sietes < 3 && ochos > 1){
      System.out.println("Ese girasol es un gran captador");
      }  else {
      System.out.println("Ese girasol no es un gran captador");
      }
  }
}





