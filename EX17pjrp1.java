/**
 * 
 * 
 * 
 * @author Pablo Jesus Reyes Podadera
 */
public class EX17pjrp1{

  public static void main(String[] args) {
    int alturaIntroducida = 0;
    while (alturaIntroducida < 4) {
      System.out.print("Por favor, introduzca la altura de la pirámide: ");
      alturaIntroducida = Integer.parseInt(System.console().readLine());
      if(alturaIntroducida < 4)  {
        System.out.println("Datos incorrectos, la altura debe ser un número impar mayor o igual que 4.");
      }
    }
    String relleno = "*";
    int planta = 1;
    int longitudDeLinea = 1;
    int espacios = alturaIntroducida-1;
    
    while (planta <= alturaIntroducida) {
      
      // inserta espacios al inicio
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      if(planta <= 2) {
        for (int i = 1; i <= longitudDeLinea; i++) {
          System.out.print(relleno);
        }
      } else if (planta <= alturaIntroducida -2) {
      
        System.out.print(relleno);
        System.out.print(relleno);
        for (int i = 1; i <= longitudDeLinea - 4; i++) {
          System.out.print(" ");
        }
      System.out.print(relleno);
      System.out.print(relleno);
      } else  {
        for (int i = 1; i <= longitudDeLinea; i++) {
        System.out.print(relleno);
        }
      }
      
      
      System.out.println();

      planta++;
      espacios--;
      longitudDeLinea += 2;
    }
  }
}
