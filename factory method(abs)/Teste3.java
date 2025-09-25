public class Teste3 {
    private Channel ch;

    public Teste3(ChannelAbstractFactory factory){
        this.ch = factory.createChannel();
    }

    public void connectar(){
        this.ch.getMessage();
    }
}
