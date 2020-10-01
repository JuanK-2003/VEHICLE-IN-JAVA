package CLASS;

/**
 *
 * @author Juan_K
 */
public class MOTORCYCLE extends FATHER_CLASS {
    protected String Tipo_Motor ;
    protected String Medida_Rines;
    protected int CC_Motor ;

    public MOTORCYCLE() {
 
    }
    public MOTORCYCLE(String Tipo_Motor, String Medida_Rines, int CC_Motor, String No_Placa, int Modelo, String Marca) {
        super(No_Placa, Modelo, Marca);
        this.Tipo_Motor = Tipo_Motor;
        this.Medida_Rines = Medida_Rines;
        this.CC_Motor = CC_Motor;
    }

    public String getTipo_Motor() {
        return Tipo_Motor;
    }

    public void setTipo_Motor(String Tipo_Motor) {
        this.Tipo_Motor = Tipo_Motor;
    }

    public String getMedida_Rines() {
        return Medida_Rines;
    }

    public void setMedida_Rines(String Medida_Rines) {
        this.Medida_Rines = Medida_Rines;
    }

    public int getCC_Motor() {
        return CC_Motor;
    }

    public void setCC_Motor(int CC_Motor) {
        this.CC_Motor = CC_Motor;
    }
    
}
