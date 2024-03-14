package proyectoobjetos;

public class Tickets {

    private double precio;
    private double vuelto;
    private String asiento;
    private int cantidadTickets;
    private String destino;

    public Tickets(double precio, double vuelto, String asientos, int cantidadTickets, String destino) {
        this.precio = 9.99;
        this.vuelto = vuelto;
        this.asiento = asientos;
        this.cantidadTickets = cantidadTickets;
        this.destino = destino;
    }

    public double getPrecio() {
        return precio;
    }

    public double getVuelto() {
        return vuelto;
    }

    public String getDestino() {
        return destino;
    }

    public String getAsientos() {
        return asiento;
    }

    public int getCantidadTickets() {
        return cantidadTickets;
    }

    public void vuelto(int recibido, int cantidadTickets) {
        vuelto = recibido - precio*cantidadTickets;
        if (vuelto < 0) {
            System.out.println("No ha pagado el precio completo del ticket");
        } else if (vuelto == 0) {
            System.out.println("Gracias, Ha pagado por completo el ticket");
        } else {
            System.out.println("Gracias, Su vuelto es de: " + vuelto);
        }
    }

//    public void AsientoDisponible(String asientoIngresado, String destinoIngresado) {
//        if (asientoIngresado.equals(asiento) && destinoIngresado.equals(destino)) {
//            System.out.println("Asiento ocupado!!");
//        }else{
//            System.out.println("Ha reservado el asiento "+asientoIngresado+" con destino a "+destinoIngresado);
//        }
//    }

    @Override
    public String toString() {
        return "Tickets{" + ", cantidadTickets=" + cantidadTickets + "precio=" + precio + ", vuelto=" + vuelto + ", asientos=" + asiento + ", destino=" + destino + '}';
    }

}
