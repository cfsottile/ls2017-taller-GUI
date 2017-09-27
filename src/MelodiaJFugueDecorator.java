import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MelodiaJFugueDecorator {
    private MelodiaJFugue melodia;
    private List<MelodiaPanel> subscriptors;

    public MelodiaJFugueDecorator(MelodiaJFugue melodia) {
        this.melodia = melodia;
        subscriptors = new ArrayList<>();
    }

    public void subscribe(MelodiaPanel subscriptor) {
        subscriptors.add(subscriptor);
    }

    public void unsubscribe(MelodiaPanel subscriptor) {
        subscriptors.remove(subscriptor);
    }

    public void agregarNota(NotaJFugue nota) {
        melodia.agregarNota(nota);
        onChange();
    }

    public void removerUltimaNota() {
        melodia.removerUltimaNota();
        onChange();
    }

    public void clean() {
        melodia.clean();
        onChange();
    }

    @Override
    public String toString() {
        return melodia.toString();
    }

    private void onChange() {
        subscriptors.forEach(s -> s.update());
    }
}
