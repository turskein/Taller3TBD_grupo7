package grupo7.tbd.models;

public class properties {
    private String NOM_REG;
    private String NOM_PROV;
    private String COD_COM;
    private String NOM_COM;
    private int COD_REGI;
    private double SUPERFICIE;
    private int POBLAC02;
    private int POBL2010;
    private double SHAPE_Leng;
    private double SHAPE_Area;

    

    public properties(String NOM_REG, String NOM_PROV, String COD_COM, String NOM_COM, int COD_REGI, double SUPERFICIE,
            int POBLAC02, int POBL2010, double SHAPE_Leng, double SHAPE_Area) {
        this.NOM_REG = NOM_REG;
        this.NOM_PROV = NOM_PROV;
        this.COD_COM = COD_COM;
        this.NOM_COM = NOM_COM;
        this.COD_REGI = COD_REGI;
        this.SUPERFICIE = SUPERFICIE;
        this.POBLAC02 = POBLAC02;
        this.POBL2010 = POBL2010;
        this.SHAPE_Leng = SHAPE_Leng;
        this.SHAPE_Area = SHAPE_Area;
    }
    public String getNOM_REG() {
        return NOM_REG;
    }
    public void setNOM_REG(String nOM_REG) {
        NOM_REG = nOM_REG;
    }
    public String getNOM_PROV() {
        return NOM_PROV;
    }
    public void setNOM_PROV(String nOM_PROV) {
        NOM_PROV = nOM_PROV;
    }
    public String getCOD_COM() {
        return COD_COM;
    }
    public void setCOD_COM(String cOD_COM) {
        COD_COM = cOD_COM;
    }
    public String getNOM_COM() {
        return NOM_COM;
    }
    public void setNOM_COM(String nOM_COM) {
        NOM_COM = nOM_COM;
    }
    public int getCOD_REGI() {
        return COD_REGI;
    }
    public void setCOD_REGI(int cOD_REGI) {
        COD_REGI = cOD_REGI;
    }
    public double getSUPERFICIE() {
        return SUPERFICIE;
    }
    public void setSUPERFICIE(double sUPERFICIE) {
        SUPERFICIE = sUPERFICIE;
    }
    public int getPOBLAC02() {
        return POBLAC02;
    }
    public void setPOBLAC02(int POBLAC02) {
        this.POBLAC02 = POBLAC02;
    }
    public int getPOBL2010() {
        return POBL2010;
    }
    public void setPOBL2010(int pOBL2010) {
        POBL2010 = pOBL2010;
    }
    public double getSHAPE_Leng() {
        return SHAPE_Leng;
    }
    public void setSHAPE_Leng(double sHAPE_Leng) {
        SHAPE_Leng = sHAPE_Leng;
    }
    public double getSHAPE_Area() {
        return SHAPE_Area;
    }
    public void setSHAPE_Area(double sHAPE_Area) {
        SHAPE_Area = sHAPE_Area;
    }

    
}
