import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PlayButton extends JButton implements MouseListener{
    private MelodiaJFugue melodia;

    public PlayButton(MelodiaJFugue melodia) {
        super("Play");
        this.melodia = melodia;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // reproducir con fugue
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
