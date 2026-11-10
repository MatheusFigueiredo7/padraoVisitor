package padraoVisitor;

public class ResumoDocumentoVisitor implements Visitor {

    public String exibir(Documento documento) {
        return documento.aceitar(this);
    }

    @Override
    public String exibirContrato(Contrato contrato) {
        return "contrato{" +
                "contrato=" + contrato.getNumeroContrato() +
                ", nome='" + contrato.getNomeFuncionario() + '\'' +
                ", cargo=" + contrato.getCargo() +
                '}';
    }

    @Override
    public String exibirAtestado(Atestado atestado) {
        return "atestado{" +
                "atestado=" + atestado.getNumeroAtestado() +
                ", nome='" + atestado.getNomeFuncionario() + '\'' +
                ", motivo='" + atestado.getmotivo() + '\'' +
                '}';
    }

    @Override
    public String exibirHolerite(Holerite holerite) {
        return "holerite{" +
                "holerite=" + holerite.getNumeroholerite() +
                ", nome='" + holerite.getNomeFuncionario() + '\'' +
                ", salario=" + holerite.getSalarioLiquido() +
                '}';
    }
}