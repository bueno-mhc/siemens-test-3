# siemens-test-3

Para execução do  projeto, é necessário executar em um compilador java o arquivo em "problem3/src/App.java", classe principal do projeto.

As entradas são feitas na pasta "inputs" e pelo arquivo "grades.csv". A entrada de dados segue modelo CSV, sendo a primeira linha um header para as entradas, para indicar como devem ser inseridos os valores, no formato a seguir:
  
  (int) ID, (string) Nome, (float) Valor
  
 A entrada pode ter quantos alunos for desejado.
 
 Os arquivos de saída estão na pasta "outputs" no arquivo "orderedGrades.txt", além de serem impressos no terminal do usuário também.
  
Não deve-se alterar a localização de nenhum arquivo de entrada e saída, pois foram programados para serem lidos/gerados automaticamente nos caminhos especificados, incorrendo em falha de execução do programa caso sejam alterados.
 
No exemplo de saída, há um erro:

  Maria 10 99
 
  Marcela 9 81
  
  Julia 9 88
  
  Andreia 8 78
  
  NULL 7 63
  
  NULL 7 68
  
  Julia e Marcela tem a mesma nota, 9. Então os alunos devem ser ordenados em ordem alfabética ("Se houver mais de um aluno com a mesma nota (8-10) atribuído a eles, ordene esses alunos em particular por seus nomes em ordem alfabética."), de forma que Julia deveria vir antes de Marcela. Esse erro não foi reproduzido no programa desenvolvido, que atende a condição proposta.

