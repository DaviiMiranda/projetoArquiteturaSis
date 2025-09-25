public class Sanduiche {
    private String pao;
    private String queijo;
    private String tomate;
    private String alface;
    private String carne;
    private String maionese;


    public void setPao(String pao) {
        this.pao = pao;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public void setTomate(String tomate) {
        this.tomate = tomate;
    }

    public void setAlface(String alface) {
        this.alface = alface;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setMaionese(String maionese) {
        this.maionese = maionese;
    }
    @Override
    public String toString() {
        return "Sanduíche{" +
                "pão='" + pao + '\'' +
                ", queijo='" + queijo + '\'' +
                ", tomate='" + tomate + '\'' +
                ", alface='" + alface + '\'' +
                ", carne=" + carne + '\'' +
                ", maionese" + maionese +
                '}';
    }
}
