public class Produto
{
       public int codigo, quantidade;
       public String descricao;
       public double preco;

       public Produto prox;

       public Produto () //A classe produto ter� 2 construtores para que possamoas realizar as liga��es de no.
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
              return "C�digo: " + codigo + "\nDescri��o: " + descricao + "\nQuantidade: " + quantidade + "\nValor Unitário: " + preco;
       }
}