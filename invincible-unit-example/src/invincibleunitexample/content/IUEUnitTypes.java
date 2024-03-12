package invincibleunitexample.content;

import mindustry.content.Fx;
import mindustry.type.*;
import arc.graphics.Color;
import invincibleunitexample.bullet.StunLaser;
import invincibleunitexample.unit.*;

public class IUEUnitTypes {
    public static UnitType invincibleAircraft;

    public static void load() {
        invincibleAircraft = new InvincibleAircraft("invincible-aircraft") {{
            localizedName = "Invincible Aircraft";
            description = "A literally indestructible aircraft. \n\n\n[red]Loses its invincibility properties upon reloading a save.";
            
            buildSpeed = 50f;

            itemCapacity = 500;

            mineRange = 120f;
            mineTier = 99999;
            mineSpeed = 30f;
            mineWalls = true;
            mineHardnessScaling = false;

            health = 500000f;
            speed = 8f;
            accel = 0.2f;
            drag = 0.1f;
            armor = 0f;
            hitSize = 8f;
            rotateSpeed = 15f;
            
            range = maxRange = 99990f;
            
            weapons.addAll(new Weapon("paralyser"){{
                reload = 60f;
                rotate = true;
                rotateSpeed = 180f;
                ignoreRotation = true;
                shootCone = 0.0001f;
                inaccuracy = 0f;
                mirror = false;
                shootX = 0f;
                shootY = 2.5f;
                bullet = new StunLaser() {{
                    damage = 0f;
                    length = 99999f;
                    hitColor = new Color(0xffffffff);
                    color = new Color(0x00000000);
                    statusDuration = 600f;
                    shootEffect = Fx.none;
                    smokeEffect = Fx.none;
                }};
            }});
        }};
    }
}