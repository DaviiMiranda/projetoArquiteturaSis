public class Teste2 {
    private Channel ch;

    public Teste2(ChannelAbstractFactory factory){
        this.ch = factory.createChannel();
    }

    public void connectar(){
        this.ch.getMessage();
    }
}
