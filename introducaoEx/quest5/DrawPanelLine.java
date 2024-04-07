// 5 - Desenhe
// a. uma espiral com a forma quadrada centralizada no painel, utilizando o
// método drawLine . Uma técnica é utilizar um loop que aumenta o
// comprimento da linha depois de desenhar cada duas linhas. A direção
// na qual desenhar a próxima linha deve seguir um padrão distinto, por
// exemplo, para baixo, para a esquerda, para cima, para a direita.

package quest5;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanelLine extends JPanel {
    public void paint(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int variacao = 25;
        int taxa = 25;
        int posX = width/2;
        int posY = height/2;
        int direcao = 0;

        for(int i = 1; i <= 75; i++) {
            switch (direcao) {
                case 0:
                    g.drawLine(posX,posY,posX,posY + taxa);
                    posY += taxa;
                    direcao++;
                    break;
                case 1:
                    g.drawLine(posX,posY,posX - taxa,posY);
                    posX -= taxa;
                    taxa += variacao;
                    direcao++;
                    break;
                case 2:
                    g.drawLine(posX,posY,posX,posY - taxa);
                    posY -= taxa;
                    direcao++;
                case 3:
                    g.drawLine(posX,posY,posX + taxa,posY);
                    posX += taxa;
                    taxa += variacao;
                    direcao = 0;
                default:
                    break;
            } 
        }

    }
}
