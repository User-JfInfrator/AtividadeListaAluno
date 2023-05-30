public class Pessoa implements Comparable<Pessoa> {


    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return getNome().compareTo(pessoa.getNome());
        
    }


    
}
