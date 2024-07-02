import java.util.Date;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GestorAcademico gestor = new GestorAcademico();

        Estudiante estudiante1 = new Estudiante(1, "Naomi", "de León", "01/03/2006", "matriculado");
        Estudiante estudiante2 = new Estudiante(2, "Laura", "Batres", "02/05/2000", "no matriculado");

        Curso curso1 = new Curso(1, "Matemática", "Curso de matemáticas básicas", 4, "1.0");
        Curso curso2 = new Curso(2, "Física", "Curso de física en general", 3, "1.0");


        gestor.matricularEstudiante(estudiante1);
        System.out.println();

        gestor.agregarCurso(curso1);
        System.out.println();

        gestor.agregarCurso(curso2);
        System.out.println();


        gestor.inscribirEstudianteCurso(estudiante1, curso1.getId());
        gestor.inscribirEstudianteCurso(estudiante2, curso2.getId());

        System.out.println();
        gestor.desinscribirEstudianteCurso(estudiante1.getId(), curso1.getId());


    }
}