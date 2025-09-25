public class Main {
    public static void main(String[] args) {
        
        ChannelAbstractFactory udpFactory = new UDPChannelFactory();
        ChannelAbstractFactory tcpFactory = new TCPChannelFactory();

        Teste1 t1 = new Teste1(udpFactory);
        Teste2 t2 = new Teste2(tcpFactory);
        Teste3 t3 = new Teste3(udpFactory);

        t1.connectar();
        t2.connectar();
        t3.connectar();

    }
}
