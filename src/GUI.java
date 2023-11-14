import javax.swing.JFileChooser;

public class GUI {
    
    public static String getPath(){
        try{
            var chooser = new JFileChooser();
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            chooser.setDialogTitle("Select a directory to scan");
            chooser.showOpenDialog(null);
            var filepath = chooser.getSelectedFile();
            if (filepath == null)
                return null;
            return filepath.getAbsolutePath();
        }
        catch(Exception e){
            System.err.println("Error: " + e.getMessage());
            return null;
        }
    }
}
