package cn.nukkit.server.level.sound;

import cn.nukkit.server.math.Vector3;

/**
 * Created by Pub4Game on 28.06.2016.
 */
public class ClickFailSound extends LevelEventSound {
    public ClickFailSound(Vector3 pos) {
        this(pos, 0);
    }

    public ClickFailSound(Vector3 pos, float pitch) {
        super(pos, LevelEventPacket.EVENT_SOUND_CLICK_FAIL, pitch);
    }
}