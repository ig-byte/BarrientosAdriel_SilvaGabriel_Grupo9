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
}