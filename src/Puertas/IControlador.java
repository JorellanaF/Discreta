package Puertas;

import org.newdawn.slick.SlickException;

public interface IControlador {
    public void addPuerta(int n) throws SlickException;
    public void drawP();
    public void addPremio(int n) throws SlickException;
    public void drawPr();
}
