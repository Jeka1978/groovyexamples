package lab2

/**
 * @author Evgeny Borisov
 */
class StartPoint {
    public static void main(String[] args) {
        Map<Integer, Citizen> map = [
                1:new Citizen(homeAddress: new Address(streetName: 'nehoshet')),
                2:new Citizen(homeAddress: new Address(streetName: 'habrzel')),
                3:new Citizen(homeAddress: new Address(streetName: 'byalik'))
        ]
        PersonUtil.printStreetName(map,12)
    }
}
