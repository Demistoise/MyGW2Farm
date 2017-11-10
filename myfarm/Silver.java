package myfarm;

/**
 *
 * @author Demistoise
 */
public class Silver {
    
    //Variables bolsas
    private int bVerde;
    private int bRare;
    private int bCofre;
    private int bPod;
    private int bTotal;
    
    //Variables Esencia de Suerte
    private int s10;
    private int s50;
    private int s100;
    private int s200;
    private int sTotal;
    
    //Variables de calculo
    public double mediaSuerte;
    
    public Silver(int Verde,int Rare,int Cofre,int Pod, int s10, int s50, int s100, int s200) {
        this.bVerde = Verde;
        this.bRare = Rare;
        this.bCofre = Cofre;
        this.bPod = Pod;
        
        this.s10 = s10;
        this.s50 = s50;
        this.s100 = s100;
        this.s200 = s200;
    }
    
    //Setters
    
    public void setTotalBolsas() {
        this.bTotal = this.bVerde + this.bRare + this.bCofre+ this.bPod;
    }
    
    public void setTotalSuerte() {
        this.sTotal = (this.s10 * 10) + (this.s50 * 50) + (this.s100 * 100) + (this.s200 * 200);
    }
    
    public void setMediaSuerte() {
        this.mediaSuerte = sTotal / bTotal;
    }
}
