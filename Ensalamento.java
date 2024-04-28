import java.util.ArrayList;
import java.util.List;

class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}



class Professor {
    private String nome;
    private String disciplina;

    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }
}



class Disciplina {
    private String nome;

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}



class Curso {
    private String nome;
    private List<Disciplina> disciplinas;

    public Curso(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}



class Turma {
    private Professor professor;
    private Disciplina disciplina;
    private List<Aluno> alunos;

    public Turma(Professor professor, Disciplina disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>();
    }

  

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public Professor getProfessor() {
        return professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}



public class Ensalamento {
    public static void main(String[] args) {
        Curso ti = new Curso("TI");
        Curso adm = new Curso("ADM");

        Disciplina poo = new Disciplina("POO do curso de TI");
        Disciplina estruturaDados = new Disciplina("Estrutura de Dados do curso de TI");
        Disciplina bi = new Disciplina("BI do curso de ADM");

        Professor mia = new Professor("Mia", "POO");
        Professor saulo = new Professor("Saulo", "Estrutura de Dados");
        Professor paula = new Professor("Paula", "BI");

        Turma turma1 = new Turma(mia, poo);
        turma1.adicionarAluno(new Aluno("Alfredo"));
        turma1.adicionarAluno(new Aluno("Amélia"));

        Turma turma2 = new Turma(saulo, estruturaDados);
        turma2.adicionarAluno(new Aluno("Bruno"));
        turma2.adicionarAluno(new Aluno("Bentinho"));

        Turma turma3 = new Turma(paula, bi);
        turma3.adicionarAluno(new Aluno("Ana"));
        turma3.adicionarAluno(new Aluno("Joelmir"));

        System.out.println("Ensalamento:");
        System.out.println("Turma 1: " + turma1.getDisciplina().getNome() + " (Prof. " + turma1.getProfessor().getNome() + ")");
        for (Aluno aluno : turma1.getAlunos()) {
            System.out.println("- " + aluno.getNome());
        }

        System.out.println("Turma 2: " + turma2.getDisciplina().getNome() + " (Prof. " + turma2.getProfessor().getNome() + ")");
        for (Aluno aluno : turma2.getAlunos()) {
            System.out.println("- " + aluno.getNome());
        }

        System.out.println("Turma 3: " + turma3.getDisciplina().getNome() + " (Prof. " + turma3.getProfessor().getNome() + ")");
        for (Aluno aluno : turma3.getAlunos()) {
            System.out.println("- " + aluno.getNome());
        }
    }
}
