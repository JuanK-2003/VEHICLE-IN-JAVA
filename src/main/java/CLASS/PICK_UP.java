package CLASS;

/**
 *
 * @author Juan_K
 */
public class PICK_UP extends FATHER_CLASS {
    protected String Medida_Cab ;
    protected int Largo;
    protected String Traccion;

    public PICK_UP() {
 
    }
    public PICK_UP(String Medida_Cab, int Largo, String Traccion, String No_Placa, int Modelo, String Marca) {
        super(No_Placa, Modelo, Marca);
        this.Medida_Cab = Medida_Cab;
        this.Largo = Largo;
        this.Traccion = Traccion;
    }

    public String getMedida_Cab() {
        return Medida_Cab;
    }

    public void setMedida_Cab(String Medida_Cab) {
        this.Medida_Cab = Medida_Cab;
    }

    public int getLargo() {
        return Largo;
    }

    public void setLargo(int Largo) {
        this.Largo = Largo;
    }

    public String getTraccion() {
        return Traccion;
    }

    public void setTraccion(String Traccion) {
        this.Traccion = Traccion;
    }
    
}
