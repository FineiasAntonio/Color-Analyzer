package Main;

public class Cor {
    private String códigoCor;
    private Integer quantidade = 1;
    private float frequency;

    public float getFrequency() {
        return frequency;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    public Cor(String códigoCor) {
        this.códigoCor = códigoCor;
    }

    public Cor(String códigoCor, Integer quantidade, float frequency) {
        this.códigoCor = códigoCor;
        this.quantidade = quantidade;
        this.frequency = frequency;
    }

    public static String toHex(int i){
        return "0x"+Integer.toHexString(i).toUpperCase();
    }

    public String getCódigoCor() {
        return códigoCor;
    }

    public void adcionar(){
        this.quantidade++;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((códigoCor == null) ? 0 : códigoCor.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cor other = (Cor) obj;
        if (códigoCor == null) {
            if (other.códigoCor != null)
                return false;
        } else if (!códigoCor.equals(other.códigoCor))
            return false;
        return true;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    
    
}
