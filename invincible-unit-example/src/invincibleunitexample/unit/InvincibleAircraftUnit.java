package invincibleunitexample.unit;

import arc.util.*;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.entities.*;

public class InvincibleAircraftUnit extends UnitEntity {
    protected boolean vulnerable = false;
    protected float lastX, lastY;

    @Override
    public void update() {
        if (!vulnerable) {
            if (health < maxHealth) {
                health = maxHealth;
            };
            dead = false;
            if (Float.isNaN(x) || Float.isInfinite(x)) {
                x = lastX;
            }
            else {
                lastX = x;
            };
            if (Float.isNaN(y) || Float.isInfinite(y)) {
                y = lastY;
            }
            else {
                lastY = y;
            }
        }
        super.update();
    }

    @Override
    public void setType(UnitType type) {
        super.setType(type);
    }

    @Override
    public void kill() {
        if (!vulnerable) return;
        super.kill();
    }

    @Override
    public void destroy() {
        disableInvincibility();
        super.destroy();
    }

    @Override
    public void remove() {
        if (!vulnerable) return;
        super.remove();
    }

    public void disableInvincibility() {
        vulnerable = true;
    }
}
