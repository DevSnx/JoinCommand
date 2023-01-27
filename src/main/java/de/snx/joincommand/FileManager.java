package de.snx.joincommand;

import de.snx.joincommand.file.CommandFile;

public class FileManager {

    public CommandFile commandFile;

    public FileManager(){
        this.commandFile = new CommandFile("", "commands");
    }

    public CommandFile getConfigFile() {
        return commandFile;
    }
}
