

Teil 1: Mit Mr. Spock beim Testeinsatz (Ausgabe Dezember 2014)
==============================================================

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

Bei der Nutzung von IntelliJ können die Metadateien mit folgendem Kommando erzeugt werden:
./gradlew idea


Teil 2: Mr. Spock ruft Geb (Ausgabe Januar 2015)
===========================================================

Funktionale Testfälle auf der Basis von Spock und Geb für den im Java-Magazin veröffentlichten Artikel "Mr. Spock ruft Geb".

Die Testfälle verwenden die Homepage des Java-Magazin (http://javamagazin.de) als Testseite. 

Gradle
Mit Hilfe des Gradle-Wrappers werden ggfs. noch nicht vorhanden Bibliotheken/Abhängigkeiten nachgeladen 

Überblick über die verschiedenen Tasks
./gradlew tasks

Ausführung aller Tests mit den Browsern Chrome, Firefox und PhatomJS
./gradlew test

