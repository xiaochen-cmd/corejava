package strategypattern.game;

/**
 * TODO
 *
 * @author jianglinChen
 * @date 2021/1/10
 * @since 1.0.0
 */
public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void userWeapon() {
        System.out.println("匕首刺杀");
    }
}
