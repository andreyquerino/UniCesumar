package br.unicesumar.aula.controle;
 
import br.unicesumar.aula.exceptions.DadoConsultadoException;
import br.unicesumar.aula.modelo.Projeto;
 
import java.util.HashSet;
import java.util.List;
import java.util.Set;
 
public class ProjetoImpl implements ProjetoDAO {
    //Collection que irá armazenar todos os projetos
    private static Set<Projeto> projetos = new HashSet<>();
 
    @Override
    public void adicionar(Projeto projeto) {
        for (int i = 0; i < 6; i++) {
            projetos.add(projeto);
        }
    }
 
    @Override
    public List<Projeto> listar() {
        for (Projeto p : projetos) {
            System.out.println(p);
        }
        return null;
    }
 
    @Override
    public Projeto consultarPorNome(String nome) throws DadoConsultadoException {
        for (Projeto ay1 : projetos) {
            if (nome.equals(ay1.getNome())) {
                System.out.println("Projeto encontrado!");
                System.out.println(ay1.toString()); 
            } 
        }
        return null;
    }
 
    @Override
    public Projeto alterar(String nome, Projeto projeto) throws DadoConsultadoException {
        for (Projeto ay2 : projetos) {
            if (nome.equals(ay2.getNome())) {
                  projetos.remove(ay2);  
            } 
        }
        adicionar(projeto);
        return null;
    }
 
    @Override
    public void excluir(Projeto projeto) throws DadoConsultadoException, UnsupportedOperationException {
 
    }
 
    @Override
    public void excluir(String nome) throws DadoConsultadoException, UnsupportedOperationException {
        for (Projeto ay3 : projetos) {
            if (nome.equals(ay3.getNome())) {
                projetos.remove(ay3);
                System.out.println(nome + " removido!");
            }
        }
    }
}
