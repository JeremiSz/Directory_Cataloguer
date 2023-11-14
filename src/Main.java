import java.io.File;

class Main{
    public static void main(String[] args){
        String targetPath;
        Handler handler;

        if (args.length > 0){
            handler = new Terminal(args);
        }
        else{
            handler = new GUI();
        }

        targetPath = handler.getPath();
        if (targetPath == null){
            handler.showError("Folder selected is not found");
            return;
        }
        var rootDir = new File(targetPath);
        var output = getFiles(rootDir, 0);
        handler.showResult(output);
    }

    private static String getFiles(File directory, int depth){
        StringBuilder output = new StringBuilder();
        try{
            for (File file : directory.listFiles()){
                if (file.isDirectory()){
                    output.append(generateLine(file.getName(), depth));
                    output.append(getFiles(file, depth + 1));
                }
                else{
                    output.append(generateLine(file.getName(), depth));
                }
            }
        }
        catch (NullPointerException e){
            return "";
        }

        return output.toString();
    }

    private static String generateLine(String name, int depth){
        if (depth < 1){
            return name + "\n";
        }
        if (depth == 1){
            return "└" + name + "\n";
        }
        return "└" + "-".repeat(depth - 1) + name + "\n";
    }
}