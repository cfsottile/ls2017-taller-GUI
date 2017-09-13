import javax.swing.*;
import java.awt.*;

public class PentagramaPanel extends JPanel {
    public PentagramaPanel(NotaJFugue currentNota, MelodiaJFugue currentMelodia, MelodiaPanel melodiaPanel) {
        setBackground(Color.black);
        setPreferredSize(new Dimension(414, 300));
        setMinimumSize(new Dimension(414, 300));
        
        addMouseListener(new PentagramaListener(currentNota, melodiaPanel));
        
        ImageIcon img = new ImageIcon("resources/pentagrama.gif");
        JLabel label = new JLabel("", img, JLabel.CENTER);
        add(label);
    }
}
