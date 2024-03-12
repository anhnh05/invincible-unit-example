package invincibleunitexample;

import mindustry.mod.*;

import invincibleunitexample.content.*;

public class InvincibleUnitExample extends Mod{
    public InvincibleUnitExample(){}

    @Override
    public void loadContent(){
        IUEStatuses.load();
        IUEUnitTypes.load();
    }
}

