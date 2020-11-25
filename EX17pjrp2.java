/**
 * 
 * 
 * 
 * @author Pablo Jesus Reyes Podadera
 */
public class EX17pjrp2{

  public static void main(String[] args) {
      double precio = 10;
      double total = 0;
      double descuento = 0;
      System.out.println("Venta de entradas Coliseo");
      System.out.print("Número de entradas: ");
      int numeroEntradas = Integer.parseInt(System.console().readLine());
      System.out.print("Día de la semana: ");
      String dia = System.console().readLine();
      System.out.print("¿Tiene tarjeta Coliseo? (s/n): ");
      String tieneTarjeta = System.console().readLine();
      System.out.println();
      System.out.println("Aqui tiene sus entradas. Gracias por su compra.");
      if(dia.equalsIgnoreCase("miercoles"))  {
          precio = 8;
      }
      
      if(dia.equalsIgnoreCase("jueves")) {
        int entradasPareja = (numeroEntradas / 2);
        System.out.println("Entradas pareja " + entradasPareja);
        System.out.println("Precio unitario " + 15.00 + " €");
        if(numeroEntradas % 2 > 0)  {
        System.out.println("Entradas individuales " + (numeroEntradas % 2));
        System.out.println("Precio unitario " + 10.00 + " €");
        }
        total = entradasPareja * 15.00 + (numeroEntradas % 2) * 10.00;
        System.out.printf("Total   %.2f €\n", total);
        
      } else {
     
        System.out.println("Entradas individuales  " + numeroEntradas);
        System.out.printf("Precio unitario %.2f €\n", precio);
        total = numeroEntradas * precio;
        System.out.printf("Total   %.2f €\n", total);
      }
      
      if(tieneTarjeta.equalsIgnoreCase("s"))  {
        descuento = 0.1;
      }
      System.out.printf("Descuento  %.2f €\n", total * descuento);
      System.out.printf("A pagar  %.2f €\n", total - (total * descuento));
  }
}






