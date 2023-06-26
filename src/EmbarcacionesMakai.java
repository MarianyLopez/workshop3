public class EmbarcacionesMakai {

    private Embarcacion [] embarcaciones;

    private int capacidad;
    private int contador = 0;

    public EmbarcacionesMakai(int capacidad) {
        this.capacidad = capacidad;
        embarcaciones = new Embarcacion[capacidad];
    }

    public void agregarEmbarcacion(Embarcacion embarcacion){
        //Antes de agregar embarcacion se evalua la capacidad
        if (contador<capacidad){
            embarcaciones [contador]= embarcacion;
            contador++;
            System.out.println("Embarcacion " + (contador) +" agregada correctamente");
        }else
            System.out.println("Embarcaciones Makai ya alcanzó la capacidad máxima de embarcaciones");
    }


}