import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import Puertas.ControladorPuerta;

import java.util.Random;

public class Juego extends BasicGameState {

    private Image fondo;
    private Input entrada;
    private ControladorPuerta puerta,premios;

    public Juego() throws SlickException {

    }

    @Override
    public int getID() {

        return 1;
    }

    @Override
    public void init(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException {
        /* *************************************Puertas************************************************* */
        puerta = new ControladorPuerta();
        puerta.addPuerta(3);
        premios = new ControladorPuerta();
        premios.addPremio(3);
        fondo = new Image("IMG/Fjuego.png");
        entrada = gameContainer.getInput();
        float probabilidad = (float)(1)/(3);
        System.out.println("La probabilidad de ganar es de: "+ probabilidad);
        /* *******Prueba Victoria***************** */
        /*System.out.println(premios.getPremios().get(0).getEstado());
        System.out.println(premios.getPremios().get(1).getEstado());
        System.out.println(premios.getPremios().get(2).getEstado());*/
    }

    @Override
    public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics) throws SlickException {
        Teclado();
        fondo.draw();
        for(int i=0;i<premios.getPremios().size();i++){
            premios.drawPr();
        }
        for(int i=0;i<puerta.getPuertas().size();i++){
            puerta.drawP();
        }
    }

    @Override
    public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int i) throws SlickException {
        Teclado();
    }

    private void Teclado() throws SlickException {
        Random generado = new Random();
        if(entrada.isKeyPressed(Input.KEY_1)) {
            int elegido = 0;
            int mostrar;
            do {
                mostrar = generado.nextInt(3);
                // Elige una puerta al azar para abrir menos la escogida
            } while (puerta.getPuertas().get(mostrar).getEstado() == 1 || mostrar == elegido);
            int fallo = premios.getPremios().get(mostrar).getEstado();
            int premio = premios.getPremios().get(elegido).getEstado();
            if(fallo==1){
                puerta.getPuertas().remove(mostrar);
                System.out.println("Perdiste");
            }
            else if(fallo==0){
                float probabilidad = (float)(2)/(3);
                puerta.getPuertas().remove(mostrar);
                System.out.println("La probabilidad de ganar es de: "+probabilidad);
            }
            else if(premio==1){
                puerta.getPuertas().remove(mostrar);
                System.out.println("Ganaste");
            }
        }

        if(entrada.isKeyPressed(Input.KEY_2)) {
            int elegido = 1;
            int mostrar;
            do {
                mostrar = generado.nextInt(3);
                // Elige una puerta al azar para abrir menos la escogida
            } while (puerta.getPuertas().get(mostrar).getEstado() == 1 || mostrar == elegido);
            int fallo = premios.getPremios().get(mostrar).getEstado();
            int premio = premios.getPremios().get(elegido).getEstado();
            if(fallo==1){
                puerta.getPuertas().remove(mostrar);
                System.out.println("Perdiste");
            }
            else if(fallo==0){
                float probabilidad = (float)(2)/(3);
                puerta.getPuertas().remove(mostrar);
                System.out.println("La probabilidad de ganar es de: "+probabilidad);
            }
            else if(premio==1){
                puerta.getPuertas().remove(mostrar);
                System.out.println("Ganaste");
            }
        }

        if(entrada.isKeyPressed(Input.KEY_3)) {
            int elegido = 2;
            int mostrar;
            do {
                mostrar = generado.nextInt(3);
                // Elige una puerta al azar para abrir menos la escogida
            } while (puerta.getPuertas().get(mostrar).getEstado() == 1 || mostrar == elegido);
            int fallo = premios.getPremios().get(mostrar).getEstado();
            int premio = premios.getPremios().get(elegido).getEstado();
            if(fallo==1){
                puerta.getPuertas().remove(mostrar);
                System.out.println("Perdiste");
            }
            else if(fallo==0){
                float probabilidad = (float)(2)/(3);
                puerta.getPuertas().remove(mostrar);
                System.out.println("La probabilidad de ganar es de: "+probabilidad);
            }
            else if(premio==1){
                puerta.getPuertas().remove(mostrar);
                System.out.println("Ganaste");
            }
        }
    }

}