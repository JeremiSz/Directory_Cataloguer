import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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

    public void showResult(String result){
        var target = JOptionPane.showInputDialog("Enter the name of the file to save the result");
        if (target == null){
            showError("No file name entered");
            return;
        }
        try{
            saveToFile(result,target);
        }
        catch(IOException e){
            showError(e.getMessage());
        }
    }

    private void saveToFile(String result,String filename) throws IOException{
        var fullName = filename + ".txt";
        {
            var file = new File(fullName);
            if (!file.exists()){
                file.createNewFile();
            }
        }
        var file = new FileWriter(fullName);
        file.write(result);
        file.close();
        return;
    }
}
