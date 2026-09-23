package padroesprojeto.abstractfactory.hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PacienteEletivaTest {

    @Test
    void deveEmitirReceituarioEletivo() {
        Paciente paciente = new Paciente(new FabricaEletiva());
        assertEquals("Receituário de atendimento eletivo", paciente.emitirReceituario());
    }

    @Test
    void deveEmitirLaudoMedicoEletivo() {
        Paciente paciente = new Paciente(new FabricaEletiva());
        assertEquals("Laudo médico de atendimento eletivo", paciente.emitirLaudoMedico());
    }
}
