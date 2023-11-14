import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Terminal extends Handler {

    private String[] args;

    public Terminal(String[] args){
        this.args = args;
    }

    public String getPath(){
        return args[0];
    }

    public void showError(String e){
        System.err.println("Error: " + e);
    }
    
    public void showResult(String result){
        if (args.length > 1){
            try{
                saveToFile(result,args[1]);
            }
            catch(IOException e){
                saveToStdout(result);
                showError(e.getMessage());
            }
        }
        else{
            saveToStdout(result);
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

    private void saveToStdout(String result){
        System.out.println(result);
    }
}
