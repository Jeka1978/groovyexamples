package operator_overloading

import groovy.json.JsonSlurper
import groovy.transform.AutoClone
import groovy.transform.Canonical
import groovy.transform.Immutable

/**
 * @author Evgeny Borisov
 */
@Immutable(copyWith=true)
class Money implements Comparable<Money>{
    static slurper = new JsonSlurper()
    double amount
    String currency






    Money plus(Number number) {
        return this.copyWith(amount: amount+number)
    }
    Money minus(Number number) {
        return this.copyWith(amount: amount-number)
    }

    Money plus(Money other) {
        if(currency!=other.currency){

         double rate= getRate(other)

            return new Money(currency: currency,amount: amount+other.amount*rate)
        }
        else {
            return new Money(currency: this.currency,amount: this.amount+other.amount)
        }
    }
    Money minus(Money other) {
        if(currency!=other.currency){

         double rate= getRate(other)
            return this.copyWith(amount: amount-other.amount*rate)
        }
        else {
            return this.copyWith(amount: this.amount-other.amount)
        }
    }

    private void getRate(Money other) {
        slurper.parse(
                new URL("http://rate-exchange-1.appspot.com/currency?from=${other.currency}&to=$currency"))
                .rate
    }

    @Override
    int compareTo(Money other) {
        return (this-other).amount
    }


    Money next() {
        this+1
    }
    Money previous() {
        this-1
    }














}
