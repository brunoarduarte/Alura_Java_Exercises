public class TesteFuncionario {

    public static void main(String[] args) {
        Funcionario jose = new Funcionario();
        jose.setNome("José das Couves");
        jose.setCpf("12312312345");
        jose.setSalario(1300.50);

        System.out.println(jose.getNome());
        System.out.println(jose.getCpf());
        System.out.println(jose.getSalario());
        System.out.println(jose.getBonificacao());
    }
}
