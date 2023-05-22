package portalaluno.model;

import java.util.List;
import java.util.ArrayList;

public class ListaAluno {
    private static final List<Aluno> lista = new ArrayList();
    
     public static List<Aluno> Listar() {
          return lista;
      }
      
      public static void Adicionar(Aluno aluno) {
          lista.add(aluno);
      }
}
