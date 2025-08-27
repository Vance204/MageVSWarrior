class Warrior extends GameCharacter {
    public Warrior(String name, int hp) {
        super(name, 100);
    }

    @Override
    public int basicAttack(GameCharacter opponent) {
        int damage = 10;
        opponent.takeDamage(damage);
        return damage;
    }

    @Override
    public int specialMove(GameCharacter opponent) {
        int damage = 20;
        opponent.takeDamage(damage);
        return damage;
    }

    @Override
    public int secretPower(GameCharacter opponent) {
        int damage = 30;
        opponent.takeDamage(damage);
        return damage;
    }
}
