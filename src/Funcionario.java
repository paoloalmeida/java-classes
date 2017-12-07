public class Funcionario {
    private String nome;
    private String sobrenome;
    private String cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void imprimeEstado() {
        System.out.println("Nome: " + getNome());
        System.out.println("Sobrenome: " + getSobrenome());
        System.out.println("Cargo: " + getCargo());
    }

    public void imprimeQtdeQuinquenio(int ano_inicio, int ano_fim) {
        int diferenca = ano_fim - ano_inicio;
        int quiquenios = diferenca / 5;
        System.out.printf("O professor %s tem %d quinquênio(s).", getNome(), quiquenios);
    }
}