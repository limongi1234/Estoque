import javax.swing.JOptionPane;

public class Principal
{
         public static void main(String []args)
         {
            Estoque lista = new Estoque(); //Declaramos agora nossa Classe de Lista.
            Funcao funcao = new Funcao();//Declaramos agora a classe das fun��es de Excluir, Incluir e Pesquisar.

             //-------------------------------------Menu Principal --------------------------------------------------//
              String sop, dados, descricao;
              int quant, codigo;
              double preco;


              sop = JOptionPane.showInputDialog("1 - Cadastrar\n2 - Alterar\n3 - Pesquisar\n4 - Excluir\n 5 -Sair");

              while (true)
              {
                  switch (sop)
                  {
                         case "1":
                              dados = JOptionPane.showInputDialog("Informe o c�digo do produto:\n");
                              codigo = Integer.parseInt(dados);
                              descricao = JOptionPane.showInputDialog("Informe a descri��o do produto:\n");
                              dados = JOptionPane.showInputDialog("Informe a quantidade do produto:\n");
                              quant = Integer.parseInt(dados);
                              dados = JOptionPane.showInputDialog("Informe o pre�o da unidade do produto:\n");
                              preco = Double.parseDouble(dados);
                              funcao.IncluirNovoProduto(lista, codigo, descricao, preco, quant); //fun��o para cria��o de um novo No de produtos.
                              break;

                         case "2":
                              sop = JOptionPane.showInputDialog("Alterar:\n1) Dar Baixa.\n2)Dar Entrada.\n3)Alterar dados cadastrais.\n4)Voltar.");
                              String opt, qtd;

                              switch(sop)
                              {
                                         case "1":
                                              opt = JOptionPane.showInputDialog("Informe o c�digo do produto que deseja dar baixa: ");
                                              qtd = JOptionPane.showInputDialog("Informe a quantidade a ser dado baixa: Lembre-se de informar o valor NEGATIVO ao n�mero Ex.: -5\n");
                                              funcao.AlterarQuantidade(lista, Integer.parseInt(opt), Integer.parseInt(qtd) );
                                              break;

                                         case "2":
                                              opt = JOptionPane.showInputDialog("Informe o c�digo do produto que deseja dar entrada: ");
                                              qtd = JOptionPane.showInputDialog("Informe a quantidade de entrada: Lembre-se de informar o valor PURO, sem sinal. Ex.: 5\n");
                                              funcao.AlterarQuantidade(lista, Integer.parseInt(opt), Integer.parseInt(qtd) );
                                              break;

                                         case "3":
                                              opt = JOptionPane.showInputDialog("Informe o c�digo do produto que deseja alterar os dados: ");
                                              descricao = JOptionPane.showInputDialog("Informe a nova descri��o do produto:\n");
                                              qtd = JOptionPane.showInputDialog("Informe o novo valor da unidade do produto especificado:\n");
                                              preco = Double.parseDouble(qtd);
                                              funcao.AlterarInformacoes(lista, Integer.parseInt(opt), preco, descricao);
                                              break;

                                         case "4":
                                              break;

                                         default:
                                              JOptionPane.showMessageDialog(null,"Esta opção não existe.");
                              }
                              break;

                         case "3":
                              dados = JOptionPane.showInputDialog("Informe o c�digo do produto que deseja pesquisar:\n");
                              funcao.ProcurarProduto(lista, Integer.parseInt(dados) );
                              break;

                         case "4":
                              dados = JOptionPane.showInputDialog("Informe o c�digo do produto que deseja excluir da lista.\n");
                              funcao.ExcluirProduto(lista, Integer.parseInt(dados) );
                              break;

                         case "5":
                              break;

                        default:
                           JOptionPane.showMessageDialog(null, "Esta op��o n�o existe.");
                           break;
                }

                sop = JOptionPane.showInputDialog("1 - Cadastrar\n2 - Alterar\n3 - Pesquisar\n4 - Excluir\n5 -Sair");
                if (sop.equals("5")){break;}
            }
         }
}