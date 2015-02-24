package clases;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author xp
 */
public class Explosion {
    Image imagenExplosion = null;
    Image imagenExplosion2 = null;
        //posición x-y de la explosion
    private int x = 0;
    private int y = 0;
    private int tiempoDeVida = 50;

    public int getTiempoDeVida() {
        return tiempoDeVida;
    }

    public void setTiempoDeVida(int tiempoDeVida) {
        this.tiempoDeVida = tiempoDeVida;
    }

    
    public Explosion (){
        try {
            imagenExplosion = ImageIO.read((getClass().getResource("/imagenes/e1.png")));
            imagenExplosion2 = ImageIO.read((getClass().getResource("/imagenes/e2.png")));
        } catch (IOException ex) {
        }

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
