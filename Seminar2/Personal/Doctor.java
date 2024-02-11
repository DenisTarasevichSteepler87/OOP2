package Seminar2.Personal;

public class Doctor extends Personal{
    Nurce nurce; 
    
    public Doctor(String name, Nurce nurce) {
        super(name);
        this.nurce = nurce;
    }

    public void doDiagnoze(){
        System.out.println(getClass().getSimpleName() + " ставит диагноз");
    }
}