class Main{
    public static void main(String[] args){
        String targetPath;
        Handler handler;

        if (args.length > 2){
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


        System.out.println("success" + targetPath);
    }
}