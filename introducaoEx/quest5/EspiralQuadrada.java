package quest5;

import javax.swing.JFrame;

public class EspiralQuadrada {
    
    public static void main(String[] args) {
        DrawPanelLine panel = new DrawPanelLine();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);
    }
}
