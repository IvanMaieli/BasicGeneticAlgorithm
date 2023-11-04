package src;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Population {
    private Individual[] population;
    private double populationFitness = -1;


    public Population(int populationSize) {
        this.population = new Individual[populationSize];
    }

    public Population(int populationSize, int chromosomeLenght) {
        this.population = new Individual[populationSize];
        for(int individualCount = 0; individualCount < populationSize; individualCount++) {
            Individual individual = new Individual(chromosomeLenght);
            this.population[individualCount] = individual;
        }
    }

    public Individual[] getPopulation() {
        return this.population;
    }

    public Individual getFittest(int offset) {
        Arrays.sort(this.population, new Comparator<Individual>() {
            @Override
            public int compare(Individual t0, Individual t1) {
                if(t0.getFitness() < t1.getFitness()) {
                    return 1;
                } else if(t0.getFitness() > t1.getFitness()) {
                    return -1;
                }
                return 0;
            }
        });
        return this.population[offset];
    }

    public int size() {
        return this.population.length;
    }

    public double getPopulationFitness() {
        return populationFitness;
    }

    public void setPopulationFitness(double populationFitness) {
        this.populationFitness = populationFitness;
    }

    public Individual getIndividual(int offset) {
        return population[offset];
    }

    public Individual setIndividual(int offset, Individual individual) {
        return population[offset] = individual;
    }

    public void shuffle() {
        Random rnd = new Random();
        for (int i = population.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            Individual a = population[index];
            population[index] = population[i];
            population[i] = a;
        }
    }

}
