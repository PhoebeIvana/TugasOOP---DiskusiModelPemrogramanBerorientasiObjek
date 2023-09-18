public class Hero {
    protected String heroName;
    protected int attackPower;
    protected int defencePower;
    protected int difficulty;

    public void setData(String heroName, int attackPower, int defencePower, int difficulty){
        this.heroName = heroName;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
        this.difficulty = difficulty;
    }
    public void getData(){
        System.out.println("================================= Data of Hero =================================");
        System.out.println("Name          : "+ this.heroName);
        System.out.println("Attack Power  : "+this.attackPower);
        System.out.println("Defence Power : "+this.defencePower);
        System.out.println("Difficulty    : "+this.difficulty);
    }

    public static void main(String[] args){
        System.out.println("=========================== Welcome to Mobile Legend ===========================");
        System.out.println("~ Choose a Hero ~");
        System.out.println("Data needed (Ordinary Hero) : Name, Attack Power, Defence Power, and Difficulty");
        System.out.println("\n~ Answer ~");
        Hero hero1 = new Hero();
        hero1.setData("Layla", 20, 10, 5);
        hero1.getData();
        HeroHealth hero2 = new HeroHealth();
        hero2.setSpecialData("Miya",50,30,21,33,5.5);
        hero2.getData();


    }
}
