package decoretor;

public class LogChannel extends ChannelDecorator {

    public LogChannel(Channel channel) {
        super(channel);
    }

    @Override
    public void send(String data) {
        System.out.println("LOG: Preparando para enviar dados.");
        super.send(data);
        System.out.println("LOG: Dados enviados com sucesso.");
    }

    @Override
    public String receive() {
        System.out.println("LOG: Preparando para receber dados.");
        String data = super.receive();
        System.out.println("LOG: Dados recebidos com sucesso.");
        return data;
    }
}
