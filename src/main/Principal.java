package main;

import negocio.PersonaNegocio;
import presentacion.controlador.Controlador;
import presentacion.vista.VentanaPrincipal;

public class Principal {
    public static void main(String[] args) {
        VentanaPrincipal vp = new VentanaPrincipal();
        PersonaNegocio pn = new PersonaNegocio();

        Controlador controlador = new Controlador(vp, pn);
        controlador.inicializar();
    }
}
