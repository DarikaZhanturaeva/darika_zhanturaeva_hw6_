public class Boss extends GameEntity{
    public Weapon weapon;
    public Boss (String name, int health , int damage , Weapon weapon){
        super(name, health, damage);
        this.weapon=weapon;
    }

    @Override
    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo(){
        return " Name: " + getName() + " Health: " + getHealth()+
                " Damage: " + getDamage()+
                " Weapon Type: " + weapon.getWeaponType() +
                " Weapon Name: " + weapon.getWeaponName();
    }
}
