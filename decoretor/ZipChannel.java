package decoretor;

public class ZipChannel extends ChannelDecorator {

    public ZipChannel(Channel channel) {
        super(channel);
    }

    @Override
    public void send(String data) {
        String zippedData = zip(data);
        System.out.println("Compactando dados...");
        super.send(zippedData); // Chama o send() do objeto decorado
    }

    @Override
    public String receive() {
        String receivedData = super.receive(); // Chama o receive() do objeto decorado
        System.out.println("Descompactando dados...");
        return unzip(receivedData);
    }

    private String zip(String data) {
        return "[ZIPPED]" + data + "[/ZIPPED]";
    }

    private String unzip(String data) {
        // Simplesmente remove a tag para simular a descompactação
        return data.replace("[ZIPPED]", "").replace("[/ZIPPED]", "");
    }
}