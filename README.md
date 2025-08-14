# 🧮 Calculadora Simples em Java

Uma calculadora básica desenvolvida em Java que permite realizar operações matemáticas fundamentais através da linha de comando.

## 📋 Funcionalidades

- ✅ Adição (+)
- ✅ Subtração (-)
- ✅ Multiplicação (*)
- ✅ Divisão (/)
- ✅ Verificação de divisão por zero
- ✅ Interface interativa via terminal

## 🚀 Como usar

### Pré-requisitos

- Java Development Kit (JDK) 8 ou superior instalado
- Terminal ou prompt de comando

### Executando a calculadora

1. **Compile o programa:**
```bash
javac Main.java
```

2. **Execute o programa:**
```bash
java Main
```

3. **Siga as instruções na tela:**
   - Digite o primeiro número
   - Escolha a operação (+, -, *, /)
   - Digite o segundo número
   - Veja o resultado!

## 💻 Exemplo de uso

```
=================BEM-VINDO À CALCULADORA=================
=====================================================

Digite o primeiro número: 10
========================================
Digite a operação (+,-,*,/): +
========================================
Digite o segundo número: 5
========================================
Resultado: 15.0
```

## 🔧 Estrutura do código

O programa utiliza:
- `Scanner` para entrada de dados do usuário
- `switch-case` para seleção de operações
- Tratamento básico para divisão por zero
- Tipos `double` para suporte a números decimais

## ⚠️ Tratamento de erros

- **Divisão por zero**: O programa detecta e impede divisões por zero, exibindo a mensagem "Impossível divisão por 0. Reinicie o programa!"
- **Operação inválida**: Para operações não reconhecidas, exibe "Sinal inexistente. Reinicie o programa!"

## 🛠️ Possíveis melhorias

- [ ] Loop para múltiplas operações sem reiniciar
- [ ] Validação de entrada para números
- [ ] Histórico de cálculos
- [ ] Mais operações (potenciação, raiz quadrada, etc.)
- [ ] Interface gráfica

## 📝 Licença

Este projeto é de uso livre para fins educacionais.

---

**Desenvolvido como projeto de estudo em Java** 🚀
