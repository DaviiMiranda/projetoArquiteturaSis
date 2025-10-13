package decoretor;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- CENÁRIO 1: Canal TCP com Log e Zip ---");

        Channel tcpChannel = new TCPChannel();

       
        Channel loggedChannel = new LogChannel(tcpChannel);

        
        Channel finalChannel = new ZipChannel(loggedChannel);

        
        finalChannel.send("Olá, mundo do Padrão Decorator!");

        System.out.println("\n--- Recebendo no Cenário 1 ---");
        String receivedData = finalChannel.receive();
        System.out.println("Aplicação final recebeu: " + receivedData);

        System.out.println("\n============================================\n");

        System.out.println("--- CENÁRIO 2: Canal UDP com Buffer e Log ---");
        Channel udpWithBufferAndLog = new LogChannel(new BufferChannel(new UDPChannel()));

        udpWithBufferAndLog.send("Teste de UDP com decoradores.");
    }
}