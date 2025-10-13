package decoretor;

public abstract class ChannelDecorator implements Channel {
    protected Channel decoratedChannel;

    public ChannelDecorator(Channel channel) {
        this.decoratedChannel = channel;
    }

    @Override
    public void send(String data) {
        // Por padrão, delega a chamada para o canal decorado.
        decoratedChannel.send(data);
    }

    @Override
    public String receive() {
        // Por padrão, delega a chamada para o canal decorado.
        return decoratedChannel.receive();
    }
}