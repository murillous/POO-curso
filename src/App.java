import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o nome do Curso");
        String nomeCurso = scan.nextLine();

        System.out.println("Digite o horario do curso");
        String horario = scan.nextLine();

        Curso curso = new Curso(nomeCurso, horario);

        System.out.println("Digite o nome do Professor");
        String nomeProfessor = scan.nextLine();

        System.out.println("Digite o departamento do professor");
        String departamento = scan.nextLine();

        System.out.println("Digite o email do professor");
        String email = scan.nextLine();

        Professor prof = new Professor(nomeProfessor,departamento,email);

        curso.setProfessor(prof);

        Aluno[] alunos = new Aluno[5];

        //Instanciando alunos
        for(int i = 0; i < alunos.length; i++) {
            System.out.println("Nome do(a) aluno(a) " + (i+1));
            String nomeAluno = scan.nextLine();

            System.out.println("Matricula do(a) aluno(a) " + (i + 1));
            String matricula = scan.nextLine();
            alunos[i] = new Aluno(nomeAluno, matricula);
        }

        curso.setAluno(alunos);
        //Setando notas do alunos
        for(int i = 0; i < alunos.length ; i++){
            double[] notas = new double[4];
            for(int j = 0; j < notas.length; j++){
                System.out.printf("Digite a nota %d e de  %s: ", (j+1), alunos[i].getNomeAluno());
                notas[j] = scan.nextDouble();
            }
            curso.getAluno()[i].setNota(notas);
        }

        
        double[] media = new double[5];

        //Mostando media de cada aluno
        for(int i = 0; i<curso.getAluno().length; i++){

            media[i] = curso.getAluno()[i].mediaAluno(curso.getAluno()[i].getNota());

            System.out.printf("A media de %s é %.2f\n",
            curso.getAluno()[i].getNomeAluno(), media[i]);
            
            String res = media[i] >= 7 ? "Aprovado" : "Reprovado";
            System.out.printf("%s %s\n",curso.getAluno()[i].getNomeAluno(),res);
        }

        double soma = 0;
        //Calulando media do curso
        for(int i = 0; i < media.length; i++){
            soma += media[i];
        }
        System.out.printf("A media da turma é %.2f", soma/media.length);

        scan.close();
    }
}
