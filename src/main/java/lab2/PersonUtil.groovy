package lab2

import demo.Person

/**
 * @author Evgeny Borisov
 */
class PersonUtil {
   static void printStreetName(Map<Integer,Citizen> map,int key){

      println map[key]?.homeAddress?.streetName


//       def citizen = map[key]
//       if (citizen != null) {
//           def address = citizen.homeAddress
//           if (address != null) {
//               def streetName = address.streetName
//               println(streetName)
//           }
//       }

   }
}
