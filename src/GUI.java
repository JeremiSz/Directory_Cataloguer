import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class GUI extends Handler {
    
    public String getPath(){
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

    public void showError(String e){
        JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
    }
}
