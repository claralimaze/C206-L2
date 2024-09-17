import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca bibliotecaCentral = new Biblioteca("Biblioteca Central", "Centro");
        Livro livro1 = new Livro("O Senhor dos Anéis", 500, "Fantasia");
        Livro livro2 = new Livro("Dom Casmurro", 250, "Romance");
        Livro livro3 = new Livro("A Arte da Guerra", 100, "Estratégia");

        Autor autor1 = new Autor("J.R.R. Tolkien", "Reino Unido");
        Autor autor2 = new Autor("Machado de Assis", "Brasil");
        Autor autor3 = new Autor("Sun Tzu", "China");

        bibliotecaCentral.addLivro(livro1);
        bibliotecaCentral.addLivro(livro2);
        bibliotecaCentral.addLivro(livro3);
        autor1.escreverLivro(livro1);
        autor2.escreverLivro(livro2);
        autor3.escreverLivro(livro3);

        Bibliotecario bibliotecario = new Bibliotecario("João", 40, true);

        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n=== Sistema da Biblioteca ===");
            System.out.println("1. Adicionar novo livro");
            System.out.println("2. Remover livro");
            System.out.println("3. Verificar cliente e emprestar livro");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o número de páginas: ");
                    int nPaginas = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite a categoria do livro: ");
                    String categoria = scanner.nextLine();
                    System.out.print("Digite o nome do autor: ");
                    String nomeAutor = scanner.nextLine();
                    System.out.print("Digite o país do autor: ");
                    String paisAutor = scanner.nextLine();

                    Livro novoLivro = new Livro(titulo, nPaginas, categoria);
                    Autor novoAutor = new Autor(nomeAutor, paisAutor);
                    novoAutor.escreverLivro(novoLivro);

                    bibliotecaCentral.addLivro(novoLivro);

                    System.out.println("\nLivro adicionado com sucesso! Lista de livros:");
                    for (Livro livro : bibliotecaCentral.getLivros()) {
                        System.out.println(livro);
                    }
                    break;

                case 2:
                    System.out.print("Digite o título do livro que deseja remover: ");
                    String tituloRemover = scanner.nextLine();

                    boolean livroRemovido = false;
                    for (Livro livro : bibliotecaCentral.getLivros()) {
                        if (livro.getTitulo().equalsIgnoreCase(tituloRemover)) {
                            bibliotecaCentral.removerLivro(livro);
                            livroRemovido = true;
                            break;
                        }
                    }

                    if (livroRemovido) {
                        System.out.println("\nLivro removido com sucesso! Lista atualizada de livros:");
                        for (Livro livro : bibliotecaCentral.getLivros()) {
                            System.out.println(livro);
                        }
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("Digite a idade do cliente: ");
                    int idadeCliente = scanner.nextInt();
                    System.out.print("Digite o débito do cliente: ");
                    double debitoCliente = scanner.nextDouble();
                    scanner.nextLine();

                    Cliente cliente = new Cliente(nomeCliente, idadeCliente, debitoCliente);

                    System.out.println("\nLivros disponíveis:");
                    for (int i = 0; i < bibliotecaCentral.getLivros().size(); i++) {
                        System.out.println((i + 1) + ". " + bibliotecaCentral.getLivros().get(i).getTitulo());
                    }

                    System.out.print("Digite o número do livro que o cliente deseja pegar: ");
                    int escolhaLivro = scanner.nextInt();

                    if (escolhaLivro < 1 || escolhaLivro > bibliotecaCentral.getLivros().size()) {
                        System.out.println("Escolha inválida.");
                    } else {
                        Livro livroEscolhido = bibliotecaCentral.getLivros().get(escolhaLivro - 1);

                        // Verificando débito
                        if (cliente.pagarDebito(0) == 0) {
                            if (bibliotecaCentral.emprestarLivro(bibliotecario, cliente, livroEscolhido)) {
                                System.out.println("O cliente " + nomeCliente + " pegou o livro: " + livroEscolhido.getTitulo());
                            } else {
                                System.out.println("Não foi possível emprestar o livro.");
                            }
                        } else {
                            System.out.println("O cliente tem débito e não pode pegar o livro.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        // Fechando o scanner
        scanner.close();
    }
}