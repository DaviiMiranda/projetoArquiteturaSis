public class TCPChannelFactory implements ChannelAbstractFactory {
    @Override
    public Channel createChannel() {
        return new TCPChannel();
    }
}