# parallelism-task-1

Сумма `sin()` на одном периоде для 10^7 элементов через `IntStream.parallel()`.

## Сборка и запуск

```bash
mvn package -Pfloat    # или -Pdouble (по умолчанию)
java -jar target/parallelism-task-1-1.0.jar
```

## Вывод

```
double                                  float
------                                  -----
Size: 10000000                          Size: 10000000
Sum:  0.00000000006500316565673752      Sum: -0.00000000035436211810764770
```

Сумма близка к нулю (теоретически = 0).
