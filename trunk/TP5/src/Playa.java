
public class Playa {

    private Estacionamiento[] playa;
    private boolean estado = false; //False = Ocupado - true = Libre;

    public Playa() {
        playa = new Estacionamiento[20];
        for (int i = 0; i < 20; i++) {
            playa[i] = new Estacionamiento();
        }

        estado = true;
    }

    private void actualizarEstado() {
        for (int i = 0; i < playa.length; i++) {
            if (playa[i].estaLibre()) {
                estado = true;
                return;
            }
        }
        estado = false;
    }

    public boolean estaLibre() {
        actualizarEstado();
        return estado;
    }

    public void agregarAuto(Auto auto) {
        for (int i = 0; i < playa.length; i++) {
            if (playa[i].estaLibre()) {
                playa[i].agregarAuto(auto);
                return;
            }
        }
    }

    public void agregarEstacionamiento(Estacionamiento estacionamiento) {
        for (int i = 0; i < playa.length; i++) {
            if (playa[i].estaLibre()) {
                playa[i] = estacionamiento;
                return;
            }
        }
    }
}