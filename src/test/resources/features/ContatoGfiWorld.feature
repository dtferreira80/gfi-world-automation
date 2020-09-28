            #language: pt

            @exemplo
            Funcionalidade: Contactos do Gfi World
              Como um QA
              Gostaria de automatizar o site gfi-world
              Para contabilizar a sessão de Contactos
              De acordo com a etapa sugerida pelo processo seletivo

              Contexto: Acessar site gfi-world
                Dado que ele acessa o site gfi-world

              Cenário: verificar se existem contatos disponíveis no site
                Dado que ele esteja na sessão "Contactos"
                Então ele verifica que o texto "Contactos" foi exibido na página contactos com sucesso