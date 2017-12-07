public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Alexander");
        funcionario.setSobrenome("Gobbato");
        funcionario.setCargo("Professor");
        funcionario.imprimeEstado();
        funcionario.imprimeQtdeQuinquenio(1985,2017);
    }
}