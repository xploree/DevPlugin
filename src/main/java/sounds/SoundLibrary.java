package sounds;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class SoundLibrary {
    public void PlaySoundLocation(Player playerObject, Sound soundToPlay)
    {
        playerObject.playSound(playerObject.getLocation(), soundToPlay, 5,5);
    }
    public void PingAll()
    {
        for(Player p : Bukkit.getOnlinePlayers())
        {
            p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 5, 5);
        }
    }
}
