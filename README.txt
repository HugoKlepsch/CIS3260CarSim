###Build instructions

In the ‘ solution/ ’ directory, you should find all of the source code. Included in that directory is
the build script ‘ buildJar.sh ’. At the moment, building via the script requires a bash
interpreter, and java executables on the main executable path of the shell. Building on Windows
without bash is not supported.

##### To build:
In ‘ solution/ ’ directory, run:
`./buildJar.sh`

This will create the ‘ build/ ’ directory, and the executable

`‘ build/CIS3260CarSimTeam2.jar ’`

#### Running the program

Once built, the program can be run from the command line.
If you were able to start the program by double clicking, congratulations! This does not work on
everyone’s machine. The program should be run from the command line with:
`java -jar <path to CIS3260CarSimTeam2.jar>`
If I just built the binary, the command would be
`java -jar build/CIS3260CarSimTeam2.jar`