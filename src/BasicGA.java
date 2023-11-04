package src;

public class BasicGA {
    public static void main(String[] args) {
        //Instanziare l'algoritmo genetico
        GeneticAlgorithm ga = new GeneticAlgorithm(100, .01, .95, 0);
        Population population = ga.initPopulation(46);
    }

}
