public class NotaJFugue {
    private String nota;
    private String octava;
    private String duracion;

    public NotaJFugue() {
        octava = "5";
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return nota + octava + duracion;
    }
}
