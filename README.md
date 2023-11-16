# Directory/Folder Cataloguer

This program can list out all files in a directory and all subdirectories. Uses include creating records of documents.

## Usage
### GUI
#### Windows
Run `run.bat`
#### Linux/MacOS
Run `run.sh`

### Any
Run `java -jar file_sys_printer.jar`

### CLI
Requires java 17+

`java -jar file_sys_printer.jar \<path to be printed\> \<name of output text file\>`

## Building from source
To build the project use 
`javac src/* -d build`

To package the project use 
`jar cfe file_sys_printer.jar Main -C build .`

## Dependancies
* Java 17+ JRE
* Java 17+ JDK (for building only)

**Does not support headless JRE**