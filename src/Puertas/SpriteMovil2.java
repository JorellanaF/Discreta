package Puertas;

import org.newdawn.slick.SlickException;

public class SpriteMovil2 extends Sprite {
    private int estado;

    public SpriteMovil2(String ruta, Punto posicion, int estado) throws SlickException {
        super(ruta, posicion);
        this.estado = estado;
    }

    public SpriteMovil2(String ruta, int estado) throws SlickException {
        super(ruta);
        this.estado = estado;
    }

    public SpriteMovil2(String ruta, float x, float y, int estado) throws SlickException {
        super(ruta, x, y);
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}