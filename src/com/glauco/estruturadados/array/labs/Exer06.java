package com.glauco.estruturadados.array.labs;

import java.util.Scanner;
import com.glauco.estruturadados.array.List;
import com.glauco.estruturadados.array.teste.Contato;

public class Exer06 {
    public static void main(String[] args) {
        // Criação das variáveis
        Scanner scan = new Scanner(System.in);

        // Criar vetor de 20 de capacidade.
        List<Contato> lista = new List<Contato>(20);

        // Criar e adicionar 30 contatos
        criarContatosDinamicos(5, lista);

        // Criar menu para escolha de opção.
        int opcao = 1;

        while (opcao != 0) {
            opcao = obterOpcaoMenu(scan);

            switch (opcao) {
                case 1:
                    adicionaContatoFinal(scan, lista);

                    break;
                case 2:
                    adicionaContatoPosicao(scan, lista);

                    break;
                case 3:
                    obtemContatoPosicao(scan, lista);

                    break;
                case 4:
                    obtemContato(scan, lista);

                    break;
                case 5:
                    obtemContato(scan, lista);

                    break;
                case 6:
                    pesquisarContatoExiste(scan, lista);

                    break;
                case 7:
                    excluiPorPosicao(scan, lista);

                    break;
                case 8:
                    excluiContato(scan, lista);

                    break;
                case 9:
                    imprimeTamanho(lista);

                    break;
                case 10:
                    limparVetor(lista);

                    break;
                case 11:
                    imprimeVetor(lista);

                    break;
                default:
                    break;
            }
        }

        System.out.println("Digitado 0, terminando o programa...");
    }

    private static void imprimeVetor(List<Contato> lista) {
        System.out.println(lista);
    }

    private static void limparVetor(List<Contato> lista) {
        lista.limpar();

        System.out.println("Todos os contatos do vetor foram excluídos");
    }

    private static void imprimeTamanho(List<Contato> lista) {
        System.out.println("Tamanho do vetor é: " + lista.tamanho());
    }

    private static void excluiPorPosicao(Scanner scan, List<Contato> lista) {
        int pos = leInformacaoInt("Digite a posição a ser removida: ", scan);

        try {
            lista.remove(pos);

            System.out.println("Contato excluído");
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluiContato(Scanner scan, List<Contato> lista) {
        int pos = leInformacaoInt("Digite a posição a ser removida: ", scan);

        try {
            Contato contato = lista.busca(pos);

            lista.remove(contato);

            System.out.println("Contato excluído");
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner scan, List<Contato> lista) {
        int pos = leInformacaoInt("Digite a posição para pesquisar: ", scan);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Informações do contato: ");
            System.out.println(contato);

            boolean existe = lista.contem(contato);

            if (existe) {
                System.out.println("Contato existe, seguem dados");
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe");
            }
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarUltimoIndice(Scanner scan, List<Contato> lista) {
        int pos = leInformacaoInt("Digite a posição para pesquisar: ", scan);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Informações do contato: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último índice do contato encontado");
            pos = lista.ultimoIndice(contato);

            System.out.println("Contato encontrado na posição: " + pos);
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContato(Scanner scan, List<Contato> lista) {
        int pos = leInformacaoInt("Digite a posição para pesquisar: ", scan);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Informações do contato: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontado");
            pos = lista.busca(contato);

            System.out.println("Contato encontrado na posição: " + pos);
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContatoPosicao(Scanner scan, List<Contato> lista) {
        int pos = leInformacaoInt("Digite a posição para pesquisar: ", scan);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Informações do contato: ");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void adicionaContatoFinal(Scanner scan, List<Contato> lista) {
        System.out.println("Criando um contato, digite as informações:");
        String nome = leInformacao("Digite o nome", scan);
        String telefone = leInformacao("Digite o telefone", scan);
        String email = leInformacao("Digite o email", scan);

        Contato contato = new Contato(nome, telefone, email);

        lista.adiciona(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void adicionaContatoPosicao(Scanner scan, List<Contato> lista) {
        System.out.println("Criando um contato, digite as informações: ");
        String nome = leInformacao("Digite o nome", scan);
        String telefone = leInformacao("Digite o telefone", scan);
        String email = leInformacao("Digite o email", scan);

        Contato contato = new Contato(nome, telefone, email);

        int pos = leInformacaoInt("Digite a posição a adicionar o contato", scan);

        try {
            lista.adiciona(pos, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Posição inválida, contato não adicionado");
        }
    }

    protected static String leInformacao(String msg, Scanner scan) {
        System.out.println(msg);
        String entrada = scan.nextLine();

        return entrada;
    }

    protected static int leInformacaoInt(String msg, Scanner scan) {
        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida) {
            try {
                System.out.println(msg);
                String entrada = scan.nextLine();

                num = Integer.parseInt(entrada);

                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente");
            }

        }

        return num;
    }

    protected static int obterOpcaoMenu(Scanner scan) {
        boolean entradaValida = false;
        int opcao = 0;
        String entrada;

        while (!entradaValida) {
            System.out.println("Digite a opção desejada: ");
            System.out.println("0: Sair.");
            System.out.println("1: Adiciona contato no final do vetor.");
            System.out.println("2: Adiciona contato em uma posição específica.");
            System.out.println("3: Obtém contato em uma posição.");
            System.out.println("4: Consulta contato.");
            System.out.println("5: consulta último índice do contato.");
            System.out.println("6: Verifica se contato existe.");
            System.out.println("7: Remove contato de uma posição.");
            System.out.println("8: Excluir contato.");
            System.out.println("9: Verifica tamanho do vetor.");
            System.out.println("10: Excluir todos os contatos do vetor.");
            System.out.println("11: Mostra vetor.\n");

            try {
                entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao >= 0 && opcao <= 11) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente.\n\n");
            }
        }

        return 0;
    }

    private static void criarContatosDinamicos(int quantidade, List<Contato> lista) {
        Contato contato;

        for (int i = 0; i < quantidade; i++) {
            contato = new Contato();

            contato.setNome("Contato " + i);
            contato.setTelefone("1111" + i);
            contato.setEmail("contato" + i + "@email.com");

            lista.adiciona(contato);
        }
    }
}
