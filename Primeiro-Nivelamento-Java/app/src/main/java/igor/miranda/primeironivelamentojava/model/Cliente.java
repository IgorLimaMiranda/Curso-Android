package igor.miranda.primeironivelamentojava.model;

// classe Pojo - ela só vai ter os atributos, construtor(es) e métodos de acesso
public class Cliente {

    // atributos - nome, email - telefone, idade, sexo (private)
    // construtor
    // métodos de acesso (getts e setts) - ação - verbo CamelCase

    private String nome;
    private String email;
    private String telefone;
    private int idade;
    private boolean sexo;

    // Tipos de Dados: primitivo e não primitivo

    // Construtor - padrão: ele permite que a gente crie objetos (não é necessário criar-lo, pois toda classe tem seu construtor padrão)
    //public Cliente() {}


    public Cliente(String nome, String email, String telefone, int idade, boolean sexo) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
}
