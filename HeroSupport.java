public class HeroSupport extends Hero {
    protected double supportPower;
    protected double crowdControl;

    public void setSpecialData(String heroName, int attackPower, int defencePower, int difficulty, double supportPower, double crowdControl){
        this.heroName = heroName;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
        this.difficulty = difficulty;
        this.supportPower = supportPower;
        this.crowdControl = crowdControl;
    }

    public void getData(){
        System.out.println("============================= Data of Support Hero =============================");
        System.out.println("Name           : " + this.heroName);
        System.out.println("Attack Power   : "+this.attackPower);
        System.out.println("Defence Power  : "+this.defencePower);
        System.out.println("Difficulty     : "+this.difficulty);
        System.out.println("Support Power  : "+this.supportPower);
        System.out.println("Crowd Control  : "+this.crowdControl);
    }

}
