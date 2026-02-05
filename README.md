## README

Программа считает сумму значений `sin()` на **одном периоде** для `N = 10^7` элементов (параллельно через `IntStream.parallel()`).

### Выбор типа (float / double)

По умолчанию используется **double**.
Чтобы включить **float**, передайте системное свойство `arrayType` при запуске:

* **double (по умолчанию)**

  ```bash
  java ru.mcashesha.Main
  ```

* **float**

  ```bash
  java -DarrayType=float ru.mcashesha.Main
  ```

> Значение суммы близко к нулю;
