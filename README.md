
# Password Generator (Java)

Este projeto é um **gerador de senhas aleatórias** desenvolvido em **Java**, projetado para criar senhas seguras e personalizáveis. Ele permite a geração de senhas com diferentes comprimentos e combinações de caracteres, incluindo letras maiúsculas, minúsculas, números e caracteres especiais.

## Funcionalidades

- **Personalização do comprimento**: Defina o número de caracteres desejado para a senha gerada.
- **Inclusão de caracteres especiais**: Adicione símbolos, como `!@#$%^&*()`, para aumentar a complexidade da senha.
- **Maiúsculas e minúsculas**: Escolha se deseja incluir letras maiúsculas e minúsculas.
- **Números**: Opção para adicionar números à senha.
- **Validação de configuração**: O sistema valida se pelo menos uma categoria de caracteres foi selecionada e se o comprimento é válido.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para a lógica de geração de senhas e validações.
- **Random**: Classe nativa do Java usada para garantir a aleatoriedade na geração das senhas.

## Como Usar

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/daniele-senko/password-generator-java.git
   ```

2. **Compile e execute o código** em qualquer IDE Java de sua preferência, como IntelliJ IDEA, Eclipse ou NetBeans.

3. **Siga as instruções** que aparecerão no terminal para definir os parâmetros desejados da senha, como:
   - Comprimento da senha
   - Inclusão de letras maiúsculas, minúsculas, números e caracteres especiais

4. **Exemplo de execução**:

   Ao executar o programa, ele solicitará que você insira as configurações para a senha:

   ```
   Digite o comprimento desejado para a senha:
   > 12

   Incluir letras maiúsculas? (s/n):
   > s

   Incluir minúsculas? (s/n):
   > s

   Incluir números? (s/n):
   > s

   Incluir caracteres especiais? (s/n):
   > n

   Senha gerada: J9jT3b1nNz6r
   ```

## Contribuindo

Contribuições são bem-vindas! Para sugerir melhorias ou corrigir bugs, abra uma **issue** ou envie um **pull request**. Certifique-se de que os testes estejam funcionando antes de enviar seu código.

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).
