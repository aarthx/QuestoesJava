package introducaoEx.quest2;

public class Date {
    private int dia;
    private int mes;
    private int ano;

    public Date(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return this.dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return this.mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return this.ano;
    }

    public void displayDate() {
        String diaFormatado = String.format("%02d", this.dia);
        String mesFormatado = String.format("%02d", this.mes);

        System.out.println("Date: " + diaFormatado + '/' + mesFormatado + "/" + this.ano);
    }

}
