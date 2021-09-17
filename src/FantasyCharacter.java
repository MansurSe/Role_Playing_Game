import java.util.Random;

public abstract class FantasyCharacter implements Fighter{
    private String name;
    private int healthPoints;
    private int strength;
    private int agility;
    private int gold;
    private int xp;


    public FantasyCharacter(String name, int healthPoints, int strength, int agility, int gold, int xp) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.strength = strength;
        this.agility = agility;
        this.gold = gold;
        this.xp = xp;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getGold() {
        return gold;
    }

    public int getXp() {
        return xp;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    private int getRandomValue(){
        return (int)(Math.random()*100);
    }

    //Метод для ведения боя
    @Override
    public int attack(){
        if (agility * 3 > getRandomValue()) return strength;
        else return 0;
    }
    //Переопределяем вывод в консоль, чтобы выводилось имя и очки здоровья
    @Override
    public String toString(){
        return String.format("%s здоровье:%d", name, healthPoints);
    }




}


