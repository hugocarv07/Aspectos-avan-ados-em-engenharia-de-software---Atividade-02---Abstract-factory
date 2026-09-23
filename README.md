# Abstract Factory — Documentos de Atendimento Hospitalar

Exemplo do padrão de projeto **Abstract Factory**, seguindo o mesmo modelo
apresentado em aula (fábrica abstrata criando uma *família* de produtos
relacionados + fábricas concretas por variante + cliente que só conhece as
interfaces).

## Tema

Sistema de emissão de documentos de um hospital. Cada tipo de atendimento
(**Urgência** ou **Eletivo**) precisa gerar dois documentos relacionados: um
`Receituario` e um `LaudoMedico`. A `FabricaAtendimento` garante que, para um
mesmo atendimento, os dois documentos sempre venham da mesma família — nunca
um receituário de urgência com um laudo eletivo, por exemplo.

## Estrutura

```
src/main/java/padroesprojeto/abstractfactory/hospital/
├── Receituario.java              // Produto A (interface)
├── LaudoMedico.java              // Produto B (interface)
├── ReceituarioUrgencia.java      // Produto A concreto - família Urgência
├── ReceituarioEletivo.java       // Produto A concreto - família Eletiva
├── LaudoMedicoUrgencia.java      // Produto B concreto - família Urgência
├── LaudoMedicoEletivo.java       // Produto B concreto - família Eletiva
├── FabricaAtendimento.java       // Abstract Factory (interface)
├── FabricaUrgencia.java          // Fábrica concreta - família Urgência
├── FabricaEletiva.java           // Fábrica concreta - família Eletiva
└── Paciente.java                 // Cliente (recebe a fábrica no construtor)

src/test/java/padroesprojeto/abstractfactory/hospital/
├── PacienteUrgenciaTest.java
└── PacienteEletivaTest.java

diagrama-uml.png
pom.xml
```

## Como funciona

```java
Paciente paciente = new Paciente(new FabricaUrgencia());
paciente.emitirReceituario();  // "Receituário de atendimento de urgência"
paciente.emitirLaudoMedico();  // "Laudo médico de urgência"

Paciente outroPaciente = new Paciente(new FabricaEletiva());
outroPaciente.emitirReceituario(); // "Receituário de atendimento eletivo"
outroPaciente.emitirLaudoMedico(); // "Laudo médico de atendimento eletivo"
```

O `Paciente` nunca instancia `ReceituarioUrgencia` ou `LaudoMedicoEletivo`
diretamente — ele só conhece `Receituario`, `LaudoMedico` e
`FabricaAtendimento`. Trocar de família de atendimento é só trocar qual
fábrica concreta é passada no construtor.

## Como rodar no IntelliJ

1. Abrir a pasta como projeto Maven.
2. Aguardar o download das dependências (JUnit 5).
3. Rodar as classes de teste (botão direito → Run, ou `mvn test`).

## Diagrama UML

Ver `diagrama-uml.png`: interfaces `Receituario`, `LaudoMedico` e
`FabricaAtendimento` no topo; produtos e fábricas concretas realizando essas
interfaces; `Paciente` como cliente, dependente apenas da fábrica abstrata.
