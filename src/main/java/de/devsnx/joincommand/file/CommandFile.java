package de.devsnx.joincommand.file;

import de.devsnx.joincommand.utils.FileBase;
import org.bukkit.configuration.file.FileConfiguration;

public class CommandFile extends FileBase {

    public CommandFile(String path, String fileName) {
        super("", "commands");
        writedefault();
    }

    public void writedefault(){
        FileConfiguration cfg = getConfig();

        cfg.addDefault("JOINCOMMAND.COMMAND", "help");

        cfg.options().copyDefaults(true);
        saveConfig();
    }
}
