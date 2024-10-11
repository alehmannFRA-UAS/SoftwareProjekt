## Übung 2: Klassen und Objekte

1. Erstellen Sie die Klasse `Student` mit den Attributen `studentId`, `firstName`, `lastName`, `semester` und `matriculationNumber`. Erzeugen Sie auch alle Getter-Methoden.

2. Erstellen Sie mindestens zwei verschiedene Konstruktoren, einen Default-Konstruktor ohne Parameter und einen Konstruktor mit allen Parametern. Erstellen Sie zusätzlich alle Setter-Methoden inkl. Überprüfungen. Matrikelnummern müssen z.B. aus 6 Ziffern bestehen und können nicht negativ sein. Überlegen Sie sich ähnliche Überprüfungen für die anderen Attribute.

3. Erstellen Sie eine Liste von Studenten in einer weiteren Klasse. Neue Studenten sollen zur Studentenliste hinzugefügt werden können und anhand einer `studentId` wieder entfernt werden können.

4. Implementieren Sie einen Zähler für die `studentId`, so dass beim Hinzufügen einer neuen Instanz von `Student` deren Id automatisch um einen Schritt erhöht wird.

6. Implementieren Sie mit Hilfe der Liste die Möglichkeit nach einem Studenten anhand seines Namens `lastName` zu suchen und geben Sie die erste Übereinstimmung zurück.

7. Schreiben Sie ein Java-Programm, das ein Studentenverwaltungssystem simuliert, mit dem Details von Studenten angezeigt werden können.
Es könnte jedoch Fälle geben, in denen das Studentenobjekt `null` ist. Stellen Sie sicher, dass das Programm diese Null-Referenz korrekt behandelt und eine entsprechende Meldung ausgibt, anstatt abzustürzen. Ihre Lösung sollte:
    - prüfen, ob das Student-Objekt `null` ist.
    - wenn das Student-Objekt nicht `null` ist, geben Sie die Studentendetails wie üblich aus.
    - wenn das Student-Objekt `null` ist, geben Sie eine Meldung wie „Keine Studentendaten verfügbar“ aus.
