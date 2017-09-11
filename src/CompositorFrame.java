import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CompositorFrame extends JFrame {
    NotaJFugue currentNota;
    MelodiaJFugue currentMelodia;

    public CompositorFrame() {
        currentNota = new NotaJFugue();
        currentMelodia = new MelodiaJFugue();

        setTitle("CoMpOsItOr");
        setSize(800,600);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });

        GridLayout layout = new GridLayout(4,1);
        setLayout(layout);

        getContentPane().add(new PentagramaPanel(currentNota, currentMelodia));
        getContentPane().add(new DuracionPanel(currentNota, currentMelodia));
        getContentPane().add(new MelodiaPanel(currentMelodia));
        getContentPane().add(new ImportPanel());

        setVisible(true);
    }
}
