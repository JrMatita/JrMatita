import eu.mattia.commands.Vai;
import eu.mattia.commands.inizia;
import eu.mattia.commands.Non fermarti;
import eu.mattia.events.PlayerInteractList;
import eu.mattia.events.PlayerMoveEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Matita12 extends JavaPlugin {

@Override
    public void onEnable() {
    System.out.println("Mattia si è attivato!");

    
    getServer().getPluginManager().registerEvents(new PlayerMoveEvent(), this);
    getServer().getPluginManager().registerEvents(new PlayerInteractEvent(), this);

    
    this.getCommand("Inizia").setExecutor(new inizia());
    this.getCommand("Vai").setExecutor(new Vai());
    this.getCommand("Non Fermarti").setExecutor(new Non fermarti());
}

@Override
    public void onDisable() {
    System.out.println("MareMc Plugin is disable");
}


}

