package operator_overloading

import groovy.json.JsonSlurper
import groovy.transform.Immutable

/**
 * @author Evgeny Borisov
 */
@Immutable
class Money {
    static slurper = new JsonSlurper()
    double amount
    String currency

    Money plus(Money other) {
        if(currency!=other.currency){

         double rate= slurper.parse(
                 new URL("http://rate-exchange-1.appspot.com/currency?from=${other.currency}&to=$currency"))
                 .rate
            return new Money(currency: currency,amount: amount+other.amount*rate)
        }
        else {
            return new Money(currency: this.currency,amount: this.amount+other.amount)
        }
    }



}
