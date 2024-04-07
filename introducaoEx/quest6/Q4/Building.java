package Q4;

public class Building implements CarbonFootprint  {
    private double carbonoConstrucao;
    private double usoAnualCarbono;
    private int anosFuncionamento;
    
    public int getAnosFuncionamento() {
        return anosFuncionamento;
    }

    public void setAnosFuncionamento(int anosFuncionamento) {
        this.anosFuncionamento = anosFuncionamento;
    }

    public Building(double carbonoConstrucao, double usoAnualCarbono, int anosFuncionamento) {
        this.carbonoConstrucao = carbonoConstrucao;
        this.usoAnualCarbono = usoAnualCarbono;
        this.anosFuncionamento = anosFuncionamento;
    }

    public double getCarbonoConstrucao() {
        return carbonoConstrucao;
    }

    public void setCarbonoConstrucao(double carbonoConstrucao) {
        this.carbonoConstrucao = carbonoConstrucao;
    }

    public double getUsoAnualCarbono() {
        return usoAnualCarbono;
    }

    public void setUsoAnualCarbono(double usoAnualCarbono) {
        this.usoAnualCarbono = usoAnualCarbono;
    }

    @Override
    public double getCarbonFootprint() {
        return ((carbonoConstrucao + (usoAnualCarbono * anosFuncionamento)) * 1000);
    }
    
}
