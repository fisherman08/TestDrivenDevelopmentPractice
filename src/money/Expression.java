package money;

/**
 * Created on 2017/12/18.
 */
interface Expression {
    Money reduce(Bank bank, String to);
}
