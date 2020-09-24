#language: pt

@exemplo
Funcionalidade: Imprensa do Gfi World
  Como um QA
  Gostaria de automatizar o site gfi-world
  Para contabilizar a sessão de Imprensa
  De acordo com a etapa sugerida pelo processo seletivo

  Contexto: Acessar site gfi-world
    Dado que ele acessa o site gfi-world

  Cenário: verificar se existem ofertas disponíveis no site
    Dado que ele esteja na sessão "Imprensa"
    Então ele verifica que o texto "Imprensa" foi exibido com sucesso