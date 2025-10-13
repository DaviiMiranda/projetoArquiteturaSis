package decoretor;

public class TCPChannel implements Channel {
    @Override
    public void send(String data) {
        System.out.println("Enviando '" + data + "' via TCP.");
    }

    @Override
    public String receive() {
        String data = "Dados recebidos via TCP";
        System.out.println("Recebendo dados via TCP.");
        return data;
    }
}