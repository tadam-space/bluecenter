package com.javaminecraft;

import java.util.logging.Logger;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

  public static final Logger LOG = Logger.getLogger("Minecraft");
@Override
public boolean onCommand(CommandSender cmdSender, Command cmd, String chat, String[] arguments) {
  if (chat.equalsIgnoreCase("blc cmd")) {
     if (cmdSender instanceof Player) {
            runCmd(cmdSender);
            return true;
     }
  }
  return false;
}
// setting the prefix
String prefix = "[BLC] ";
// running command
public void runCmd(CommandSender cmdSender) {
     Player me = (Player) cmdSender;
     Location place = me.getLocation();
     World world = me.getWorld();
     
     //  here write the command
     
     // now send a chat message what the plugin does
     me.sendMessage(prefix + "Your text here");
     LOG.warn("[BLCspy] " + me + " your action");
   }
}
