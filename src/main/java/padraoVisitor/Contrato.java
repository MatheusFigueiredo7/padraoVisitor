package padraoVisitor;

public class Contrato implements Documento {

    private int numeroContrato;
    private String nomeFuncionario;
    private Cargo cargo;

    public Contrato(int numeroContrato, String nomeFuncionario, Cargo cargo) {
        this.numeroContrato = numeroContrato;
        this.nomeFuncionario = nomeFuncionario;
        this.cargo = cargo;
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public String getCargo() {
        return this.cargo.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirContrato(this);
    }

}
