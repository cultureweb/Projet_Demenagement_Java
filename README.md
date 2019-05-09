# Introduction à Java


Java est un langage de programmation généraliste orienté objet. les fichiers sources devront être compilés (sorte de traduction) en fichiers “classes” avant d’être exécutés. :



## Installation du JDK

● Nous allons utiliser JavaSE (Standard Edition), version 8 : `http://www.oracle.com/technetwork/java/index.html`  
1. Dans Rechercher, lancez une recherche et sélectionnez : Système (Panneau de configuration)
2. Cliquez sur le lien Paramètres système avancés.
3. Cliquez sur Variables d'environnement. 
4. Dans la section Variables système, recherchez la variable d'environnement PATH et sélectionnez-la. 
5. Cliquez sur parcourir et indiquez son chemin c/programmes/java/jdk1.8.0/bin puis ok

## IDE
Les références pour Java sont Eclipse (`http://www.eclipse.org/`), IntelliJ IDEA (`https://www.jetbrains.com/idea/`), Netbeans (`https://netbeans.org`)… 

## Créer un nouveau projet 

Créez l’arborescence de répertoires en utilisant Bash avec la seule commande :
mkdir -p nom_du_projet/src/main 

Créez dans le répertoire main les deux fichiers App.java et Demenagement.java qui contiennent respectivement :
```
package main;

public class App {
    public App() {
    }

    public static void main(String[] var0) {
        Demenagement var1 = new Demenagement();
        var1.setup();
    }
}
```
```
package main;

public class Demenagement {
 Votre code ici...
}
```
## Compiler le projet 
lancer la commande bash pour compiler depuis le fichier main
``` 
javac *.java
``` 
lancer la commande bash pour compiler depuis le fichier src
``` 
java main.App
``` 
