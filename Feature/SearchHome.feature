Feature: Pesquisa na home page

  Scenario: Pesquisa home com sucesso
   Given Usuario esta na home page
    When clica em uma categoria da home
    And clica em um produto

  Scenario: Pesquisa home com falha
    Given Usuario esta na home page
    When clica em um produto invalido da home
