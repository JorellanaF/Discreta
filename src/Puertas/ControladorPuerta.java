package Puertas;

import org.newdawn.slick.SlickException;

import java.util.ArrayList;
import java.util.Random;

public class ControladorPuerta implements IControlador {
    private ArrayList<SpriteMovil> Puertas;
    private ArrayList<SpriteMovil2> Premios;

    public ArrayList<SpriteMovil2> getPremios() {
        return Premios;
    }

    public void setPremios(ArrayList<SpriteMovil2> premios) {
        Premios = premios;
    }

    public ArrayList<SpriteMovil> getPuertas() {
        return Puertas;
    }

    public void setPuertas(ArrayList<SpriteMovil> puertas) {
        Puertas = puertas;
    }

    public ControladorPuerta(){

        Puertas = new ArrayList<>();
        Premios = new ArrayList<SpriteMovil2>();
    }

    @Override
    public void addPuerta(int n) throws SlickException {
        for(int i=0; i<n; i++) {
            SpriteMovil puerta = new SpriteMovil("Puertas/Imagenes/puerta1.png",0);
            Puertas.add(puerta);
        }
    }

    @Override
    public void drawP() {
        int x = 100;
        int y =200;
        int extra = 0;
        for(int i = 0;i < Puertas.size();i++){
            Puertas.get(i).draw(x + extra,y);
            extra = extra + 400;
        }
    }

    @Override
    public void addPremio(int n) throws SlickException {
        Random generado = new Random();
        for(int i=0; i<n; i++) {
            SpriteMovil2 premio = new SpriteMovil2("IMG/triste.png", 0);
            Premios.add(premio);
        }
        SpriteMovil2 ganador = new SpriteMovil2("IMG/feliz.png", 1);
        Premios.set(generado.nextInt(3),ganador);
    }

    @Override
    public void drawPr() {
        int x = 100;
        int y =250;
        int extra = 0;
        for(int i = 0;i < Premios.size();i++){
            Premios.get(i).draw(x + extra,y);
            extra = extra + 400;
        }
    }
}
