package padraoVisitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DocumentoVisitorTest {

    @Test
    void deveExibirContrato() {
        Contrato contrato = new Contrato(1, "Ana", new Cargo("Analista de Sistemas"));

        ResumoDocumentoVisitor visitor = new ResumoDocumentoVisitor();
        assertEquals("contrato{contrato=1, nome='Ana', cargo=Analista de Sistemas}", visitor.exibir(contrato));
    }

    @Test
    void deveExibirAtestado() {
        Atestado atestado = new Atestado(1, "Maria", "Consulta médica");

        ResumoDocumentoVisitor visitor = new ResumoDocumentoVisitor();
        assertEquals("atestado{atestado=1, nome='Maria', motivo='Consulta médica'}", visitor.exibir(atestado));
    }

    @Test
    void deveExibirHolerite() {
        Holerite holerite = new Holerite(1, "Pedro", 5000.0f);

        ResumoDocumentoVisitor visitor = new ResumoDocumentoVisitor();
        assertEquals("holerite{holerite=1, nome='Pedro', salario=5000.0}", visitor.exibir(holerite));
    }

}
