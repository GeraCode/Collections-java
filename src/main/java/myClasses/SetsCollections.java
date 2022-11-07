package myClasses;


import dto.BasicClubInfo;
import dto.Player;
import org.apache.log4j.Logger;
import utils.Constants;

import java.util.*;

public class SetsCollections {
    private static final Logger log = Logger.getLogger(SetsCollections.class);

    public static void main(String[] args) {
        List<BasicClubInfo> basicClubInfoList = new ArrayList<>();
        basicClubInfoList.add(new BasicClubInfo(7, Constants.GUADALAJARA, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        basicClubInfoList.add(new BasicClubInfo(1, Constants.AMERICA, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        basicClubInfoList.add(new BasicClubInfo(18, Constants.PUMAS, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        basicClubInfoList.add(new BasicClubInfo(6, Constants.CRUZ_AZUL, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        basicClubInfoList.add(new BasicClubInfo(14, Constants.MONTERREY, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        basicClubInfoList.add(new BasicClubInfo(11550, Constants.PUEBLA, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));

        /* Collections.sort(basicClubInfoList, new Comparator<BasicClubInfo>() {
            @Override
            public int compare(BasicClubInfo b1,BasicClubInfo b2){
                return b1.getClubId().compareTo(b2.getClubId());
            }
        });*/

        //es una solucion adaptable para cualquier momento que queramos.
        /*for (int i=0;i<basicClubInfoList.size();i++){
         System.out.println("indice "+i+"***** club  "+
                         basicClubInfoList.get(i).getClubId()+"-"+
                 basicClubInfoList.get(i).getClubName()+"-"+
                 basicClubInfoList.get(i).getLogoUrl());
        }*/


        /*******************************************************************/
        /*_________________________________________________________________*/
        /*_____________________    H a s h S e t    _______________________*/
        /*_________________________________________________________________*/
        /*******************************************************************/

        Set<BasicClubInfo> basicClubInfoSet = new HashSet<>();
        BasicClubInfo pachuca = new BasicClubInfo(11, Constants.PACHUCA, Constants.DEFAULT_CLUB_LOGOS_BASE_URL);
        BasicClubInfo toros = new BasicClubInfo(35, Constants.TOROS_NEZA, Constants.DEFAULT_CLUB_LOGOS_BASE_URL);


        basicClubInfoSet.add(new BasicClubInfo(7, Constants.GUADALAJARA, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        basicClubInfoSet.add(new BasicClubInfo(1, Constants.AMERICA, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        basicClubInfoSet.add(new BasicClubInfo(1, Constants.AMERICA, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        basicClubInfoSet.add(new BasicClubInfo(18, Constants.PUMAS, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        basicClubInfoSet.add(new BasicClubInfo(14, Constants.CRUZ_AZUL, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        basicClubInfoSet.add(new BasicClubInfo(11550, Constants.PUEBLA, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        basicClubInfoSet.add(pachuca);
        basicClubInfoSet.add(pachuca);
        basicClubInfoSet.add(toros);
        basicClubInfoSet.add(toros);
        basicClubInfoSet.add(null);
        basicClubInfoSet.add(null);

        /*_________________________________________________________________*/
        /*__________________ No permite duplicados    _____________________*/
        /*_________________________________________________________________*/

        for (BasicClubInfo basicClubInfo:basicClubInfoSet) {
          if(basicClubInfo==null){
              System.out.println(basicClubInfoSet.getClass());
          }else {
              System.out.println(basicClubInfo.getClubId() + "-" +
                      basicClubInfo.getClubName() + "-" +
                      basicClubInfo.getLogoUrl());
          }
        }


        /*******************************************************************/
        /*_________________________________________________________________*/
        /*_____________________    T r e e S e t    _______________________*/
        /*_________________________________________________________________*/
        /*******************************************************************/
        Set<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("Z");
        stringTreeSet.add("G");
        stringTreeSet.add("e");
        stringTreeSet.add("b");
        stringTreeSet.add("e");
        stringTreeSet.add("50");
        stringTreeSet.add("2");
        stringTreeSet.add("a");
        stringTreeSet.add("r");
        stringTreeSet.add("1");
        stringTreeSet.add("/");
        stringTreeSet.add("+");
        stringTreeSet.add("+/");
        stringTreeSet.add("/+");


        for (String s : stringTreeSet) {
            log.info(s);
        }

        Set<Player> basicClubInfoTreeSet = new TreeSet<>();

        basicClubInfoTreeSet.add(new Player(1, 7, 1, "Alexis", "Vega"));
        basicClubInfoTreeSet.add(new Player(2, 7, 1, "Chicharito", "Hernandez"));
        basicClubInfoTreeSet.add(new Player(5, 7, 10, "Ramon", "Ramirez"));
        basicClubInfoTreeSet.add(new Player(6, 7, 7, "Ramon", "Morales"));
        basicClubInfoTreeSet.add(new Player(4, 7, 9, "Venado", "Medina"));
        basicClubInfoTreeSet.add(new Player(4, 7, 9, "Venado", "Medina"));
        basicClubInfoTreeSet.add(new Player(3, 7, 100, "Bofo", "Bautista"));
        basicClubInfoTreeSet.add(new Player(4, 7, 9, "Venado", "Medina"));
        basicClubInfoTreeSet.add(new Player(5, 7, 10, "Ramon", "Ramirez"));
        basicClubInfoTreeSet.add(new Player(6, 7, 7, "Ramon", "Morales"));
        basicClubInfoTreeSet.add(new Player(4, 7, 9, "Venado", "Medina"));
        basicClubInfoTreeSet.add(new Player(6, 7, 7, "Ramon", "Morales"));
        basicClubInfoTreeSet.add(new Player(6, 7, 7, "Ramon", "Morales"));
        //basicClubInfoTreeSet.add(null);//no permite nulos

        /*_________________________________________________________________*/
        /*__________________ Ordena los elementos     _____________________*/
        /*_________________________________________________________________*/

        /*for (Player basicClubInfo:basicClubInfoTreeSet) {
            log.info("jugador numero -> "+ basicClubInfo.getPlayerId()+" - "+basicClubInfo.getPlayerName()+" "+basicClubInfo.getPlayerSurname());
        }*/


        /*******************************************************************/
        /*_________________________________________________________________*/
        /*_____________________    H a s h S e t    _______________________*/
        /*_________________________________________________________________*/
        /*******************************************************************/

        Set<Player> playerLinkedHashSet = new LinkedHashSet<>();
        playerLinkedHashSet.add(new Player(5, 7, 10, "Ramon", "Ramirez"));
        playerLinkedHashSet.add(new Player(2, 7, 1, "Chicharito", "Hernandez"));
        playerLinkedHashSet.add(new Player(4, 7, 9, "Venado", "Medina"));
        playerLinkedHashSet.add(new Player(3, 7, 100, "Bofo", "Bautista"));

       /*for (Player basicClubInfo:playerLinkedHashSet) {
            log.info("jugador numero -> "+ basicClubInfo.getPlayerId()+" - "+basicClubInfo.getPlayerName()+" "+basicClubInfo.getPlayerSurname());
        }*/

    }


}
