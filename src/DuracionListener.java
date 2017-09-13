import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DuracionListener implements MouseListener {
    MelodiaJFugue currentMelodia;
    NotaJFugue currentNota;

    public DuracionListener(NotaJFugue currentNota, MelodiaJFugue currentMelodia) {
        this.currentNota = currentNota;
        this.currentMelodia = currentMelodia;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
      
        currentMelodia.agregarNota(currentNota);
        System.out.println("[DuracionListener] Current Nota: " + currentNota.toString());
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
