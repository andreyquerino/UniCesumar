/*
 * SUPERIOR DE TECNOLOGIA EM ANÁLISE E DESENVOLVIMENTO DE SISTEMAS - UNICESUMAR
 * MAPA - PROGRAMAÇÃO I - 2021
 * Andrey Querino
 * RA 1971669-5
 *
 */

package controledeestoque;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleDeEstoque {

    private final Produtos listaDeProdutos[] = new Produtos[10];
    private int posicao = 0;
    
    private void menuInformacaoEmpresa() {
        System.out.println("\n╔═══════════════════════╗");
        System.out.println("  EMPRESA DE IMPORTAÇÃO DE PRODUTOS LTDA ");
        System.out.println("      SISTEMA DE CONTROLE DE ESTOQUE     ");
        System.out.println("╚═══════════════════════╝");
    }
    
    private Produtos setInformacaoDosProdutos() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\nNome do produto: ");
        String nome = scanner.nextLine();
        System.out.printf("Unidade de medida: ");
        scanner = new Scanner(System.in);
        String unidade = scanner.nextLine();
        System.out.printf("Quantidade: ");
        int quantidade = scanner.nextInt();
        System.out.printf("Preço: ");
        float preco = scanner.nextFloat();

        Produtos produtos = new Produtos();
        produtos.setNome(nome);
        produtos.setUnidade(unidade);
        produtos.setPreco(preco);
        produtos.setQuantidade(quantidade);
        return produtos;
    }


    private String getRepetirOp() {
        Scanner scanner = new Scanner(System.in);
        String triagem;
        System.out.printf("REPETIR OPERAÇÃO ( S/N ) ? ");
        triagem = scanner.next();
        return triagem;
    }

    private String validacao() {
        Scanner scanner = new Scanner(System.in);
        String triagem;
        System.out.printf("\nCONFIRMA ALTERAÇÃO ( S/N ) ? ");
        triagem = scanner.next();
        return triagem;
    }

    private int getAlternativaMenu() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.next());
    }
    
    //Mensagem de erro!
    private void Error() {
        System.out.println("Erro! Opção inválida");
    }
    
    private void erroConsulta(boolean controle) {
        if (controle) {
            System.out.println("Erro! Produto não encontrado");
        }
    }
    
    public static void main(String[] args) {

        ControleDeEstoque execucao = new ControleDeEstoque();
        execucao.menuPrincipal();
    }

    private void menuPrincipal() {
        int opcao = 0;
        do {
            opcao = omenuPrincipal();
            switch (opcao) {
                case 1:
                    menuCadastro();
                    break;
                case 2:
                    menuMovimentacao();
                    break;
                case 3:
                    relatorioProdutos();
                    break;
                case 0:
                    System.out.println("Saindo do sistema");
                    break;
                default:
                    Error();
                    break;
            }
        } while (opcao != 0);
    }
    
    // ..:: PRINCIPAIS FUNÇÃOES ::..
    //
    // Menu Principal
    private int omenuPrincipal() {
        int opcao;
        menuInformacaoEmpresa();
        System.out.println("\n.:: MENU PRINCIPAL ::.\n" +
                           "\n[1] CADASTRO DE PRODUTOS\n" +
                           "[2] MOVIMENTAÇÕES\n" +
                           "[3] RELATÓRIOS\n" +
                           "[0] FINALIZAR\n");
        System.out.printf("OPÇÃO: ");
        opcao = getAlternativaMenu();
        return opcao;
    }
    
    // Menu de cadastro
    private void menuCadastro() {
        int opcao;
        this.menuInformacaoEmpresa();
        System.out.println("\n.:: CADASTRO DE PRODUTOS ::.");
        System.out.printf("\n[1] INCLUSÃO\n" +
                           "[2] ALTERAÇÃO\n" +
                           "[3] CONSULTA\n" +
                           "[4] EXCLUSÃO\n" +
                           "[0] RETORNAR\n\n");
        System.out.print("OPÇÃO: ");
        opcao = getAlternativaMenu();
        switch (opcao) {
            case 1:
                cadastrarProdutos();
                break;
            case 2:
                alterarProduto();
                break;
            case 3:
                consultarProduto();
                break;
            case 4:
                excluirProduto();
                break;
            default:
                Error();
                break;
        }
    }
    
    // Cadastro
    private void cadastrarProdutos() {
        String triagem;
        do {
            this.menuInformacaoEmpresa();

            System.out.println("\n.:: INCLUSÃO DE PRODUTOS ::.");
            Produtos produtos = setInformacaoDosProdutos();
            triagem = validacao();
            if (triagem.equalsIgnoreCase("S")) {
                listaDeProdutos[posicao] = produtos;
                posicao++;
            }
            triagem = getRepetirOp();

        } while (triagem.equalsIgnoreCase("S"));
    }
    
    //Alterar
    private void alterarProduto() {
        String triagem;
        do {
            Scanner scanner = new Scanner(System.in);
            this.menuInformacaoEmpresa();
            System.out.println("\nALTERAÇÃO DE PRODUTO");
            System.out.printf("Informe o nome do produto que deseja alterar: ");
            String nomeConsulta = scanner.nextLine();
            boolean controle=true;
            for (int i = 0; i < posicao; i++) {

                if (nomeConsulta.equalsIgnoreCase(listaDeProdutos[i].getNome())) {
                    controle=false;
                    System.out.println("PRODUTO ENCONTRADO\n");
                    Produtos produtos = setInformacaoDosProdutos();
                    triagem = validacao();
                    if (triagem.equalsIgnoreCase("S")) {
                        listaDeProdutos[i] = produtos;
                    }
                    break;
                }
            }
            erroConsulta(controle);
            triagem = getRepetirOp();

        } while (triagem.equalsIgnoreCase("S"));
    }
    
    // Movimentação
    private void menuMovimentacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nALTERAÇÃO DOS PRODUTOS");
        System.out.printf("[1] ENTRADA\n" +
                          "[2] SAÍDA\n" +
                          "[0] RETORNAR\n" +
                          "OPÇÃO: ");
        int opcaoMovimentacao = scanner.nextInt();
        switch (opcaoMovimentacao) {
            case 1:
                compraDeProdutos();
                break;
            case 2:
                saidaDeProdutos();
                break;
            case 0:
                System.out.println("Retornando ao menu");
                break;
            default:
                Error();
                break;
        }
    }
    
    // Consultar
    private void consultarProduto() {

        String triagem;
        do {
            Scanner scanner = new Scanner(System.in);
            this.menuInformacaoEmpresa();
            System.out.println("\nCONSULTA DE PRODUTOS");
            System.out.printf("Informe o nome do produto para pesquisa: ");
            String nomeConsulta = scanner.nextLine();
            boolean controle=true;
            for (int i = 0; i < posicao; i++) {
                if (nomeConsulta.equalsIgnoreCase(listaDeProdutos[i].getNome())) {
                    controle=false;
                    System.out.println(listaDeProdutos[i].toString());
                    break;
                }
            }
            erroConsulta(controle);
            triagem = getRepetirOp();

        } while (triagem.equalsIgnoreCase("S"));
    }

    //Excluir
    private void excluirProduto() {

        String triagem;
        do {
            Scanner scanner = new Scanner(System.in);
            this.menuInformacaoEmpresa();
            System.out.println("\nEXCLUSÃO DE PRODUTOS");
            System.out.printf("Informe o nome do produto para pesquisa: ");
            String nomeConsulta = scanner.nextLine();
            System.out.println("\n");
            boolean controle = true;
            ArrayList<Produtos> arrayList = new ArrayList();
            arrayList.add(new Produtos());
            for (int i = 0; i < posicao; i++) {
                scanner = new Scanner(System.in);
                if (nomeConsulta.equalsIgnoreCase(listaDeProdutos[i].getNome())) {
                    controle=false;
                    System.out.println(listaDeProdutos[i].toString());
                    System.out.printf("CONFIRMA EXCLUSÃO ( S/N )? ");
                    triagem = scanner.next();
                    if (triagem.equalsIgnoreCase("S")) {
                        for (int j = i; j < posicao - 1; j++) {
                            listaDeProdutos[j] = listaDeProdutos[j + 1];
                            posicao--;
                        }
                    }
                    break;
                }
            }
            erroConsulta(controle);
            triagem = getRepetirOp();

        } while (triagem.equalsIgnoreCase("S"));
    }
    
    // Relatório
    private void relatorioProdutos() {
        this.menuInformacaoEmpresa();
        System.out.println("\n.:: RELATÓRIO ::.");
        for (int i = 0; i < posicao; i++) {
            System.out.println("\nCÓDIGO: 00" + ( i + 1 ) + "\n" + listaDeProdutos[i]);
        }

        //Comando de espera para o usuário apertar a tecla ENTER para continuar
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\nPressione a tecla ENTER para continuar... ");
        scanner.nextLine(); 
    }
    
    // Saida de Produto
    private void saidaDeProdutos() {
        String triagem;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Venda dos produtos");
            System.out.printf("Nome do produto");
            String nomeProduto = scanner.nextLine();

            boolean controle = true;
            for (int i = 0; i < posicao; i++) {
                if (nomeProduto.equalsIgnoreCase(listaDeProdutos[i].getNome())) {
                    controle=false;
                    Produtos movimentacaoDeProdutos = listaDeProdutos[i];
                    System.out.println("QUANTIDADE ATUAL: " + movimentacaoDeProdutos.getQuantidade());
                    System.out.println("QUANTIDADE SAÍDA: ");
                    int quantidadeDeSaida = scanner.nextInt();
                    System.out.println("QUANTIDADE FINAL: " + (movimentacaoDeProdutos.getQuantidade() - quantidadeDeSaida));
                    if (movimentacaoDeProdutos.getQuantidade() < quantidadeDeSaida) {
                        System.out.println("Erro! Quantidade maior que no estoque");
                        break;
                    }
                    triagem = validacao();
                    if (triagem.equalsIgnoreCase("S")) {
                        movimentacaoDeProdutos.setSubitrairQuantidade(quantidadeDeSaida);
                        listaDeProdutos[i] = movimentacaoDeProdutos;
                    }
                    break;
                }
            }
            erroConsulta(controle);
            triagem = getRepetirOp();

        } while (triagem.equalsIgnoreCase("S"));
    }

    //Compra de Produto
    private void compraDeProdutos() {
        String triagem;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nCOMPRA DE PRODUTOS");
            System.out.printf("Nome do produto: ");
            String nomeProdutosC = scanner.nextLine();
            Produtos movimentacaoDeProdutos;
            boolean controle=true;
            for (int i = 0; i < posicao; i++) {
                if (nomeProdutosC.equalsIgnoreCase(listaDeProdutos[i].getNome())) {
                    controle=false;
                    movimentacaoDeProdutos = listaDeProdutos[i];
                    System.out.printf("QUANTIDADE ATUAL: " + movimentacaoDeProdutos.getQuantidade());
                    System.out.printf("QUANTIDADE ENTRADA: ");
                    int quantidadeEntrada = scanner.nextInt();
                    System.out.printf("QUANTIDADE FINAL: " + (movimentacaoDeProdutos.getQuantidade() + quantidadeEntrada));
                    triagem = validacao();
                    if (triagem.equalsIgnoreCase("S")) {
                        movimentacaoDeProdutos.setSomarQuantidade(quantidadeEntrada);
                        listaDeProdutos[i] = movimentacaoDeProdutos;
                    }
                    break;
                }
            }
            erroConsulta(controle);

            triagem = getRepetirOp();

        } while (triagem.equalsIgnoreCase("S"));
    }
}
