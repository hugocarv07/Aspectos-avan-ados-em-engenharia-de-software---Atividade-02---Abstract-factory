package padroesprojeto.abstractfactory.hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PacienteUrgenciaTest {

    @Test
    void deveEmitirReceituarioDeUrgencia() {
        Paciente paciente = new Paciente(new FabricaUrgencia());
        assertEquals("Receituário de atendimento de urgência", paciente.emitirReceituario());
    }

    @Test
    void deveEmitirLaudoMedicoDeUrgencia() {
        Paciente paciente = new Paciente(new FabricaUrgencia());
        assertEquals("Laudo médico de urgência", paciente.emitirLaudoMedico());
    }
}
