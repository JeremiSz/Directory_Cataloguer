class Main{
    public static void main(String[] args){
        String targetPath;
        boolean isGUI = (args.length > 2);
        if (isGUI){
            targetPath = args[1];
        }
        else{
            targetPath = GUI.getPath();
        }
        System.out.println(targetPath);
    }
}