# YouTube Project

## Visão Geral
Este projeto tem como objetivo simular a interação entre um sistema de vídeos e usuários, como em plataformas de streaming de vídeo. A implementação utiliza os principais conceitos de Programação Orientada a Objetos (POO), como Encapsulamento, Herança, Polimorfismo (de Sobrecarga e de Sobreposição) e Interface.

## Funcionalidades
- Usuários podem interagir com vídeos: assistir, avaliar e visualizar informações.
- Vídeos possuem atributos encapsulados: cada vídeo guarda informações como título, visualizações, curtidas e status (se está sendo reproduzido ou pausado).
- Usuários podem ter perfis distintos, que permitem interações diferenciadas com os vídeos.

## Conceitos de POO Utilizados
### 1. Encapsulamento
O encapsulamento é aplicado para proteger os atributos das classes `Video` e `Pessoa`. A manipulação desses atributos é realizada por meio de métodos públicos, garantindo maior controle sobre as alterações.

### 2. Herança
A classe `Pessoa` é uma superclasse que define os atributos e métodos comuns a todos os tipos de usuários. Já a classe `Inscrito`, que estende `Pessoa`, adiciona comportamentos e atributos específicos de um usuário que interage ativamente com os vídeos.

### 3. Polimorfismo de Sobrecarga
Métodos com o mesmo nome, mas diferentes assinaturas, foram implementados para aumentar a flexibilidade e o reuso do código.

### 4. Polimorfismo de Sobreposição
A classe `Inscrito` sobrepõe métodos da classe `Pessoa`, personalizando o comportamento do método `assistirVideo()` para esse tipo específico de usuário.

### 5. Interface
A interface `AcoesVideo` define os métodos que todas as classes que representam ações com vídeos devem implementar, como `play()`, `pause()`, e `like()`.

## Passos para Execução
1. Clone ou faça o download do código-fonte.
2. Importe o projeto em uma IDE de sua escolha.
3. Compile e execute a classe `Program`.

## Possíveis Melhorias
- Permitir avaliações mais detalhadas, como comentários e notas diferentes para critérios (ex: qualidade de imagem, som, conteúdo).
- Adicionar um sistema de recomendação de vídeos baseado nas preferências dos usuários, histórico de visualizações ou avaliação.
- Adicionar uma interface gráfica (GUI) para facilitar o uso.

## Contribuição
Sinta-se à vontade para contribuir com melhorias ou novas funcionalidades. Para isso, faça um fork deste repositório, crie uma branch para sua feature, e submeta um pull request.
