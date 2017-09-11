import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ImportPanel extends JPanel {
    private JTextField melodiaText;

    public ImportPanel() {
        GridLayout layout = new GridLayout(1,2);
        setLayout(layout);

        melodiaText = new JTextField();
        add(melodiaText);

        JButton playButton = new JButton("Play");
        playButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //
            }
        });
        add(playButton);
    }
}
