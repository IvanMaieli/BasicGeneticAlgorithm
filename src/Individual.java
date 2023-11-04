package src;

public class Individual {
    private int[] chromosome;
    private double fitness = -1;


    public Individual(int[] chromosome) {
        //Creare il cromosoma dell'individuo
        this.chromosome = chromosome;
    }

    public Individual(int chromosomeLenght) {
        this.chromosome = new int[chromosomeLenght];
        for(int gene = 0; gene < chromosomeLenght; gene++) {
            if(0.5 < Math.random()) {
                this.setGene(gene, 1);
            } else {
                this.setGene(gene, 0);
            }
        }
    }

    public int getChromosomeLenght() {
        return chromosome.length;
    }

    public int[] getChromosome() {
        return chromosome;
    }

    public double getFitness() {
        return fitness;
    }

    public int getGene(int offset) {
        return this.chromosome[offset];
    }

    public void setFitness(double fitness) {
        this.fitness = fitness;
    }

    public void setGene(int offset, int gene) {
        this.chromosome[offset] = gene;
    }

    public String toString() {
        String output = "";
        for (int gene = 0; gene < this.chromosome.length; gene++) {
            output += this.chromosome[gene];
        }
        return output;
    }
}
