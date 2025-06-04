public class App {

public static void main(String[] args) {
Professor professor = new Professor("Erick", "Matemática", 3210432, "professor@gmail.com");

System.out.println("O professor " + professor.getNome() + "\n Tem o registro número: " + professor.getRP());
System.out.println("Leciona as materias: " + professor.getMaterias() + "\n E seu email institucional é " + professor.getEmail());
professor.PreencherBoletim(null);
}
}