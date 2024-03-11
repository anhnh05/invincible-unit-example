package invincibleunitexample.unit;

import arc.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.Fx;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;

import invincibleunitexample.*;

public class InvincibleAircraft extends UnitType {
    public InvincibleAircraft(String name) {
        super(name);
        description = "A literally indestructible aircraft.\nCan be removed via destroy() function.";

        outlines = true;
        drawCell = false;
        createWreck = false;
        createScorch = false;
        deathExplosionEffect = Fx.unitDespawn;
        
        envDisabled = 0;
        envEnabled = Env.any;
        useUnitCap = false;

        flying = true;

        buildSpeed = 50f;

        itemCapacity = 500;

        mineRange = 120f;
        mineTier = 99999;
        mineSpeed = 30f;
        mineWalls = true;
        mineHardnessScaling = false;

        health = 500000f;
        speed = 8f;
        accel = 0.6f;
        drag = 0.35f;
        armor = 0f;
        hitSize = 9f;
        rotateSpeed = 15f;

        constructor = InvincibleAircraftUnit::new;
    }    
}
