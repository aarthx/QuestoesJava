package introducaoEx.quest3;

public class Cliente {
    private int numeroConta;
    private int saldoInicio;
    private int totalCobrados;
    private int totalCredito;
    private int limiteCredito;
    
    public Cliente(int numeroConta, int saldoInicio, int totalCobrados, int totalCredito,
            int limiteCredito) {
        this.numeroConta = numeroConta;
        this.saldoInicio = saldoInicio;
        this.totalCobrados = totalCobrados;
        this.totalCredito = totalCredito;
        this.limiteCredito = limiteCredito;
    }

    public int getTotalCobrados() {
        return totalCobrados;
    }
    public void setTotalCobrados(int totalCobrados) {
        this.totalCobrados = totalCobrados;
    }

    public int getTotalCredito() {
        return totalCredito;
    }
    public void setTotalCredito(int totalCredito) {
        this.totalCredito = totalCredito;
    }
    
    public int getLimiteCredito() {
        return limiteCredito;
    }
    public void setLimiteCredito(int limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public int getSaldoInicio() {
        return saldoInicio;
    }
    public void setSaldoInicio(int saldoInicio) {
        this.saldoInicio = saldoInicio;
    }

    public boolean excedeuLimite() {
        if(limiteCredito <= saldoInicio - totalCobrados + totalCredito) {
            return true;
        } else {
            return false;
        }
    }

}   
