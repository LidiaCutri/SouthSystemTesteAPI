#language: pt

Funcionalidade: Validar CEP
  Como Quality Assurance
  Quero validar se a API https://viacep.com.br/ws está retornando o endereco corretamente


  Esquema do Cenario: Validar CEP
    Dado que eu consulte o endereco atraves da API viacep
    Quando informar o CEP "<cep>"
    Entao o servico me retorna o endereco "<lagradouro>","<bairro>","<localidade>","<uf>"

    Exemplos:
      |cep              |lagradouro                |bairro        |localidade       |uf       |
      |00000000         |Avenida Assis Brasil 3940 |São Sebastião |Porto Alegre     |RS       |
      |09270u50         |Avenida Assis Brasil 3940 |São Sebastião |Porto Alegre     |RS       |
      |91060900         |Avenida Assis Brasil 3940 |São Sebastião |Porto Alegre     |RS       |