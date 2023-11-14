public class Terminal extends Handler {

    private String[] args;

    public Terminal(String[] args){
        this.args = args;
    }

    public String getPath(){
        return args[1];
    }

    public void showError(String e){
        System.err.println("Error: " + e);
    }
    
}
