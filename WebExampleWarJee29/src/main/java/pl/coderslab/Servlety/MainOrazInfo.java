package pl.coderslab.Servlety;

/**
 *CAŁA INSTRUKCJA JEST W ROZDZIALE MAVEN PROJEKT

 //Trzeba uzupełnić POM -> więcej info w pom /slajd MavenProjekt nr6
 <!--DODANE ZE SLAJDU war-->
 <properties>
 <maven.compiler.source>11</maven.compiler.source>
 <maven.compiler.target>11</maven.compiler.target>
 </properties>

 <packaging>war</packaging>
 <!--DODANE ZE SLAJDU DEPENDENCIES-->
 <dependencies>
 <dependency>
 <groupId>javax.servlet</groupId>
 <artifactId>javax.servlet-api</artifactId>
 <version>4.0.1</version>
 <scope>provided</scope>
 </dependency>
 </dependencies>


 //prawy myszki na szary katalog main i new directory o nazwie webapp /slajd MavenProjekt nr5
 //pojawi się folder z niebieską kropką
 tworzymy index.html (PRZEZ X nie KS) i uzupełniamy body w webapp /slajd MavenProjekt nr10
 następnie wybieramy Add configuration na górze w InteliJ
 -> + add Tomcat LocalServer (nie EE!!!)
 -> i gdy Tomcat jest zainstalowany (wersja 9 nie 10! bo na 10 nie działają servlety) na komputerze wybieramy wersję
Jak pojawi się na dole po prawej FIX to klikamy i Z listy, która się pojawi, wybieramy opcję war exploded:
 Następnie w zakładce Server zaznaczamy w dwóch oknach:
 On 'Update' action
 On frame deactivation
 taką samą opcję:  Update classes and resources.

 Następnie w zakładce Deployment ustawiamy w polu:
 Application context
 wartość:  /   lub np. /web

 Dzięki temu po uruchomieniu nasza aplikacja będzie dostępna pod adresem:

 http://localhost:8080   lub /web

 Servlety tworzymy w niebieskim katalogu JAVA
 Jeśli podczas uruchomienia otrzymujesz poniższy błąd:
 Error running 'Unnamed': Cannot run program "/home/dell/Desktop/JAVA/apache-tomcat-9.0.6/bin/catalina.sh" (in directory "/home/dell/Desktop/JAVA/apache-tomcat-9.0.6/bin"): error=13, Permission denied
 przejdź w konsoli do katalogu bin rozpakowanego serwera Tomcat, a następnie wywołaj polecenie:
 chmod -R 777 catalina.sh
  */

public class MainOrazInfo {
    public static void main(String[] args) {


        System.out.println("Hello world!");

    }
}