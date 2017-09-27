import javax.swing.*;
import java.awt.*;

public class DuracionBoton extends JButton {
    private String representacion;

    public DuracionBoton(String duracion) {
        ImageIcon img = new ImageIcon("resources/" + duracion + ".png");
        JLabel label = new JLabel("", img, JLabel.CENTER);
        add(label);

//        Image img = Toolkit.getDefaultToolkit().getImage()
        this.representacion = calcularRepresentacion(duracion);
    }

    public String getRepresentacion() {
        return representacion;
    }

    private String calcularRepresentacion(String duracion) {
        switch (duracion) {
            case "redonda": return "w";
            case "blanca": return "h";
            case "negra": return "q";
            case "corchea": return "i";
            case "semicorchea": return "s";
            case "fusa": return "t";
            case "semifusa": return "x";
            default: return "w";
        }
    }
}
