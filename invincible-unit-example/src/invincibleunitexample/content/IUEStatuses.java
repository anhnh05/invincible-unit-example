package invincibleunitexample.content;

import mindustry.type.StatusEffect;

public class IUEStatuses {
    public static StatusEffect paralyzed;

    public static void load() {
        paralyzed = new StatusEffect("paralyzed") {{
            localizedName = "Stunned";
            disarm = true;
            speedMultiplier = 0f;
            show = true;
        }};
    }
}
