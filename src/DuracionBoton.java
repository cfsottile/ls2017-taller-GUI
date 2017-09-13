import javax.swing.*;
import java.awt.*;

public class DuracionBoton extends JButton {
    private char representacion;
    private NotaJFugue currentNota;

    public DuracionBoton(String duracion, NotaJFugue currentNota) {
        ImageIcon img = new ImageIcon("resources/" + duracion + ".png");
        JLabel label = new JLabel("", img, JLabel.CENTER);
        add(label);
//        Image img = Toolkit.getDefaultToolkit().getImage()
      this.representacion = getRepresentacion(duracion);
      currentNota.setDuracion(String.valueOf(this.representacion));
    }

    private char getRepresentacion(String duracion) {
        switch (duracion) {
            case "redonda": return 'w';
            case "blanca": return 'h';
            case "negra": return 'q';
            case "corchea": return 'i';
            case "semicorchea": return 's';
            case "fusa": return 't';
            case "semifusa": return 'x';
            default: return 'w';
        }
    }
}
