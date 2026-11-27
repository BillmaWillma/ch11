public class TestHero {
    public static void main(String[] args) {
        System.out.println(Hero.getHeroCount());
        Hero aria = new Hero("Aria", 20, 6);
        Hero jon = new Hero("Jon", 30, 9);
        System.out.println(Hero.getHeroCount());
        System.out.println(aria.attack(jon));
        System.out.println(jon);
        jon.attack(aria);
        jon.attack(aria);
        System.out.println(aria);
        aria.heal(50);
        System.out.println(aria);
        jon.attack(aria);
        jon.attack(aria);
        jon.attack(aria);
        System.out.println(aria);
        System.out.println(aria.attack(jon));
        aria.heal(10);
        System.out.println(aria.isDefeated());
        System.out.println(jon.attack(jon));
    }
}

