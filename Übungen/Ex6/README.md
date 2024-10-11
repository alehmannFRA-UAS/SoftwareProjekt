## Übung 6: Generics

1. Schreiben Sie eine generische Methode `countOddIntegers()`, um die Anzahl der ungeraden ganzen Zahlen in einer Integer-Liste 1 - 999999 zu zählen (1,2,3,4,5...,999999). Geben Sie in der Konsole die Anzahl der ungeraden gezählten Integer aus.

2. Schreiben Sie eine generische Klasse namens `MinMax`, die den Zugriff auf den Minimal- und Maximalwert ermöglicht, der einer Sammlung hinzugefügt wurde. Ihre Klasse sollte die folgenden Methoden enthalten:

  - `push` versucht, ein einzelnes Element in deine Sammlung zu schieben (nimmt einen Eingabeparameter)
  - `reset` entfernt alle Elemente aus Ihrer Sammlung
  - `min` gibt den aktuellen Min-Wert zurück oder löst eine `NoSuchElementException` aus
  - `max` liefert den aktuellen Max-Wert oder löst eine `NoSuchElementException` aus

Ein beispielhafter Test der Klasse `MinMax` könnte wie folgt lauten:

```java
MinMax<String> myMinMax = new MinMax<String>();
myMinMax.push("A");
myMinMax.push("B");
myMinMax.push("Z");
myMinMax.push("C");
System.out.println(myMinMax.min());
System.out.println(myMinMax.max());
A
Z