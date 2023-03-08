
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoMartinPerezSalvador2223 miVehiculoMartinPerezSalvador2223;
        int stockActual;
        
        miVehiculoMartinPerezSalvador2223 = new VehiculoMartinPerezSalvador2223("Seat",18000,100);
        operativaVehiculosMartinPerezSalvador2223(miVehiculoMartinPerezSalvador2223, 50);
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoMartinPerezSalvador2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoMartinPerezSalvador2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static void operativaVehiculosMartinPerezSalvador2223(VehiculoMartinPerezSalvador2223 miVehiculoMartinPerezSalvador2223, com.sun.tools.javac.comp.Enter cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoMartinPerezSalvador2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
    }

}
    
