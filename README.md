# Native-Image Lambda Function with GraalVM

Este repositório demonstra como criar e implantar uma função AWS Lambda em Java, utilizando a imagem nativa do GraalVM, para obter inicialização rápida e desempenho otimizado.

## Tecnologias:
- Java 11 ou superior
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

