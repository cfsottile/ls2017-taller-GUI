import org.jfugue.player.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MelodiaPanel extends JPanel {
    private MelodiaJFugue melodia;
    private JTextField melodiaText;

    public MelodiaPanel(MelodiaJFugue melodia) {
        this.melodia = melodia;
        GridLayout layout = new GridLayout(1,4);
        setLayout(layout);

        melodiaText = new JTextField();
        JButton play = new PlayButton(melodia);
        JButton clean = new JButton("Clean");
        JButton undo = new JButton("Undo");

        clean.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                melodia.clean();
                update();
            }
        });

        undo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                melodia.removerUltimaNota();
                update();
            }
        });
        
        play.addMouseListener(new MouseAdapter() {
          @Override
          public void mouseClicked(MouseEvent e) {
            System.out.println("[PlayButton] play melody: " + melodia.toString());
            Player player = new Player();
            player.play(melodia.toString());
            update();
          }
          
        });

        add(melodiaText);
        add(play);
        add(clean);
        add(undo);
    }

    public void update() {
        melodiaText.setText(melodia.toString());
    }
}
