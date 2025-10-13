package decoretor;

public class BufferChannel extends ChannelDecorator {

    public BufferChannel(Channel channel) {
        super(channel);
    }

    @Override
    public void send(String data) {
        System.out.println("Colocando dados no buffer de envio...");
        super.send(data);
    }

    @Override
    public String receive() {
        System.out.println("Lendo dados do buffer de recebimento...");
        return super.receive();
    }
}