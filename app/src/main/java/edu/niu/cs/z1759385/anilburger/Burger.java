package edu.niu.cs.z1759385.anilburger;

/**
 * Created by anilm on 3/9/2016.
 */
public class Burger {
    static final int VEGPATTIE = 100,BEEFPATTIE=120,BACON = 130,CHEESE = 200,NOCHEESE = 90;
    private int patty=0,bacon=0,cheese=0,sauce=0;
    private int totalCalories;
    public  Burger()
    {
        patty = VEGPATTIE;
        bacon = 0;
        cheese = 0;
        sauce =0;


    }
    void setPatty(int newPatty)
    {
        patty = newPatty;

    }
    void setBacon(int newBacon)
    {
        bacon = newBacon;
    }
    void setSauce(int newSauce)
    {
        sauce = newSauce;
    }
    void setCheese(int newCheese)
    {
        cheese = newCheese;
    }
    int getBacon()
    {
        return bacon;
    }
    int getCheese()
    {
        return cheese;

    }
    int getPatty()
    {
        return patty;
    }
    int getSauce()
    {
        return  sauce;
    }
    int getTotalCalories()
    {
        return patty+cheese+bacon+sauce;
    }


}
