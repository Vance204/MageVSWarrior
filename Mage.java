class Mage extends GameCharacter {
    public Mage(String name, int hp) {
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
        int damage = 25;
        opponent.takeDamage(damage);
        return damage;
    }

    @Override
    public int secretPower(GameCharacter opponent) {
        int damage = 35;
        opponent.takeDamage(damage);
        return damage;
    }
}
