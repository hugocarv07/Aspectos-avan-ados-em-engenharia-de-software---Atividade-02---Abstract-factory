package padroesprojeto.abstractfactory.hospital;

public interface FabricaAtendimento {

    Receituario createReceituario();

    LaudoMedico createLaudoMedico();
}
