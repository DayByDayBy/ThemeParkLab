package people;

import attractions.Attraction;

import java.util.ArrayList;

public class Visitor {

    public double getHeight;
    private int age;
    private double height;
    private double money;
    private ArrayList visitedAttractions;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.visitedAttractions= new ArrayList<>();
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public void addVisited(Attraction attraction){
        this.visitedAttractions.add(attraction);
    }

    public ArrayList getVisitedAttractions(){
        return visitedAttractions;
    }
}
