package com.saki.date4u.interfaces.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent /*this annotation is responsable that this shell command can be used*/
public class FsCommands {

    @ShellMethod( "Display required free disk space")
    public long minimumFreeDiskSpace() {
        return 1_000_000;
    }
}
