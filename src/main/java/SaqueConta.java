public class SaqueConta {
    public static void saca(Conta conta, double valor){
        if (valor <= conta.getSaldo()){
            double v = conta.getSaldo() - valor;
        } else {
            throw new IllegalArgumentException("Valor deve ser menor ou igual ao saldo");
        }
    }
}
