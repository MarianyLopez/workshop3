public class Yate extends Embarcacion{

    private int cantidadCamarotes;

    public Yate(Capitan capitan, double precioBase, int anioFabricacion, double eslora, int cantidadCamarotes) {
        super(capitan, precioBase, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public void comprarYate(){
        if (cantidadCamarotes>7)
            System.out.println("El yate que compró es de lujo");
        else
            System.out.println("El yate que compró no es lujoso");
    }
}
