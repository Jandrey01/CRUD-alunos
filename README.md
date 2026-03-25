# 🎓 Sistema de Cadastro de Alunos (Java)

Projeto simples em Java para cadastro e listagem de alunos via terminal, utilizando conceitos básicos de programação orientada a objetos (POO).

---

## 📌 Funcionalidades

* ✅ Cadastrar aluno
* ✅ Listar alunos cadastrados
* ✅ Validação de data de nascimento
* ✅ Menu interativo no terminal

---

## 🧠 Conceitos aplicados

* Programação Orientada a Objetos (POO)
* Classes e Objetos
* Encapsulamento
* Uso de `ArrayList`
* Entrada de dados com `Scanner`
* Manipulação de datas com `LocalDate` e `DateTimeFormatter`
* Estruturas de repetição (`while`)
* Estruturas de decisão (`switch`)

---

## 🏗️ Estrutura do Projeto

```
📁 src/
 ├── Main.java              // Menu principal e controle do sistema
 ├── Aluno.java            // Classe modelo (dados do aluno)
 ├── CadastrarAluno.java   // Responsável por criar alunos
```

---

## ▶️ Como executar

1. Clone o repositório:

```
git clone https://github.com/seu-usuario/seu-repositorio.git
```

2. Abra o projeto em uma IDE (ex: NetBeans, IntelliJ ou VS Code)

3. Execute a classe `Main.java`

---

## 💻 Exemplo de uso

```
1 - Cadastrar Aluno
2 - Listar Alunos
3 - Sair
```

### Cadastro:

* Nome
* Data de nascimento (dd/MM/yyyy)
* Email

---

## ⚠️ Observações

* A data deve ser informada no formato: `dd/MM/yyyy`
* O sistema roda em loop até o usuário escolher sair
* Os dados são armazenados apenas em memória (não persistem após fechar o programa)

---

## 🚀 Melhorias futuras

* [ ] Remover aluno
* [ ] Buscar aluno por nome
* [ ] Salvar dados em arquivo (JSON ou TXT)
* [ ] Interface gráfica (Swing ou JavaFX)
* [ ] Transformar em API REST

---

## 👨‍💻 Autor

Desenvolvido por **Jandrey Pinheiro**

---

## 📄 Licença

Este projeto é livre para estudos e melhorias.
