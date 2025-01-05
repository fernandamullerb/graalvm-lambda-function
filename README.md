# Native-Image Lambda Function with GraalVM

Este repositório demonstra como criar e implantar uma função AWS Lambda em Java, utilizando a imagem nativa do GraalVM, para obter inicialização rápida e desempenho otimizado.

## Tecnologias:
- Java 21
- Maven Shade (para empacotar as dependências em um único jar)
- GraalVM Native Image (para gerar o arquivo binário)
- Assembly (para empacotar o binário e o arquivo bootstrap em um zip)

## Build:
O seguinte comando deve ser executado na raíz do projeto: `mvn clean package -Pnative-image`

## Deploy:
Após a execução do comando acima, o arquivo function-native.zip será gerado na pasta `target` e deverá ser utilizado para o upload do código da função Lambda na AWS.

## Execução:
O runtime da função deverá ser Amazon Linux 2023, conforme abaixo:
![image](https://github.com/user-attachments/assets/5d38492f-fabb-4544-8e9b-0da79eb54b80)

## Performance:
Duração da primeira execução (cold start):
![image](https://github.com/user-attachments/assets/84a2fc36-338e-4acf-be51-3f4503a79d4d)

Duração da segunda execução (warm start):
![image](https://github.com/user-attachments/assets/b4eaf67c-cdc4-49a9-84f3-7fd5adadfda6)

