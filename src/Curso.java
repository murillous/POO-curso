public class Curso {
    private String nomeCurso;
    private String horario;
    private Professor professor;
    private Aluno[] aluno = new Aluno[5];

    public Curso(String nomeCurso, String horario){
        this.nomeCurso = nomeCurso;
        this.horario = horario;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public Aluno[] getAluno() {
        return aluno;
    }
    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }
}
