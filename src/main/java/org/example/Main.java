package org.example;


import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TeamLead teamlead = new TeamLead( "Emre", "Eser", "18.11.1996" ) ;

        Departman departman = new Departman(teamlead);

        Kadin ece = new Kadin( "Ece", "Göktepe", "23.10.1997" ) ;

        Erkek ihsan = new Erkek( "İhsan", "Yurttaş", "11.06.1997" ) ;

        departman.addPersonel(ece);
        departman.addPersonel(ihsan);
        personelYazdir(departman);
        departman.removePersonel(ihsan);

        personelYazdir(departman);
        Personel furkan = new Erkek ( "Furkan", "Mermer", "21.02.1996" ) ;
        departman.changePersonel(ece,furkan);

        personelYazdir(departman);

        departman.addAssignment("iş analisti");
        departman.addAssignment("yazılım test mühendisi");
        gorevleriYazdir(departman);
        departman.markAssignmentAsCompleted("iş analisti");
        gorevleriYazdir(departman);

        System.out.println(" İhsan'ın emeklilik yaşı : " +ihsan.emeklilikYasiniHesapla());
        System.out.println(" Ece'nin emeklilik yaşı : " +ece.emeklilikYasiniHesapla());

    }

    private static void personelYazdir(Departman departman) {
        System.out.println(" Personel listesi :");
        for (Personel personel : departman.getPersonelList()) {

            System.out.println(" Personel : " + personel.getAd());

        }
    }
        private static void gorevleriYazdir(Departman departman) {
            System.out.println(" Gorev listesi :");
            for (String gorev : departman.getAssignmentList()) {

                System.out.println(" Gorev : " + gorev);

            }

        }
}