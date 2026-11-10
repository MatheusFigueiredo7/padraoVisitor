package padraoVisitor;

public class Holerite implements Documento {

    private int numeroHolerite;
    private String nomeFuncionario;
    private float salarioLiquido;

    public Holerite(int numeroHolerite, String nomeFuncionario, float salarioLiquido) {
        this.numeroHolerite = numeroHolerite;
        this.nomeFuncionario = nomeFuncionario;
        this.salarioLiquido = salarioLiquido;
    }

    public int getNumeroholerite() {
        return numeroHolerite;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public float getSalarioLiquido() {
        return salarioLiquido;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirHolerite(this);
    }

}

