package com.saki.date4u.interfaces.shell;

import com.saki.date4u.core.FileSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.util.unit.DataSize;

@ShellComponent /*this annotation is responsable that this shell command can be used*/
public class FsCommands {

//  Constructor-Injection
    private final FileSystem fs;

    @Autowired
    public FsCommands( FileSystem fs) {
        this.fs = fs;
    }

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

    //    Setter-Injection
//    private FileSystem fs;
//
//    @Autowired
//    public void setFileSystem(FileSystem fs  ) {
//        this.fs = fs;
//    }
//
//    Field-Injection
//    @Autowired
//    private FileSystem fs;


}
