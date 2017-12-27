package money;

/**
 * Created on 2017/12/18.
 */
interface Expression {
    Expression plus(Expression addend);
    Expression times(int multiplier);
    Money reduce(Bank bank, String to);
}
