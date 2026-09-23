package padroesprojeto.abstractfactory.hospital;

public class FabricaEletiva implements FabricaAtendimento {

    @Override
    public Receituario createReceituario() {
        return new ReceituarioEletivo();
    }

    @Override
    public LaudoMedico createLaudoMedico() {
        return new LaudoMedicoEletivo();
    }
}
