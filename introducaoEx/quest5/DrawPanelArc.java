// b. uma espiral circular, utilizando o método drawArc para desenhar um
// semicírculo por vez. Cada semicírculo sucessivo deve ter um raio maior
// (conforme especificado pela largura do retângulo delimitador) e deve
// continuar a desenhar onde o semicírculo anterior concluir.

package quest5;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanelArc extends JPanel {
    public void paint(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int posX = width/2;
        int posY = height/2;
        int diametro = 25;
        int variacao = 25;

        for(int i = 0; i < 100; i++) {
            if(i % 2 == 0) {
                g.drawArc(posX, posY, diametro, diametro, 0, 180);
                posX -= variacao;
                posY -= variacao/2;
                diametro += variacao;
            } else {
                g.drawArc(posX, posY, diametro, diametro, 0, -180);
                posY -= variacao/2;
                diametro += variacao;
            }
        }
    }
}
