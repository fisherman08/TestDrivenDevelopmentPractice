package money;

/**
 * Created on 2017/12/18.
 */
interface Expression {
    Expression plus(Expression addend);
    Money reduce(Bank bank, String to);
}
