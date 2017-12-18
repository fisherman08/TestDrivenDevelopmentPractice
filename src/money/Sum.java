package money;

/**
 * Created on 2017/12/18.
 */
public class Sum implements Expression{
    Money augend;
    Money addend;

    Sum(Money augend, Money addend){
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(String to){
        int amount = this.augend.amount + this.addend.amount;
        return new Money(amount, to);
    }
}
