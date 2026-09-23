package padroesprojeto.abstractfactory.hospital;

public class FabricaUrgencia implements FabricaAtendimento {

    @Override
    public Receituario createReceituario() {
        return new ReceituarioUrgencia();
    }

    @Override
    public LaudoMedico createLaudoMedico() {
        return new LaudoMedicoUrgencia();
    }
}
