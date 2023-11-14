import javax.swing.JFileChooser;

public class GUI {
    
    public static String getPath(){
        var chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setDialogTitle("Select a directory to scan");
        chooser.showOpenDialog(null);
        return chooser.getSelectedFile().getAbsolutePath();
    }
}
