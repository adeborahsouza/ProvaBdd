#Author: deborah.souza@rsinet.com.br
#Keywords Summary :
Feature: Registar um novo usuario no site

  Scenario: Registro com sucesso
    Given Usuario esta na home page 
    When usuario navegar para a pagina de registro 
    And preencher os campos corretamente 
    Then registro e feito 

  Scenario: Registro com falha
    Given Usuario esta na home page
    When  usuario navegar para a pagina de registro 
    When  preencher os campos incorretamente 
    Then registro nao e feito 
