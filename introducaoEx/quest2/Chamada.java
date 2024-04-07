package introducaoEx.quest2;

public class Chamada {
    private String nomeProfessor;
    private String nomeCurso;

    public Chamada(String professor, String curso) {
        this.nomeProfessor = professor;
        this.nomeCurso = curso;
    }

    public void setNomeProfessor(String nome) {
        this.nomeProfessor = nome;
    }
    
    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public String chamada() {
        return "Nome do professor: " + this.nomeProfessor + "\n Nome do curso: " + this.nomeCurso;
    }
}
