

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero = Integer.valueOf(args [0]);
        String agencia = args [1];
        String nomeCliente = args [2];
        double saldo = Double.parseDouble(args[3]);

        System.out.println("Por favor, digite o número da Agência");
       // System.out.println(agencia);
        System.out.println("Informe seu nome");
        //System.out.println(nomeCliente);
        System.out.println("Informe seu número");
        System.out.println("Informe seu saldo");

        System.out.println("Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numero))
                .concat(" e seu saldo ")
                .concat(String.valueOf(saldo))
                .concat(" já está disponível para saque."));

    }
}
