public class Aluno {
    private String nomeAluno;
    private String matricula;
    private double[] nota = new double[4];

    public Aluno(String nomeAluno, String matricula) {
        this.nomeAluno = nomeAluno;
        this.matricula = matricula;
    }
    public String getNomeAluno() {
        return nomeAluno;
    }
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double[] getNota() {
        return nota;
    }
    public void setNota(double[] nota) {
        this.nota = nota;
    }
    public double mediaAluno(double[] notas){
        double media = 0;
        for(double nota : notas){
            media += nota;
        }
        return media/notas.length;
    }
}
