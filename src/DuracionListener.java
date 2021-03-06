import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DuracionListener implements MouseListener {
    MelodiaJFugueDecorator currentMelodia;
    NotaJFugue currentNota;

    public DuracionListener(NotaJFugue currentNota, MelodiaJFugueDecorator currentMelodia) {
        this.currentNota = currentNota;
        this.currentMelodia = currentMelodia;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        currentNota.setDuracion(((DuracionBoton) e.getComponent()).getRepresentacion());
        currentMelodia.agregarNota(
                new NotaJFugue(currentNota.getNota(),currentNota.getOctava(), currentNota.getDuracion()));
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
