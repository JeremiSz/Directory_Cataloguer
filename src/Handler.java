public abstract class Handler {
    public abstract String getPath();
    public abstract void showError(String e);
    public abstract void showResult(String result);
}
