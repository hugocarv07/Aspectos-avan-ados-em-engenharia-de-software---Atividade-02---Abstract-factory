package padroesprojeto.abstractfactory.hospital;

public class Paciente {

    private Receituario receituario;
    private LaudoMedico laudoMedico;

    public Paciente(FabricaAtendimento fabrica) {
        this.receituario = fabrica.createReceituario();
        this.laudoMedico = fabrica.createLaudoMedico();
    }

    public String emitirReceituario() {
        return this.receituario.emitir();
    }

    public String emitirLaudoMedico() {
        return this.laudoMedico.emitir();
    }
}
