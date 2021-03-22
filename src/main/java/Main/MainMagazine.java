package Main;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Entities.*;


public class MainMagazine {

    public static void main(String[] args)  {
        ArrayList<Revista> revistes = new ArrayList();
        FileAccessor fa;

        Menu menu = new Menu();
        int opcio;

        opcio = menu.menuPral();

        switch (opcio) {

            case 1:

                System.out.println("1!!");
                fa=new FileAccessor();
                try {
                    fa.readAutorsFile("src/main/java/Docs/autors.txt");
                    fa.printAutors();
                    fa.readMagazinesFile("src/main/java/Docs/revistes.txt");
                    fa.printRevistes();
                    revistes=fa.readArticlesFile("src/main/java/Docs/articles.txt");
                    mostraRevistes(revistes);
                } catch (NumberFormatException | IOException e) {

                    e.printStackTrace();
                }
                break;

            case 2:
                System.out.println();
                System.out.println();

                Revista revistaEscollit = seleccionaRevista(revistes);
                Article articleEscollit = seleccionaArticle(revistaEscollit);
                //TRABAJAR CON A

                break;

            default:
                System.out.println("Adeu!!");
                System.exit(1);
                break;

        }

    }
    public static void mostraRevistes(ArrayList<Revista> revistes){
        for (Revista revista : revistes) {

            System.out.println(revista.toString());
            for (int j = 0; j < revista.getArticles().size(); j++) {
                System.out.println("\t"+ revista.getArticle(j).toString());
                System.out.println("\t\t"+revista.getArticle(j).getAutor().toString());
            }

        }
    }

    public static Revista seleccionaRevista(ArrayList<Revista> revistes){
        Scanner sc = new Scanner(System.in);

        for(Revista revista : revistes ){
            System.out.println(revista.toString());
        }
        int x = sc.nextInt();
        for(Revista revista : revistes ){
            if (revista.getId_revista()==x){
                return revista;
            }
        }
        return null;
    }

    public static Article seleccionaArticle(Revista revista){
        Scanner sc = new Scanner(System.in);

        for(Article article : revista.getArticles()){
            System.out.println(article);
        }
        int x = sc.nextInt();
        for(Article article : revista.getArticles()){
            if (revista.getId_revista()==x){
                return article;
            }
        }
        return null;
    }



}