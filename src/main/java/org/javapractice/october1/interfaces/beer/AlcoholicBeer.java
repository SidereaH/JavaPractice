package org.javapractice.october1.interfaces.beer;

public class AlcoholicBeer extends Beer {

    public AlcoholicBeer(int degree, float volumeOfCouple) {
        super(volumeOfCouple);
        super.setDegree(degree);
    }

    public void pohmelie(){
        System.out.println("Alcoholic beer pohmelie... drink bbeer");
        while(super.getHealth() != 200){
            pohmelayemsa();
        }
    }
    private void pohmelayemsa(){
        System.out.printf("pohmlle joski hilimsya pivom curhealth = %s\n", getHealth());
        setHealth(getHealth()+10);
    }
}
