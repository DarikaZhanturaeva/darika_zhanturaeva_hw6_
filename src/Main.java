public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon =new Weapon(WeaponType.FIRE_ARMS, "Machine gun");
        Boss boss = new Boss("Mysterio", 700, 70 , bossWeapon);
        System.out.println("Boss name : " + boss.getName());
        System.out.println("Boss health : " + boss.getHealth());
        System.out.println("Boss damage : " + boss.getDamage());
        System.out.println("Boss weapon type : " + bossWeapon.getWeaponType());
        System.out.println("Boss weapon name : " + bossWeapon.getWeaponName());
        System.out.println(boss.printInfo());

        //скелеты
        Skeleton skeleton1 = new Skeleton("Skeleton1 " , 250 , 25 ,
                new Weapon( WeaponType.LASER,"laser "),15 );
        Skeleton skeleton2 = new Skeleton("Skeleton1",200, 20 ,
                new Weapon(WeaponType.LASER,"laser"),13);

        System.out.println("Skeleton 1 Info:" + skeleton1.printInfo());
        System.out.println("Skeleton 2 Info:" + skeleton2.printInfo());
    }
}