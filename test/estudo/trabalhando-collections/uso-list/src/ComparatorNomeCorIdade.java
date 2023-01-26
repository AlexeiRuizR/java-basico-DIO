import java.util.Comparator;

class ComparatorNomeCorIdade implements Comparator<Gato> {

  @Override
  public int compare(Gato o1, Gato o2) {
    int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
    if(nome != 0) return nome;

    int cor = o1.getCor().compareToIgnoreCase(o2.getCor());
    if(cor != 0) return nome;

    return Integer.compare(o1.getIdade(), o2.getIdade());
  }

}
