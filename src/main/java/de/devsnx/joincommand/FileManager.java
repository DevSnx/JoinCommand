package de.devsnx.joincommand;

import de.devsnx.joincommand.file.CommandFile;

public class FileManager {

    public CommandFile commandFile;

    public FileManager(){
        this.commandFile = new CommandFile("", "commands");
    }

    public CommandFile getConfigFile() {
        return commandFile;
    }
}
