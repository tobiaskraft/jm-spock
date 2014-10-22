

Teil 1: Mit Mr. Spock beim Testeinsatz (Ausgabe Januar 2015)
===========================================================

Beispielapplikation für den im Java-Magazin veröffentlichten Artikel "Mit Mr. Spock beim Testeinsatz". 

Die Applikation auf Basis von Spring Boot enthält Unit- und Integrations-Tests auf der Basis des Testframeworks Spock. 

Vorraussetzungen
Als Grundvoraussetzung wird das JDK 8 für die Ausführung der Applikation benötigt. 

Gradle
Mit Hilfe des Gradle-Wrappers werden ggfs. noch nicht vorhanden Bibliotheken/Abhängigkeiten nachgeladen 

Überblick über die verschiedenen Tasks
./gradlew tasks

Ausführung aller Tests
./gradlew test

Test reports öffnen build/reports/tests/index.html

Nutzung von IntelliJ
# Erzeugen der Metadateien für IntelliJ
./gradlew idea


Teil 2: TODO
============
