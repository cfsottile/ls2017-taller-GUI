import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CompositorFrame extends JFrame {
    NotaJFugue currentNota;
    MelodiaJFugueDecorator currentMelodia;

    public CompositorFrame() {
        currentNota = new NotaJFugue();
        currentMelodia = new MelodiaJFugueDecorator(new MelodiaJFugue());

        setTitle("CoMpOsItOr");
        setSize(800,700);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });

        GridLayout layout = new GridLayout(2,1);
        setLayout(layout);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        panel1.add(new PentagramaPanel(currentNota, currentMelodia));
        panel1.add(new DuracionPanel(currentNota, currentMelodia));

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(2,1));
        panel2.add(new MelodiaPanel(currentMelodia));
        panel2.add(new ImportPanel());

        getContentPane().add(panel1);
        getContentPane().add(panel2);

        setVisible(true);
    }
}
