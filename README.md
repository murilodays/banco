# Caixa Eletrônico Simples

Bem-vindo ao repositório do **Caixa Eletrônico Simples**! Este projeto foi desenvolvido como parte de uma atividade acadêmica da disciplina de **Desenvolvimento para Dispositivos Móveis**, utilizando **Kotlin** para simular o funcionamento básico de um caixa eletrônico no terminal.

## Tecnologias Utilizadas

- **Kotlin**: Linguagem utilizada para a implementação da lógica do caixa eletrônico.
- **Scanner**: Ferramenta do Java utilizada para entrada de dados do usuário.

## Estrutura do Projeto

O sistema de caixa eletrônico oferece as seguintes funcionalidades:

- **Sacar dinheiro**: Permite ao usuário retirar um valor do saldo.
- **Depositar dinheiro**: Adiciona um valor ao saldo do usuário.
- **Consultar saldo**: Exibe o saldo atual.
- **Encerrar atendimento**: Finaliza o programa.

### Fluxo de Execução

1. O programa exibe um menu interativo no terminal.
2. O usuário escolhe entre as opções disponíveis digitando o número correspondente.
3. Dependendo da escolha, ele pode:
   - Sacar um valor, desde que haja saldo suficiente.
   - Depositar um valor, aumentando o saldo.
   - Consultar o saldo atual.
   - Encerrar o atendimento digitando **999**.

## Funcionamento do Código

### **CaixaEletronico.kt**

- A classe `CaixaEletronico` gerencia o saldo e as operações bancárias.
- O método `iniciar()` exibe o menu e processa a escolha do usuário.
- O método `sacar()` verifica se o saldo é suficiente antes de retirar dinheiro.
- O método `depositar()` permite adicionar dinheiro ao saldo.
- O método `conferirExtrato()` exibe o saldo atual.
- O `main()` inicia a execução do programa.

## Processo de Desenvolvimento

1. **Criação da Classe Principal**: Implementação da lógica para gerenciar transações.
2. **Interação com o Usuário**: Uso do `Scanner` para capturar entradas do terminal.
3. **Validação de Entrada**: Tratamento de casos como saldo insuficiente e opções inválidas.

## Melhorias Futuras

- Implementar uma interface gráfica para melhorar a usabilidade.

## Entre em Contato Comigo

- **Email**: contatomurilodays@gmail.com  
- **LinkedIn**: <a href="https://www.linkedin.com/in/murilodays/"> murilodays </a>  
- **Telefone/WhatsApp**: <a href="https://wa.me/message/ONXRU2RSDSNEE1"> +55 81 9 9608-5335 </a>

