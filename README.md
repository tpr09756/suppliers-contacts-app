# suppliers-contacts-app

### https://www.thymeleaf.org/

### https://spring.io/guides/gs/accessing-data-mysql/

### https://www.baeldung.com/learn-spring-course

## Java
Java é uma linguagem de programação amplamente usada para codificar aplicações Web. 
É uma das escolhas mais populares entre os desenvolvedores há mais de duas décadas. 
Java é uma linguagem multiplataforma (JVM), orientada a objetos, o que garante modularidade e escalabilidade.
Eco sistema Java.

## Thymeleaf
Java template engine que processa HTML, XML, texto, JS, CSS
Vai ser usado para renderizar as páginas no Browser

## Spring
Spring é a framework mais popular para desenvolver aplicações com o ecosistema Java
Uma das melhores e mais simples documentações contribuem para essa popularidade.
Já com vários anos de aplicação no desenvolvimento de software empresarial: garantem a sua maturidade e eficieência.

## Mysql
Open Source Database
Gratuita

## Maven
Ferramenta para construir e gerir projectos Java. 
Fará o gerenciamento das depêndencias e do ciclo de vida do projecto.


Arquitectura
Aplicação server-side com o objetivo de manejar os fornecedores da pequena empresa de produtos químicos.
O utilisador terá acesso directo, através do browser, à base de dados dos fornecedores e aos seus dados de contacto.
Terá acesso a uma listagem de todos os fornecedores e poderá adicionar novos fornecedores, apagar ou actualizar a ficha dos mesmos.

* Modelo de arquitectura MVP com as views a comunicarem exclusivamente com os controllers.
* Os controladores delegam (através de uma relação de composição)  os pedidos CRUD à lógica de serviços.
* A camada de serviços permite a abstração, por parte dos controladores, relativamente às entidades.
* Os serviços apoiam-se na Interface de repositório (DAO) que é quem efectivamente comunica com a base de dados.




