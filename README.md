# Sistema de Livraria - RocketLibrary

Esse Sistema de Livraria é uma aplicação console em Java para gerenciamento de empréstimos de livros em uma biblioteca. O sistema permite listar livros disponíveis, realizar empréstimos, processar devoluções, consultar históricos de empréstimos, buscar livros por diversos critérios e cadastrar novos autores e livros dinamicamente.

## Funcionalidades

- **Listar Livros Disponíveis:** Exibe os livros que estão disponíveis para empréstimo.
- **Empréstimo de Livros:** Permite que o usuário selecione um livro (por ID) e registre seu empréstimo, informando o nome do cliente.
- **Devolução de Livros:** Realiza a devolução do livro emprestado, atualizando o status e registrando a data de devolução.
- **Histórico de Empréstimos:** Permite consultar o histórico de empréstimos por cliente ou por livro.
- **Busca e Filtros:** Busca livros por título, autor ou gênero, melhorando a usabilidade do sistema.
- **Cadastro Dinâmico:** Permite cadastrar novos autores e livros diretamente pela interface, sem necessidade de alterar o código.
- **Pre-carregamento de Dados:** O sistema inicia com 20 livros e 5 autores pré-cadastrados.
- **Logging:** Uso de logs (via `java.util.logging.Logger`) para acompanhar operações importantes e facilitar a manutenção.

## Estrutura do Projeto

- **Autor.java:** Define a classe `Autor` com atributos como id, nome e data de nascimento.
- **Livro.java:** Define a classe `Livro` com atributos como id, título, autor, gênero, status de disponibilidade e datas de cadastro/atualização.
- **Emprestimo.java:** Define a classe `Emprestimo` para registrar os empréstimos, contendo informações do livro, cliente, data do empréstimo e data de devolução (quando aplicável).
- **Biblioteca.java:** Classe Singleton que gerencia a coleção de livros, autores e empréstimos. Contém métodos para pré-carregar dados, realizar empréstimos, devoluções, buscas e cadastros dinâmicos.
- **Main.java:** Ponto de entrada da aplicação, contendo a interface de console e o menu principal para interação com o usuário.

## Pré-requisitos

- Java 8 ou superior

## Como Executar

1. **Clone o repositório:**
   `git clone https://github.com/mathsena/rocketLibrary.git`
2. **Compile o projeto:**
   Navegue até o diretório raiz e compile as classes:

   ```
   javac com/mathsena/*.java
   ```
3. **Execute a aplicação:**

`java com.livraria.Main`


4. **Siga as instruções na interface de console:**

- Selecione a opção desejada no menu.
- Para empréstimos, devoluções, buscas e cadastros, siga os prompts apresentados.

## Uso

Ao iniciar o sistema, o usuário verá um menu com as seguintes opções:

1. **Listar livros disponíveis:** Mostra os livros que podem ser emprestados.
2. **Emprestar livro:** Permite selecionar um livro pelo ID e registrar o empréstimo com o nome do cliente.
3. **Devolver livro:** Realiza a devolução do livro, verificando se o empréstimo foi registrado para o cliente informado.
4. **Consultar histórico de empréstimos:** Consulta o histórico de empréstimos por cliente ou por livro.
5. **Buscar livros:** Permite realizar buscas por título, autor ou gênero.
6. **Cadastrar novo autor:** Permite o cadastro dinâmico de um novo autor.
7. **Cadastrar novo livro:** Permite o cadastro dinâmico de um novo livro, selecionando um autor previamente cadastrado.
8. **Sair:** Encerra a aplicação.

## Possíveis Melhorias Futuras

- **Persistência de Dados:** Integração com banco de dados (por exemplo, MySQL, PostgreSQL ou NoSQL) para armazenamento persistente.
- **Interface Gráfica ou Web:** Desenvolvimento de uma interface gráfica (JavaFX/Swing) ou uma API RESTful com Spring Boot.
- **Validação Avançada:** Melhoria na validação de entradas e tratamento de exceções.444
- **Testes Automatizados:** Implementação de testes unitários e de integração com frameworks como JUnit e Mockito.
- **Logging Avançado:** Uso de frameworks como SLF4J com Logback para logs mais robustos e configuráveis.

## Licença

Este projeto é open source e está disponível sob a [MIT License](LICENSE).

## Contato

Para dúvidas ou sugestões, entre em contato em [mathsena07@hotmail.com](mailto:mathsena07@hotmail.com).
