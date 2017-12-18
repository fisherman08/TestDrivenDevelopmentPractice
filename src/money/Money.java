package money;

/**

 */
abstract class Money {
    protected int amount;
    protected String currency;

    abstract Money times(int multiplier);

    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object object){
        Money money = (Money) object;
        return (
                this.amount == money.amount &&
                this.getClass() == money.getClass()
        );
    }

    public String currency(){
        return this.currency;
    }

    static Money dollar(int amount){
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount){
        return new Franc(amount, "CHF");
    }


}
