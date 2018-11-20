import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

import javax.swing.*;

public class Menu extends BasicGameState {
    private Image fondo,titulo;
    private Image botonJugar,puntero;
    private Input entrada;
    private boolean presionado;

    public Menu() {
    }

    /**
     * Numero de Punto
     * @return
     */
    @Override
    public int getID() {
        return 0;
    }

    /**
     * Inicializa
     * @param gameContainer
     * @param stateBasedGame
     * @throws SlickException
     */
    @Override
    public void init(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException {
        fondo = new Image("IMG/fondo1.png");
        titulo = new Image("IMG/titulo2.png");
        botonJugar = new Image("IMG/BotonJugar.png");
        entrada = gameContainer.getInput();
    }

    /**
     * Dibuja
     * @param gameContainer
     * @param stateBasedGame
     * @param graphics
     * @throws SlickException
     */
    @Override
    public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics) throws SlickException {
        fondo.draw();
        titulo.draw(95,40);
        botonJugar.draw(180,450);
    }

    /**
     * Actualiza
     * @param gameContainer
     * @param stateBasedGame
     * @param i
     * @throws SlickException
     */
    @Override
    public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int i) throws SlickException {
        int posX = Mouse.getX();
        int posY = Mouse.getY();

        if((posX>180 && posX<500)&&(posY>158 && posY<220)){
            if(Mouse.isButtonDown(0)) {
                presionado = true;
            }
        }
        if(presionado==true){
            stateBasedGame.enterState(1);
        }
        else{
            stateBasedGame.enterState(0);
        }
    }
}
