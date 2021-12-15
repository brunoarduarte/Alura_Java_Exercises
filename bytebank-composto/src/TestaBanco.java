public class TestaBanco {

    public static void main(String[] args) {
        Cliente bruno = new Cliente();
        bruno.nome = "Bruno Araujo Duarte";
        bruno.cpf = "123.456.789-01";
        bruno.profissao = "programador";

        Conta contaDoBruno = new Conta();
        contaDoBruno.deposita(5000);
        System.out.println(contaDoBruno.getSaldo());

        contaDoBruno.titular = bruno;
        System.out.println(contaDoBruno.titular.nome);
    }
}
