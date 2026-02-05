## README

Программа считает сумму значений `sin()` на **одном периоде** для `N = 10^7` элементов (параллельно через `IntStream.parallel()`).

### Выбор типа (float / double)

По умолчанию используется **double**.
Чтобы включить **float**, передайте системное свойство `arrayType` при запуске:

* **double (по умолчанию)**

  ```bash
  mvn package
  cd target
  java -jar parallelism-1.0-SNAPSHOT.jar 
  ```

* **float**

  ```bash
  java -DarrayType=float -jar parallelism-1.0-SNAPSHOT.jar 
  ```

> Значение суммы близко к нулю;
