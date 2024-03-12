package invincibleunitexample.unit;

import arc.*;
import arc.audio.Sound;
import arc.graphics.Color;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.Fx;
import mindustry.content.StatusEffects;
import mindustry.entities.*;
import mindustry.entities.abilities.RegenAbility;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;

import invincibleunitexample.*;
import invincibleunitexample.bullet.StunLaser;

public class InvincibleAircraft extends UnitType {
    public InvincibleAircraft(String name) {
        super(name);
        outlines = true;
        drawCell = false;
        createWreck = false;
        createScorch = false;
        deathExplosionEffect = Fx.spawn;
        fallEffect = Fx.none;
        fallEngineEffect = Fx.none;
        deathSound = Sounds.none;
        healFlash = false;
        
        envDisabled = 0;
        envEnabled = Env.any;
        useUnitCap = false;

        flying = true;

        constructor = InvincibleAircraftUnit::new;
    }    

    public void init(){
        super.init();
        constructor = InvincibleAircraftUnit::new;

        immunities.addAll(Vars.content.statusEffects());
        immunities.remove(StatusEffects.boss);
        immunities.remove(StatusEffects.overclock);
        immunities.remove(StatusEffects.overdrive);
        immunities.remove(StatusEffects.shielded);
        immunities.remove(StatusEffects.fast);
        immunities.remove(StatusEffects.none);
        immunities.remove(StatusEffects.invincible);

        abilities.add(new RegenAbility() {{
            percentAmount = 100f;
        }});        
    }
}
