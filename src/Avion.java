
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Avion {

    Asiento[] asientosPasajeros = new Asiento[42];

    public void poblarAvion() {
        boolean vip;
        for (int i = 1; i <= 42; i++)
        {
            if (i < 31)
                vip = false;
            else
                vip = true;
            Asiento asiento = new Asiento(vip);
        }
    }
    
    public void anularVuelo(int vueloAnulado) {
        if (vueloAnulado > 0 && vueloAnulado < 43) {
            if (!asientosPasajeros[vueloAnulado].isEmpty()) {
                asientosPasajeros[vueloAnulado].pasajero = null;
                System.out.println("El vuelo se ha anulado.");
            }
            else
                System.out.println("El vuelo está vacío.");
        }
    }
}