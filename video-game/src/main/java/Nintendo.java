public class Nintendo extends Console {
    private boolean nintendoOnline;

    public Nintendo(double carteira, boolean nintendoOnline) {
        super(carteira);
        this.nintendoOnline = nintendoOnline;
    }

    public void comprarNintendoOnline() {
        if (!nintendoOnline) nintendoOnline = true;
    }
}
