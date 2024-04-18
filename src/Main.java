import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descricao Java");
        curso.setCargaHoraria(30);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Javapowerd");
        mentoria.setDescricao("Descricao mentoria");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
        System.out.println(curso);
    }
}