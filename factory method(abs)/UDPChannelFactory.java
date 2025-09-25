public class UDPChannelFactory implements ChannelAbstractFactory {
    @Override
    public Channel createChannel() {
        return new UDPChannel();
    }
}