abstract class GameCharacter {
    String name;
    int hp;

    public GameCharacter(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public boolean isAlive(){
        return hp > 0;
    }

    public void takeDamage(int damage){
        hp -= damage;
        if(hp<0) hp = 0;
    }

    public String getStatus(){
        return name + ":" + hp + "HP";
    }
    
    public abstract int basicAttack(GameCharacter opponent);
    public abstract int specialMove(GameCharacter opponent);
    public abstract int secretPower(GameCharacter opponent);

}
