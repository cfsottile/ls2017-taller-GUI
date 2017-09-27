import org.jfugue.player.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ImportPanel extends JPanel {
    private JTextField melodiaText;
    private Player player;

    public ImportPanel() {
        player = new Player();

        GridLayout layout = new GridLayout(1,2);
        setLayout(layout);

        melodiaText = new JTextField();
        add(melodiaText);

        JButton playButton = new JButton("Play");
        playButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                player.play(melodiaText.getText());
            }
        });
        add(playButton);
    }
}
