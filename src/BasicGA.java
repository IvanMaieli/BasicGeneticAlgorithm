package src;

public class BasicGA {
    public static void main(String[] args) {
        GeneticAlgorithm ga = new GeneticAlgorithm(100, .01, .95, 0);
        Population population = ga.initPopulation(64);
    }

    public double calcFitness(Individual individual) {
        int correctGenes = 0;
        for(int currentGene = 0; currentGene < individual.getChromosomeLenght(); currentGene++) {
            if(individual.getGene(currentGene) == 1) {
                correctGenes++;
            }
        }
        double fitness = (double) correctGenes / individual.getChromosomeLenght();
        individual.setFitness(fitness);
        return fitness;
    }

    public void evalPopulation(Population population) {
        double populationFitness = 0;
        for(Individual individual : population.getPopulation()) {
            populationFitness += calcFitness(individual);
        }
        population.setPopulationFitness(populationFitness);
    }
}
