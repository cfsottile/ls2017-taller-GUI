import org.jfugue.player.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MelodiaPanel extends JPanel {
    private MelodiaJFugueDecorator melodia;
    private JTextField melodiaText;
    private Player player;

    public MelodiaPanel(MelodiaJFugueDecorator melodia) {
        this.melodia = melodia;
        melodia.subscribe(this);
        player = new Player();

        GridLayout layout = new GridLayout(1,4);
        setLayout(layout);

        melodiaText = new JTextField();
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

        add(melodiaText);

        JButton playButton = new JButton("Play");
        playButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                player.play(melodiaText.getText());
            }
        });
        add(playButton);

        add(clean);
        add(undo);
    }

    public void update() {
        melodiaText.setText(melodia.toString());
    }
}
