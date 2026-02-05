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

Type: double
N: 10000000
Sum: 0.00000000006500317

Type: float
N: 10000000
Sum: -0.00000000035436212


> Значение суммы близко к нулю;
