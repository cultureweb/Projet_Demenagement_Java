package main;

public class Demenagement {

    int[] packageCase = new int[15];
    int[] packageCaseMaxi = {3,4,2,1,3,2,5,2,2,1,1,3,3,3,4};
    int maxiPackages = 34;
    int buildingA = 34;
    int buildingB = 0;
    int packageInTruck = 0;
    int packages = 9;


    //Fonction Remplir le camion
    void fillTruck() {
        while (buildingA > 0 && packageInTruck < packages){
            packageInTruck++;
            buildingA--;
        }
        System.out.println("je déplace le camion avec mes " + packageInTruck + " cartons");
    }
    //Fonction Vider le camion
    void emptyTruck() {

        while (packageInTruck > 0){

            packageInTruck--;
            buildingB++;

            // // trie les colis par bureaux

        }
    }

    //Fonction Trier par bureaux SITUATION 2
    void sortByBuilding2() {
        packageCase = new int[15];
        maxiPackages = 34;
        System.out.println("affiche moi le tableau ci dessous");
        System.out.println(packageCase);
        //int packageCaseMaxi[] = {3,4,2,1,3,2,5,2,2,1,1,3,3,3,4};
        //int maxiPackages = 34;
        int i = 0;
        while (maxiPackages > 0) {
            packageCase[i]++;
            i++;
            maxiPackages--;
            if ( i == 15) {
                i = 0;
            }
            while (packageCase[i] == packageCaseMaxi[i]) {
                i++;
            } // fin de la boucle while
        } // fin de la boucle while

        for  (i = 0; i < packageCase.length ;i++) {

            System.out.println("je pose  " + packageCase[i] + " carton dans bureau"  + i);
        }
    } //Fin SITUATION 2
    void setup(){

        while (buildingA > 0) {
            fillTruck();
            emptyTruck();// je vide le camion
        }
        System.out.println("Mon entreprise A a " + buildingA + " cartons");
        System.out.println("Mon entreprise B a " + buildingB  + " cartons");


        System.out.println("je suis dans la situation 2");




//Fin de setup
    }
}
