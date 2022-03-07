package co.edu.unbosque.model;

import java.util.Random;


public class Dados {

    Random random;


    public Dados() {
        random = new Random();

    }

    public int tirarDado() {
        int n = random.nextInt(6)+1;
        return n;
    }


}
