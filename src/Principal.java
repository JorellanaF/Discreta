import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.*;

public class Principal extends StateBasedGame {

    public Principal() throws SlickException {
        super("Pantalla Menu");
    }

    /**
     * Inicializa
     * @param gameContainer
     * @throws SlickException
     */
    @Override
    public void initStatesList(GameContainer gameContainer) throws SlickException {
        this.addState(new Menu());
        this.addState(new Juego());
    }

    public static void main(String args[]){
        try{
            AppGameContainer contenedor = new AppGameContainer(new Principal());
            contenedor.setDisplayMode(1200,695,false);
            contenedor.setShowFPS(false);
            contenedor.start();
        }catch(SlickException slick){
            slick.printStackTrace();
        }
    }
}