import javax.swing.*;
import java.awt.*;

public class PentagramaPanel extends JPanel {
    public PentagramaPanel(NotaJFugue currentNota, MelodiaJFugue currentMelodia) {
        setBackground(Color.white);
        setSize(416, 302);
        addMouseListener(new PentagramaListener(currentNota));

        ImageIcon img = new ImageIcon("resources/pentagrama.gif");
        JLabel label = new JLabel("", img, JLabel.CENTER);
        add(label);
    }
}
