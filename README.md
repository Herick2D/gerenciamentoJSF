# GerenciamentoJSF

Este é um projeto pessoa com fins academicos chamado GerenciamentoJSF, desenvolvido como parte de um estudo sobre aplicações fullstack utilizando as tecnologias Java8, JSF (JavaServer Faces), JPA (Java Persistence API) e PrimeFaces. O objetivo principal do projeto é demonstrar operações básicas de CRUD (Create, Read, Update, Delete) em uma aplicação web.

## Dependências
Todas as dependências do projeto estão listadas no arquivo pom.xml.
## Visão Geral do Projeto

O projeto GerenciamentoJSF inclui uma interface de usuário construída usando arquivos XHTML que empregam JSF e PrimeFaces para criar uma interface rica e interativa. Ele oferece funcionalidades de cadastro, edição, exclusão e pesquisa de empresas.
Arquivos XHTML

O arquivo XHTML fornecido (CadastroEmpresas.xhtml) contém:

    Um formulário para pesquisa, adição, edição e exclusão de empresas.
    Uma tabela para exibir as empresas cadastradas.
    Um diálogo para adicionar e editar empresas.

## Funcionalidades Principais
### Pesquisa de Empresas

Os usuários podem pesquisar empresas digitando um termo na barra de pesquisa e clicando no botão "Pesquisar".
### Adição de Nova Empresa

Os usuários podem adicionar uma nova empresa clicando no botão "Nova". Isso abre um diálogo onde eles podem preencher os detalhes da nova empresa.
### Edição de Empresa Existente

Os usuários podem editar uma empresa existente selecionando-a na tabela e clicando no botão "Editar". Isso abre um diálogo preenchido com os detalhes da empresa selecionada para edição.
### Exclusão de Empresa

Os usuários podem excluir uma empresa existente selecionando-a na tabela e clicando no botão "Excluir". Uma confirmação será solicitada antes da exclusão.
### Exportação para Excel

Existe uma opção para exportar os dados da tabela para um arquivo Excel.
## Executando o Projeto

Para executar o projeto, é necessário configurá-lo em um ambiente de desenvolvimento Java, garantindo que todas as dependências estejam resolvidas. Em seguida, o projeto pode ser implantado em um servidor de aplicativos compatível com Java EE.
