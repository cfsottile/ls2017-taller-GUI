import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuracionPanel extends JPanel {
    public DuracionPanel(NotaJFugue currentNota, MelodiaJFugueDecorator currentMelodia) {
//        GridLayout layout = new GridLayout(1,8);
//        setLayout(layout);

        setLayout(new FlowLayout());

        List<DuracionBoton> duraciones = Stream
                .of("redonda", "blanca", "negra", "corchea", "semicorchea", "fusa", "semifusa")
                .map(str -> new DuracionBoton(str))
                .collect(Collectors.toList());

        DuracionListener duracionListener = new DuracionListener(currentNota, currentMelodia);

        duraciones.forEach((b) -> {
            b.addMouseListener(duracionListener);
            add(b);
        });
    }
}
