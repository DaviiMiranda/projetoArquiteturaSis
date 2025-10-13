package decoretor;

public class UDPChannel implements Channel {
    @Override
    public void send(String data) {
        System.out.println("Enviando '" + data + "' via UDP.");
    }

    @Override
    public String receive() {
        String data = "Dados recebidos via UDP";
        System.out.println("Recebendo dados via UDP.");
        return data;
    }
}