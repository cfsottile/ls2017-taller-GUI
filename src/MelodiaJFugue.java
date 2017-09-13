import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class MelodiaJFugue {
    private Stack<NotaJFugue> notas;

    public MelodiaJFugue() {
        notas = new Stack<>();
    }

    public void agregarNota(NotaJFugue nota) {
        notas.push(nota);
        System.out.println("[MelodiaJFugue] Nota agregada" + nota.toString());
    }

    public void removerUltimaNota() {
      if (!notas.empty()) {
        notas.pop();
      } else {
        System.out.println("[MelodiaJFugue] No hay notas");
      }
    }

    public void clean() {
        notas = new Stack<>();
    }

    @Override
    public String toString() {
//        StringBuffer str = new StringBuffer();
//        notas.forEach((nota) -> str.append(nota.toString()));
//        return str.toString();

//        notas.stream().reduce(("", (notasStr, nota) -> nota.toString() + notasStr));

//        notas.stream().map(NotaJFugue::toString).join(" ");

        return notas
                .stream()
                .map(NotaJFugue::toString)
                .collect(Collectors.joining(" "));
    }
}
