public abstract class FormaGeometrica implements Cloneable {
    protected String tipo;

    abstract void desenhar();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}