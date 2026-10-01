# Questão 1

## Resposta

É uma boa prática usar **getters e setters** porque eles permitem controlar o acesso aos atributos de uma classe. Assim, os atributos podem continuar privados e a classe pode definir regras para leitura e alteração dos seus valores.

Por exemplo, um `setter` para o preço de um produto pode impedir que seja atribuído um valor negativo:

```java
public void setPreco(double preco) {
    if (preco >= 0) {
        this.preco = preco;
    }
}
```

Dessa forma, o objeto não poderá receber um preço inválido através desse método, ajudando a manter a integridade dos seus dados.
