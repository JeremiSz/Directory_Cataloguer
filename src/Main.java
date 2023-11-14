class Main{
    public static void main(String[] args){
        String targetPath;
        for (String arg : args){
            System.out.println(arg);
        }
        boolean isGUI = (args.length > 2);
        if (isGUI){
            targetPath = args[1];
        }
        else{
            targetPath = GUI.getPath();
        }


        System.out.println("success" + targetPath);
    }
}