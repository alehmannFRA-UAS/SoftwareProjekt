## Übung 10: Design Pattern

1. Interface und Singleton
- Erstellen Sie ein Interface `Task`. Das Interface soll die Methoden `String getName()`, `void execute()` und `boolean isRunning()` definieren.
- Erstellen Sie dann die Klasse `TaskImpl`, die das Interface `Task` implementiert. Der Konstruktor setzt das Attribut `name` durch einen Eingabeparameter und das Attribut `running` auf `false`.
 Die Methode `execute` setzt das Attribute `running` auf `true`.
- Erstellen Sie dann eine Klasse `TaskManager` als Singleton.
Diese Klasse soll zusätzlich eine `ArrayList` für Tasks beinhalten. Mittels einer Methode soll ein Task gestartet werden können. Es sollen mit Methoden einzelne Tasks der Liste hinzugefügt und entfernt werden können. Eine weitere Methode listet alle Tasks auf und gibt neben Namen auch den Zustand aus.
- Schreiben Sie ein Hauptprogramm zum Testen des TaskManagers.

2. Immutable
-  Erstellen Sie eine Immutable-Klasse `Block`, die die Attribute `String hash`, `long timestamp` und `String data` besitzt. Der Wert `hash` soll initial beim Aufruf des Konstruktors erstellt werden. Nutzen Sie hierfür einen beliebigen Algoritmus zur Berechnung. Erstellen Sie eine Klasse `Blockchain`, die eine verkettete Liste von Blöcken halten kann.

3. Builder
- Erstellen Sie eine Klasse `Pizza` mit einem Builder, um beliebig viele Beläge `toppings` hinzuzufügen.
- Schreiben Sie ein Programm um dies zu testen.