package org.javapractice.october1.interfaces.beer;

public class Main {
    public static void main(String[] args) {
        var beear = new Beer(0.1f);
        while (!beear.isReadyToGoHome()){
            beear.drink();
        }
        var beer = new AlcoholicBeer(7, 0.4f);
        while (!beer.isReadyToGoHome()){
            beer.drink();
        }

        beer.pohmelie();

    }
}
