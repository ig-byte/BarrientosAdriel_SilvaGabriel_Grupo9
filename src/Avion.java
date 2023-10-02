
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Avion {

    Asiento[] asientosPasajeros = new Asiento[42];

    public void poblarAvion() {
        boolean vip;
        for (int i = 1; i <= 42; i++) {
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
            } else
                System.out.println("El vuelo está vacío.");
        }
    }

    public void comprarPasaje(int asiento) {
        if (asiento > 0 && asiento < 43) {
            if (!asientosPasajeros[asiento].isEmpty()) {
                System.out.println("Asiento no disponible");
            } else if (!asientosPasajeros[asiento].isVip()) {
                System.out.println("Asiento Premium VIP disponible");

            } else
                System.out.println("Asiento Economy disponible");
            System.out.println("Asiento disponible");
        }
    }

    public void mostrarAsientos() {
        for (int i = 0; i < asientosPasajeros.length; i++) {
            System.out.println(asientosPasajeros[i]);
        }
    }

    @Override
    public String toString() {
        return "Avion [asientosPasajeros=" + Arrays.toString(asientosPasajeros) + "]";
    }
}