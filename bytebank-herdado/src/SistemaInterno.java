public class SistemaInterno {

    private int senha = 2222;

    public void autentica(Autenticavel f) {
        boolean aut = f.autentica(this.senha);
        if (aut) {
            System.out.println("Autenticado!");
        } else {
            System.out.println("Não autorizado!");
        }
    }
}
