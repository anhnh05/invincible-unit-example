package invincibleunitexample.content;

import mindustry.type.*;

import invincibleunitexample.unit.*;

public class IUEUnitTypes {
    public static UnitType invincibleAircraft;

    public static void load() {
        invincibleAircraft = new InvincibleAircraft("invincible-aircraft");
    }
}