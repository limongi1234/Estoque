 import javax.swing.JOptionPane;

 public class Funcao
 {
         public Produto novo = new Produto();
          //Criaremos uma nova classe produto para passarmos os valores

         public void IncluirNovoProduto (Estoque lista, int codigo, String descricao, double preco, int quantidade) //Passaremos tanto a classe Estoque como os valores do novo produto a ser incluso.
         //Lembrando que a classe Estoque � considerada a nossa Lista.
         {
                int aux;
                Produto atual = new Produto();
                novo.codigo = codigo;
                novo.descricao = descricao;
                novo.preco = preco;
                novo.quantidade = quantidade;

                if(lista.quant == 0)
                {
                    lista.prim = new Produto(novo);//Criaremos agora o inicio da lista.
                    lista.ult = lista.prim;
                    lista.quant++;
                }
                else
                {
                    aux = Pesquisar(lista, codigo);
                    if (aux == 1)//Verifica se o c�digo j� existe ou n�o. Observa a fun��o Pesquisar mais abaixo.
                        JOptionPane.showMessageDialog(null, "C�digo j� utilizado em outro produto");
                    else
                    {
                        lista.ult.prox = new Produto(novo);//� criado o produto a partir do ultimo.
                        lista.ult = lista.ult.prox;// Assim sendo, o ultimo passar a ser o novo produto criado.
                        lista.quant++;
                    }
                }
         }

         public void AlterarQuantidade (Estoque lista, int codigo, int quantidade) //Passaremos por parametro a lista, o codigo do produto e quantidade a ser retirada.
         {
                Produto atual = new Produto();

                atual = lista.prim; //Aqui, o No atual recebera o primeiro da lista.

                if (Pesquisar(lista, codigo) > 0)//Verifica se o c�digo existe. Analisar a fun��o Pesquisar para mais informa��es.
                   for(int i = 0; i < lista.quant; i++) //Percorre a Lista at� o n desejado a partir do c�digo.
                   {
                        if (codigo == atual.codigo)
                        {
                            if(quantidade < 0)//Realiza a verifica��o se esta dando baixa ou entrada no estoque
                                if(atual.quantidade < (quantidade *- 1)) //Testa se atual é menor que o valor a ser dado baixa.
                                   JOptionPane.showMessageDialog(null, "O valor a ser retirado � maior do que o existente.");
                                else
                                   atual.quantidade += quantidade;//Modifica os valores de quantidade.
                            else
                                   atual.quantidade += quantidade;
                            break;
                        }
                        else
                            atual = atual.prox;
                    }
                 else
                     JOptionPane.showMessageDialog(null, "C�digo informado n�o existe.");
         }

         public void AlterarInformacoes(Estoque lista, int codigo, double valor, String descricao)
         {
                Produto atual = new Produto();
                atual = lista.prim;

                if (Pesquisar(lista, codigo) > 0)//Verifica se o c�digo existe. Analisar a fun��o Pesquisar para mais informa��es.
                   for(int i = 0; i < lista.quant; i++)
                   {
                           if (codigo == atual.codigo)
                           {
                              atual.preco = valor; //Altera as informa��es.
                              atual.descricao = descricao;
                               break;
                           }
                           else
                               atual = atual.prox;
                   }
                else
                    JOptionPane.showMessageDialog(null, "C�digo informado n�o existe.");
         }

         private int Pesquisar(Estoque lista, int codigo)
         {
                Produto atual = new Produto();

                atual = lista.prim; //Aqui, o No atual recebera o primeiro da lista.

                int i, cont = 0;
                for(i = 0; i < lista.quant; i++) //Percorre a Lista e verifica se o c�digo j� est� sendo utilizado;
                {
                        if (codigo == atual.codigo)
                            cont++;
                        else
                            atual = atual.prox;
                }
                return cont;
         }

         public void ProcurarProduto(Estoque lista, int codigo)
         {
                Produto atual = new Produto();

                atual = lista.prim; //Aqui, o No atual recebera o primeiro da lista.
                if (Pesquisar(lista, codigo) > 0)
                   for(int i = 0; i < lista.quant; i++) //Percorre a Lista at� achar o c�igo, se achar ir� informar os valores
                   {
                        if(codigo == atual.codigo)
                        {
                            JOptionPane.showMessageDialog(null, atual);
                            return;
                        }
                        else
                            atual = atual.prox;
                   }
                else
                    JOptionPane.showMessageDialog(null, "Este produto n�o existe.");
         }

         public void ExcluirProduto(Estoque lista, int codigo) //Localiza e exclui um produto
         {
                Produto atual = new Produto();
                atual = lista.prim;

                if (Pesquisar(lista, codigo) > 0)
                {
                   if (codigo == lista.prim.codigo && lista.quant > 1)
                   {
                           lista.prim = lista.prim.prox;
                           lista.quant--;
                           return;
                   }
                   if (lista.quant == 1)
                   {
                           lista.prim = null;
                           lista.quant --;
                           return;
                   }
                   if (lista.ult.codigo == codigo)
                      for (int i = 0; i < lista.quant; i++)
                      {
                          if(atual.prox.codigo == codigo)
                          {
                              lista.ult = atual;
                              lista.ult.prox = null;
                              lista.quant--;
                          }
                          else
                              atual = atual.prox;
                      }
                   else
                      for (int i = 0; i < lista.quant; i++)
                      {
                          if(atual.prox.codigo == codigo)
                          {
                              atual.prox = atual.prox.prox;
                              lista.quant--;
                              return;
                          }
                          else
                              atual = atual.prox;
                      }
                }
         }
 }