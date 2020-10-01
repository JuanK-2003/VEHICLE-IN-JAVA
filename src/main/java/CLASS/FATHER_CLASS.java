package CLASS;

/**
 *
 * @author Juan_K
 */
public class FATHER_CLASS {
    protected String No_Placa;
    protected int Modelo;
    protected String Marca;

    public FATHER_CLASS(){
        
    }
    public FATHER_CLASS(String No_Placa, int Modelo, String Marca) {
        this.No_Placa = No_Placa;
        this.Modelo = Modelo;
        this.Marca = Marca;
    }

    public String getNo_Placa() {
        return No_Placa;
    }

    public void setNo_Placa(String No_Placa) {
        this.No_Placa = No_Placa;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
}
