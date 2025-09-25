public class Teste1 {
    private Channel ch;

    public Teste1(ChannelAbstractFactory factory){
        this.ch = factory.createChannel();
    }

    public void connectar(){
        this.ch.getMessage();
    }
}
