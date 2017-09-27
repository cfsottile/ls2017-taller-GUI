import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PentagramaListener implements MouseListener {
    private NotaJFugue currentNota;

    public PentagramaListener(NotaJFugue currentNota) {
        this.currentNota = currentNota;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        currentNota.setNota(getNota(e.getY()));
    }

    public String getNota(int coordY) {
        int section = 302 / 21;
        String note = "";
        //DO
        if ((coordY >= 0 && coordY < section*4) || (coordY >= section*13 && coordY < section*14)) {
            note = "C";
        }

        // RE
        if ((coordY >= section*4 && coordY < section*5) || (coordY >= section*14 && coordY < section*16)) {
            note = "D";
        }

        // MI
        if ((coordY >= section*5 && coordY < section*7) || (coordY >= section*16 && coordY < section*17)) {
            note = "E";
        }

        // FA
        if ((coordY >= section*7 && coordY < section*8) || (coordY >= section*17 && coordY < section*19)) {
            note = "F";
        }

        // SOL
        if ((coordY >= section*8 && coordY < section*10) || (coordY >= section*19)) {
            note = "G";
        }

        // LA
        if (coordY >= section*10 && coordY < section*11) {
            note = "A";
        }

        // SI
        if (coordY >= section*11 && coordY < section*13) {
            note = "B";
        }

        return note;
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

