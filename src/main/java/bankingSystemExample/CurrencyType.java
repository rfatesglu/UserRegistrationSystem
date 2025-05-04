package bankingSystemExample;



public enum CurrencyType {

    TL("TL"),

    Dolar("$"),

    Euro("€"),

    Gold("G");

    private final String symbol;

    CurrencyType(String symbol) {
        this.symbol=symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
