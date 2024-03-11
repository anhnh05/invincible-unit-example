package invincibleunitexample.content;

import mindustry.ai.*;
import mindustry.content.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.meta.*;

import invincibleunitexample.unit.*;

public class IUEUnitTypes {
    public static UnitType invincibleAircraft;

    public static load() {
        invincibleAircraft = new InvincibleAircraft("invincible-aircraft");
    }
}