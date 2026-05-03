# Sistema Escolar: Java, POO e Lógica

Este projeto foi desenvolvido para praticar os fundamentos de **Programação Orientada a Objetos (POO)** e **Lógica de programação** em Java. O sistema permite o cadastro de alunos, armazenamento de notas e cálculo de médias.

## Funcionalidades
*   **Cadastro de Estudantes:** Registro de nomes e notas bimestrais.
*   **Cálculo de Média:** Classe de serviço dedicada para processar o desempenho acadêmico.
*   **Listagem Organizada:** Exibição de todos os alunos com seus respectivos índices e médias finais.

## Relato de Aprendizado e Desafios
Este projeto foi desenvolvido como um estudo prático. Durante o processo, utilizei ferramentas de IA (Google Gemini e ChatGPT) como suporte lógico para compreender conceitos ainda em desenvolvimento.

**Onde foi utilizado o apoio da IA:**
*   **Lógica de busca e ID (Case 2):**  Construção da lógica que verifica se o ID digitado é válido e se a posição no array realmente contém um aluno cadastrado, evitando acesso a dados inexistentes e o encerramento inesperado do programa.

*   **Percorrendo o Array e Exibindo Dados (Case 3):** Orientação na utilização do laço for, usando uma variável de referência (Estudante estudante) para percorrer o array e calcular e exibir a média de cada aluno.

*   **Instanciação e Organização dos Dados:** Implementação do operador new dentro do loop e uso de um contador (totalEstudantes++), garantindo que cada cadastro crie um novo espaço na memória e evitando sobrescrita de dados.

*   **Buffer do Scanner:** Uso de scanner.nextLine() após a leitura de números no menu para consumir o "Enter" pendente e evitar falhas na entrada de dados

**O que foi aprendido na prática:**
1.  **Programação Orientada a Objetos (POO):** Modelei o sistema com base nos conceitos de POO, criando a classe Estudante para representar os alunos e a classe CalculadorMedia para separar a lógica de cálculo da interface principal.
   
2.  **Organização por Pacotes:** Dividi o projeto em pacotes (modelo, servico e main), facilitando a manutenção e a organização do código.

3.  **Interface via Console (Menu Interativo):** Implementei um menu utilizando do-while e switch-case, permitindo navegação entre funcionalidades sem encerrar o programa.
   
4.  **Persistência em Memória (Arrays de Objetos):** Utilizei um array de objetos como banco de dados temporário em memória, armazenando múltiplos estudantes de forma organizada.
