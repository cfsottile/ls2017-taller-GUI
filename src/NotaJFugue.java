public class NotaJFugue {
    private String nota;
    private String octava;
    private String duracion;

    public NotaJFugue() {
        octava = "5";
    }

    public NotaJFugue(String nota, String octava, String duracion) {
        this.nota = nota;
        this.octava = octava;
        this.duracion = duracion;
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

    public String getOctava() {
        return octava;
    }

    public void setOctava(String octava) {
        this.octava = octava;
    }

    @Override
    public String toString() {
        return nota + octava + duracion;
    }
}
