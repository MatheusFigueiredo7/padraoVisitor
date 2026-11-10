package padraoVisitor;

public class Atestado implements Documento {

    private int numeroAtestado;
    private String nomeFuncionario;
    private String motivo;

    public Atestado(int numeroAtestado, String nomeFuncionario, String motivo) {
        this.numeroAtestado = numeroAtestado;
        this.nomeFuncionario = nomeFuncionario;
        this.motivo = motivo;
    }

    public int getNumeroAtestado() {
        return numeroAtestado;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public String getmotivo() {
        return motivo;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirAtestado(this);
    }

}
