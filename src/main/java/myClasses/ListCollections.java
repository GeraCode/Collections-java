package myClasses;


import dto.BasicClubInfo;
import dto.Player;
import org.apache.log4j.Logger;
import utils.Constants;

import java.util.*;

public class ListCollections {
    private static final Logger log = Logger.getLogger(ListCollections.class);

    public static void main(String[] args) throws InterruptedException {
        /*******************************************************************/
        /*_________________________________________________________________*/
        /*___________________    A r r a y L i s t   ______________________*/
        /*_________________________________________________________________*/
        /*******************************************************************/
        // se define el
        log.info("ArrayList" );
        List<BasicClubInfo> basicClubInfoList = new ArrayList<>();
        basicClubInfoList.add(new BasicClubInfo(7, Constants.GUADALAJARA, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        basicClubInfoList.add(new BasicClubInfo(1, Constants.AMERICA, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        basicClubInfoList.add(new BasicClubInfo(18, Constants.PUMAS, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        basicClubInfoList.add(new BasicClubInfo(6, Constants.CRUZ_AZUL, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        basicClubInfoList.add(new BasicClubInfo(14, Constants.MONTERREY, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        basicClubInfoList.add(new BasicClubInfo(11550, Constants.PUEBLA, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));

        Collections.sort(basicClubInfoList, new Comparator<BasicClubInfo>() {
            @Override
            public int compare(BasicClubInfo b1,BasicClubInfo b2){
                return b1.getClubId().compareTo(b2.getClubId());
            }
        });
        //basicClubInfoList.removeIf(basicClubInfo -> (basicClubInfo.getClubId()>10));
        for (int i = 0; i < basicClubInfoList.size(); i++) {
            log.info("indice " + i + "     ***** club  " +
                    basicClubInfoList.get(i).getClubId() + "  -->      " +
                    basicClubInfoList.get(i).getClubName() + "-" +
                    basicClubInfoList.get(i).getLogoUrl());
        }


        log.info("*****************************************************************" );


        /*******************************************************************/
        /*_________________________________________________________________*/
        /*___________________   L i n k e d L i  s t   ____________________*/
        /*_________________________________________________________________*/
        /*******************************************************************/


        log.info("LinkedList" );

        List<BasicClubInfo> clubInfoLinkedList = new LinkedList<>();
        clubInfoLinkedList.add(new BasicClubInfo(7, Constants.GUADALAJARA, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        clubInfoLinkedList.add(new BasicClubInfo(1, Constants.AMERICA, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        clubInfoLinkedList.add(new BasicClubInfo(18, Constants.PUMAS, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        clubInfoLinkedList.add(new BasicClubInfo(6, Constants.CRUZ_AZUL, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        clubInfoLinkedList.add(new BasicClubInfo(14, Constants.MONTERREY, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        clubInfoLinkedList.add(new BasicClubInfo(11550, Constants.PUEBLA, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));



        for (int i = 0; i < clubInfoLinkedList.size(); i++) {
            log.info("indice " + i + "     ***** club  " +
                    clubInfoLinkedList.get(i).getClubId() + "  -->      " +
                    clubInfoLinkedList.get(i).getClubName() + "-" +
                    clubInfoLinkedList.get(i).getLogoUrl());
        }






        log.info("__________________________________________________________________");
        clubInfoLinkedList.add(1,new BasicClubInfo(33333333, "BARCELONA", Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        for (int i = 0; i < clubInfoLinkedList.size(); i++) {
            log.info("indice " + i + "     ***** club  " +
                    clubInfoLinkedList.get(i).getClubId() + "  -->      " +
                    clubInfoLinkedList.get(i).getClubName() + "-" +
                    clubInfoLinkedList.get(i).getLogoUrl() +" -->" + clubInfoLinkedList.get(i));
        }










        log.info("__________________________________________________________________");


        clubInfoLinkedList.add(3,new BasicClubInfo(33333333, "Manchester United", Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        for (int i = 0; i < clubInfoLinkedList.size(); i++) {
            log.info("indice " + i + "     ***** club  " +
                    clubInfoLinkedList.get(i).getClubId() + "  -->      " +
                    clubInfoLinkedList.get(i).getClubName() + "-" +
                    clubInfoLinkedList.get(i).getLogoUrl() +" -->" + clubInfoLinkedList.get(i));
        }


       // log.info("PRIMERO "+clubInfoLinkedList.stream().findFirst());











        /*******************************************************************/
        /*_________________________________________________________________*/
        /*___________________      S  t  a  c  k       ____________________*/
        /*_________________________________________________________________*/
        /*******************************************************************/

        log.info("_____________  S  t  a  c  k ____________________");

        //solo importa el orden de entrada y salida , acepta duplicados
        Stack<BasicClubInfo> pila = new Stack<>();
        pila.add(new BasicClubInfo(7, Constants.GUADALAJARA, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        pila.add(new BasicClubInfo(1, Constants.AMERICA, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));
        pila.add(new BasicClubInfo(18, Constants.PUMAS, Constants.DEFAULT_CLUB_LOGOS_BASE_URL));

        for(BasicClubInfo info:pila){
            log.info(info.getClubName());
        }

        /*******************************************************************/
        /*_________________________________________________________________*/
        /*___________________       Q u e u e          ____________________*/
        /*_________________________________________________________________*/
        /*******************************************************************/
        log.info("_____________    Q u e u e  ____________________");

        Queue<Player> cola= new PriorityQueue<>();
        cola.offer( new Player(5, 7, 10, "Ramon", "Ramirez"));
        cola.offer( new Player(4, 7, 9, "Venado", "Medina"));
        cola.offer( new Player(6, 7, 7, "Ramon", "Morales"));
        cola.offer( new Player(100, 7, 7, "Bofo", "Butista"));
        cola.offer( new Player(6, 7, 7, "Ramon", "Morales"));



        while(!cola.isEmpty()){
            log.info( "" +cola.poll());//remove
            Thread.sleep(100);
            log.info( cola.peek());//the head of this queue

        }


        /*******************************************************************/
        /*_________________________________________________________________*/
        /*___________________        D e q u e         ____________________*/
        /*_________________________________________________________________*/
        /*******************************************************************/
        log.info("_____________    D e q u e   ____________________");
        Deque<Player> dq= new ArrayDeque<>();
        dq.add( new Player(5, 7, 10, "Ramon", "Ramirez"));
        dq.add( new Player(4, 7, 9, "Venado", "Medina"));
        dq.add( new Player(6, 7, 7, "Ramon", "Morales"));
        dq.add( new Player(100, 7, 7, "Bofo", "Butista"));
        dq.add( new Player(6, 7, 7, "Ramon", "Morales"));



         for(Player p:dq){
             log.info(p.getPlayerName());
         }

    }


}
