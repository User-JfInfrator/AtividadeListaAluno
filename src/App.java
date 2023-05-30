import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        List<Aluno>lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Pessoa pss = new Pessoa();
        

        lista.add(new Aluno("Gabriel Pontes Bruzzi Portella Santos", 10));
        lista.add(new Aluno("Guilherme Esteves da Silva Mota   ", 11));
        lista.add(new Aluno("João Fellipe da Costa Amorim", 12));
        lista.add(new Aluno("Andrey Albuquerque Leite", 1));
        lista.add(new Aluno("Camille Vitória Dos Reis Silva", 2));
        lista.add(new Aluno("Nathan Esteves Vieira", 17));
        lista.add(new Aluno("Pedro Henrique da Silva Nascimento", 18));
        lista.add(new Aluno("Sérgio de Souza Lima Sobrinho", 19));
        lista.add(new Aluno("Carlos Leonardo Carvalho Otoline", 3));
        lista.add(new Aluno("Cássia Vitória Vieira Palagi", 4));
        lista.add(new Aluno("Christian Clemente da Silva", 5));
        lista.add(new Aluno("Emanuel Leocadio Ramalho", 9));
        lista.add(new Aluno("Davi de Almeida Silva", 6));
        lista.add(new Aluno("Davi Maia Martins Bittencourt de Souza", 7));
        lista.add(new Aluno("Thomás da Cruz Pinhero", 20));
        lista.add(new Aluno("Vinícius Chagas Magro", 21));
        lista.add(new Aluno("Eduardo da Silva Lima", 8));
        lista.add(new Aluno("Jose Wanderson da Silva Pimentel", 13));
        lista.add(new Aluno("Kesia do Amaral Mendes", 14));
        lista.add(new Aluno("Leonardo de Oliveira Bianco de Figueiredo", 15));
        lista.add(new Aluno("Luiz Felipe Vieira de Oliveira Ribeiro", 16));
        lista.add(new Aluno("Vinícius Gabriel Neves Dutra", 22));

        System.out.print("\033[H\033[2J");
            System.out.flush();

        System.out.println("1 - Listar alunos | 2 - Remover alunos");
        int alternativa = sc.nextInt();

        if(alternativa == 2){
            System.out.println("Digite o nome do aluno que deseja remover: ");
            String removerAlunos = sc.next();
            lista.removeIf(p -> p.getNome().contains(removerAlunos));
            

            for (Aluno aluno : lista) {
                System.out.println("Nome: " + aluno.getNome() + " | Matrícula: " + aluno.getMatricula());
        
            }
        }

        if(alternativa == 1){
            System.out.println("1 - Listar por nome | 2 - Listar por matrícula");
            int alternativa2 = sc.nextInt();

            if(alternativa2 == 1){
                lista.sort(null);
                for (Aluno aluno : lista) {
                    System.out.println("Nome: " + aluno.getNome() + " | Matrícula: " + aluno.getMatricula());
                    
                
                    
                }
            }
            else if(alternativa2 == 2){
                lista.sort(new ComparadorMatricula());
                for (Aluno aluno : lista) {
                    System.out.println("Nome: " + aluno.getNome() + " | Matrícula: " + aluno.getMatricula());
                    

                    
                }
            }

            
        }
        
        















    }
}
