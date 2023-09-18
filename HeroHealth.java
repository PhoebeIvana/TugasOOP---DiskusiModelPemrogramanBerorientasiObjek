public class HeroHealth extends Hero {
    protected int flyingPower;
    protected double manaPower;

    public void setSpecialData(String heroName, int attackPower, int defencePower, int difficulty, int flyingPower, double manaPower){
        this.heroName = heroName;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
        this.difficulty = difficulty;
        this.flyingPower = flyingPower;
        this.manaPower = manaPower;
    }

    public void getData(){
        System.out.println("============================== Data of Health Hero ==============================");
        System.out.println("Name          : " + this.heroName);
        System.out.println("Attack Power  : "+this.attackPower);
        System.out.println("Defence Power : "+this.defencePower);
        System.out.println("Difficulty    : "+this.difficulty);
        System.out.println("Flying Power  : "+this.flyingPower);
        System.out.println("Mana Power    : "+this.manaPower);
    }

}
