package myClasses;

import dto.Player;
import org.apache.log4j.Logger;
import utils.Constants;

import java.util.*;

public class MapCollections {
    private static final Logger log = Logger.getLogger(MapCollections.class);

    public static void main(String[] args) {
        Iterator iterator ;
        /*******************************************************************/
        /*_________________________________________________________________*/
        /*_____________________    H a s h M a p    _______________________*/
        /*_________________________________________________________________*/
        /*******************************************************************/

        Map<Integer, String> stringHashMap = new HashMap<>();
        //no permite duplicar
        stringHashMap.put(2, Constants.AMERICA);
        stringHashMap.put(1, Constants.CRUZ_AZUL);
        stringHashMap.put(null, Constants.GUADALAJARA);
        stringHashMap.put(3, Constants.TOROS_NEZA);
        stringHashMap.put(3, "jjjjjj");
        stringHashMap.put(5, null);

        iterator = stringHashMap.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = (Integer) iterator.next();
            // log.info("Clave: " + stringHashMap.get(key));
        }

        log.info("------------------------------------ ");


        /*******************************************************************/
        /*_________________________________________________________________*/
        /*___________________    H a s h T a b l e  _______________________*/
        /*_________________________________________________________________*/
        /*******************************************************************/
        //no admite nulos ni llave , nu valor
        //llave y valor
        //maneja indices basados en codigo hash
        Hashtable hashtable= new Hashtable();


        hashtable.put(2, Constants.AMERICA);
        hashtable.put(1, Constants.CRUZ_AZUL);
        hashtable.put(3, Constants.TOROS_NEZA);
        hashtable.put(3, Constants.TOROS_NEZA);//siempre usa el ultimo valor de una llave que esta duplicada
        //hashtable.put(5, null);
        //hashtable.put(null, "null Key");




        //log.info("Hashtable : " + hashtable);





        /*******************************************************************/
        /*_________________________________________________________________*/
        /*_____________________    T r e e M a p    _______________________*/
        /*_________________________________________________________________*/
        /*******************************************************************/
        Map<Integer, String> stringTreeMap = new TreeMap<>();
        //no permite duplicar
        stringTreeMap.put(2, Constants.AMERICA);
        stringTreeMap.put(1, Constants.CRUZ_AZUL);
        //stringTreeMap.put(null, Constants.GUADALAJARA);//no acepta llaves nulas
        stringTreeMap.put(3, Constants.TOROS_NEZA);
        stringTreeMap.put(3, "BE");//siempre usa el ultimo valor de una llave que esta duplicada
        stringTreeMap.put(5, null);//acepta nulos

        //log.info("stringTreeMap : " + stringTreeMap);













        /*******************************************************************/
        /*_________________________________________________________________*/
        /*__________________  L i n k e d H a s h M a p   _________________*/
        /*_________________________________________________________________*/
        /*******************************************************************/

        Map<Integer, String> stringLinkedHashMap = new LinkedHashMap<>();
        stringLinkedHashMap.put(2, Constants.AMERICA);
        stringLinkedHashMap.put(7, Constants.AMERICA);
        stringLinkedHashMap.put(1, Constants.CRUZ_AZUL);
        stringLinkedHashMap.put(3, Constants.TOROS_NEZA);
        stringLinkedHashMap.put(3, "BE");
        stringLinkedHashMap.put(5, null);

        Iterator iterator3 = stringLinkedHashMap.keySet().iterator();
        while (iterator3.hasNext()) {
            Integer key = (Integer) iterator3.next();
            log.info("Clave: " + stringLinkedHashMap.get(key));
        }


        Map<Integer, Player> playerLinkedHashMap = new LinkedHashMap<>();


        playerLinkedHashMap.put(1, new Player(5, 7, 10, "Ramon", "Ramirez"));
        playerLinkedHashMap.put(4, new Player(4, 7, 9, "Venado", "Medina"));
        playerLinkedHashMap.put(5, new Player(6, 7, 7, "Ramon", "Morales"));
        playerLinkedHashMap.put(2, new Player(100, 7, 7, "Bofo", "Butista"));
        playerLinkedHashMap.put(3, new Player(6, 7, 7, "Ramon", "Morales"));

        Iterator iterator4 = playerLinkedHashMap.keySet().iterator();
        while (iterator4.hasNext()) {
            Integer key = (Integer) iterator4.next();
            log.info("LinkedHashMap Clave: " + key + "-->" + playerLinkedHashMap.get(key));
        }



    }

}
