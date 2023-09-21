# Precisa ser feito

### APIS
- [X] testar api do fbi
- [X] deserialização da api do fbi 
- [X] configurar persistencia no h2 database
- [X] mapear entidades para o banco
- [ ] persistir dados do fbi no banco
- [ ] testar api da interpol
- [ ] deserialização da api do interpol
- [ ] persistir dados da no banco

### Refatoração
- [ ] subistituir os DTOS por records
- [ ] modelo de dados
- [X] remover classes não utilizadas

## Ordem de operação
1. O sistema inicia a consulta no banco de dados local.

2. O banco de dados local verifica se há registros equivalentes ao nome fornecido na consulta.

3. Se houver registros no banco de dados local:
  - O banco de dados local retorna as consultas equivalentes.

4. Se não houver registros no banco de dados local:
  - O sistema faz uma requisição à API.
  - A API processa a requisição.
  - A API retorna os resultados da consulta.

5. O sistema armazena um registro no banco de dados local com as seguintes informações:
  - ID da consulta na API
  - Data e hora da consulta
  - Nome procurado

6. O sistema finaliza a consulta.
