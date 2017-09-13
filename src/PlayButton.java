import org.jfugue.player.Player;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PlayButton extends JButton{
    private MelodiaJFugue melodia;
    
    public PlayButton(MelodiaJFugue melodia) {
        super("Play");
        this.melodia = melodia;
    }
  
}
