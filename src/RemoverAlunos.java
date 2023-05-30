import java.util.function.Predicate;

public class RemoverAlunos implements Predicate <Aluno> {

    @Override
    public boolean test(Aluno aluno) {
        return aluno.getNome().contains(null);
    }
    
}
