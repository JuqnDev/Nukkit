package com.nukkitx.server.entity.monster;

import com.flowpowered.math.vector.Vector3f;
import com.nukkitx.api.entity.monster.Husk;
import com.nukkitx.server.NukkitServer;
import com.nukkitx.server.entity.EntityType;
import com.nukkitx.server.entity.LivingEntity;
import com.nukkitx.server.level.NukkitLevel;

public class HuskEntity extends LivingEntity implements Husk {

    public HuskEntity(Vector3f position, NukkitLevel level, NukkitServer server) {
        super(EntityType.HUSK, position, level, server, 20);
    }
}
