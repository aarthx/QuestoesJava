package introducaoEx.quest3;

public class ClienteTest {
    
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, 1000, 650, 200, 500);
        System.out.println("Novo Saldo: " + (cliente.getSaldoInicio() + cliente.getTotalCobrados() - cliente.getTotalCredito()));
        if(cliente.excedeuLimite()) {
            System.out.println("Limite de crédito excedido");
        }

    }
}
