package com.saki.date4u.interfaces.shell;

import com.saki.date4u.core.FileSystem;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.util.unit.DataSize;

@ShellComponent /*this annotation is responsable that this shell command can be used*/
public class FsCommands {

    private final FileSystem fs = new FileSystem();

    @ShellMethod("Display free disk space")
    public String freeDiskSpace() {
        return DataSize.ofBytes( fs.getFreeDiskSpace())
                .toGigabytes() + "GB";
    }
    @ShellMethod( "Display required free disk space")
    public long minimumFreeDiskSpace() {
        return 1_000_000;
    }

    @ShellMethod("Convert to lowercase string")
    public String toLowercase(String input) {
        return input.toLowerCase();
    }
}
