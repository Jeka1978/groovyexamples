package collections_examples

import operator_overloading.Money

/**
 * @author Evgeny Borisov
 */
class Main {
    public static void main(String[] args) {
        def list = [1, 2, 3]
        def newList = list.collect { it * 20 }
        println(list)
        println(newList.sum())
        println([new Money(amount: 100,currency: 'USD')
                 ,new Money(amount: 20,currency: 'ILS')
        ].sum()
        )
    }
}
