public class NotaJFugue {
    private String nota;
    private String octava;
    private char duracion;

    public NotaJFugue() {
        octava = "5";
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public char getDuracion() {
        return duracion;
    }

    public void setDuracion(char duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return nota + octava + duracion;
    }
}
