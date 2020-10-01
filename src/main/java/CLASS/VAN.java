package CLASS;

/**
 *
 * @author Juan_K
 */
public class VAN extends FATHER_CLASS {
    protected int No_Asientos ;
    protected int Cantidad_Personas ;
    protected String Tipo_Combustible ;

    public VAN() {
 
    }

    public VAN(int No_Asientos, int Cantidad_Personas, String Tipo_Combustible, String No_Placa, int Modelo, String Marca) {
        super(No_Placa, Modelo, Marca);
        this.No_Asientos = No_Asientos;
        this.Cantidad_Personas = Cantidad_Personas;
        this.Tipo_Combustible = Tipo_Combustible;
    }

    public int getNo_Asientos() {
        return No_Asientos;
    }

    public void setNo_Asientos(int No_Asientos) {
        this.No_Asientos = No_Asientos;
    }

    public int getCantidad_Personas() {
        return Cantidad_Personas;
    }

    public void setCantidad_Personas(int Cantidad_Personas) {
        this.Cantidad_Personas = Cantidad_Personas;
    }

    public String getTipo_Combustible() {
        return Tipo_Combustible;
    }

    public void setTipo_Combustible(String Tipo_Combustible) {
        this.Tipo_Combustible = Tipo_Combustible;
    }
    
}
