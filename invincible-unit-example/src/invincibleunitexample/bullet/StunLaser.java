//does not work yet

package invincibleunitexample.bullet;

import invincibleunitexample.content.IUEStatuses;
import mindustry.content.StatusEffects;
import mindustry.entities.bullet.SapBulletType;

public class StunLaser extends SapBulletType {
    public StunLaser() {
        sapStrength = 0f;
        status = IUEStatuses.paralyzed;
    }
}
