package invincibleunitexample.unit;

import arc.util.*;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.entities.*;

public class InvincibleAircraftUnit extends UnitEntity {
    private boolean vulnerable = false;
    private float realX, realY;

    @Override
    public void update() {
        if (!vulnerable) {
            health = maxHealth;
            elevation = 1f;
            dead = false;
            if (Float.isNaN(x) || Float.isInfinite(x)) {
                x = realX;
            }
            else {
                realX = x;
            };
            if (Float.isNaN(y) || Float.isInfinite(y)) {
                y = realY;
            }
            else {
                realY = y;
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
        return;
    }

    @Override
    public void destroy() {
        if (!vulnerable) return;
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
