public class Produto
{
       public int codigo, quantidade;
       public String descricao;
       public double preco;

       public Produto prox;

       public Produto () //A classe produto terá 2 construtores para que possamoas realizar as ligações de no.
       {
       }

       public Produto (Produto novo)
       {
              codigo = novo.codigo;
              descricao = novo.descricao;
              preco = novo.preco;
              quantidade = novo.quantidade;
       }

       public String toString()
       {
              return "Código: " + codigo + "\nDescrição: " + descricao + "\nQuantidade: " + quantidade + "\nValor UnitÃ¡rio: " + preco;
       }
}