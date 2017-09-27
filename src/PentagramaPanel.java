import javax.swing.*;
import java.awt.*;

public class PentagramaPanel extends JPanel {
    public PentagramaPanel(NotaJFugue currentNota, MelodiaJFugueDecorator currentMelodia) {
        setBackground(Color.black);
        setPreferredSize(new Dimension(414, 300));
        setMinimumSize(new Dimension(414, 300));
        addMouseListener(new PentagramaListener(currentNota));
        ImageIcon img = new ImageIcon("resources/pentagrama.gif");
        JLabel label = new JLabel("", img, JLabel.CENTER);
        add(label);
    }
}
