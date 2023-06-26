public class Main {
    public static void main(String[] args) {

        EmbarcacionesMakai embarcacionesMakai = new EmbarcacionesMakai(8);

        Capitan capitan1 = new Capitan("Dilan","Quintero","DQ287453823");
        Capitan capitan2 = new Capitan("Luisa","Guáqueta","LG868980087");
        Capitan capitan3 = new Capitan("Laura","Pérez","LP4523231456");
        Capitan capitan4 = new Capitan("Mariany","López","ML492386656");


        Yate yate1 = new Yate(capitan1,500000,2023,15,12);
        Yate yate2 = new Yate(capitan2,420000,2018,12,6);
        Yate yate3 = new Yate(capitan3,480000,2021,11,10);
        Yate yate4 = new Yate(capitan4,400000,2016,10,5);

        Velero velero1 = new Velero(capitan1,300000,2023,15,5);
        Velero velero2 = new Velero(capitan2,250000,2018,12,3);
        Velero velero3 = new Velero(capitan3,220000,2022,18,2);
        Velero velero4 = new Velero(capitan4,280000,2018,10,4);

        Embarcacion velero5 = new Velero(capitan4,280000,2018,10,4);

        embarcacionesMakai.agregarEmbarcacion(yate1);
        embarcacionesMakai.agregarEmbarcacion(yate2);
        embarcacionesMakai.agregarEmbarcacion(yate3);
        embarcacionesMakai.agregarEmbarcacion(yate4);
        embarcacionesMakai.agregarEmbarcacion(velero1);
        embarcacionesMakai.agregarEmbarcacion(velero2);
        embarcacionesMakai.agregarEmbarcacion(velero3);
        embarcacionesMakai.agregarEmbarcacion(velero4);
        System.out.println();


        embarcacionesMakai.agregarEmbarcacion(velero5);

        System.out.println("\nInformación del velero 1:");
        velero1.evaluarVelero();
        System.out.println("\nInformación del velero 2:");
        velero2.evaluarVelero();


        System.out.println("\nValor del alquiler del yate 1:");
        yate1.calcularMontoAlquiler();
        System.out.println("\nValor del alquiler del yate 2:");
        yate2.calcularMontoAlquiler();
        System.out.println("\nValor del alquiler del yate 3:");
        yate3.calcularMontoAlquiler();
        System.out.println("\nValor del alquiler del yate 4:");
        yate4.calcularMontoAlquiler();

        System.out.println("\nValor del alquiler del velero 1:");
        velero1.calcularMontoAlquiler();
        System.out.println("\nValor del alquiler del velero 2:");
        velero2.calcularMontoAlquiler();
        System.out.println("\nValor del alquiler del velero 3:");
        velero3.calcularMontoAlquiler();
        System.out.println("\nValor del alquiler del velero 4:");
        velero4.calcularMontoAlquiler();

        System.out.println();
        yate1.comprarYate();

        System.out.println();
        yate2.comprarYate();

    }
}
