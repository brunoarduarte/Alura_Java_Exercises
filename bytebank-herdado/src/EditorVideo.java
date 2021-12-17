public class EditorVideo extends Funcionario {

    //reescrita ou sobrescrita do método
//    @Override
    public double getBonificacao() {
        System.out.println("Chamado método de bonificação do Editor de vídeo");
        return 150;
    }
}
