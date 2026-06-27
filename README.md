# Estoque — Controle de Produtos 📦

Sistema de **controle de estoque** em **Java**, com menu interativo via caixas de diálogo (Swing `JOptionPane`). Permite cadastrar, alterar, pesquisar e excluir produtos.

## ✨ Funcionalidades

Menu principal com as operações:

1. **Cadastrar** produto (código, descrição, quantidade, preço)
2. **Alterar** um produto existente
3. **Pesquisar** produto
4. **Excluir** produto
5. **Sair**

## 🧩 Organização

| Classe | Responsabilidade |
|--------|------------------|
| `Principal` | menu e fluxo da aplicação (`main`) |
| `Produto` | modelo do produto |
| `Estoque` | estrutura que armazena os produtos |
| `Funcao` | operações de incluir, excluir e pesquisar |

## 🛠️ Tecnologias

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)

- **Java** + **Swing** (`JOptionPane` para a interface)

## 🚀 Como executar

```bash
git clone https://github.com/limongi1234/Estoque.git
cd Estoque
javac Principal.java
java Principal
```

> 📚 Projeto acadêmico (Trabalho Final).
