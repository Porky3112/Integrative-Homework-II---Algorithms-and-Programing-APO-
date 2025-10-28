package ui;
import java.util.Scanner;
import model.SearchTreasureController;

public class SearchTreasuresApp{

    private  SearchTreasureController controller;
    private  Scanner scan;

    public SearchTreasuresApp(){

        controller = new SearchTreasureController("Busca tesoros");
        scan = new Scanner(System.in);
    }


    public static void main(String[] args){

        SearchTreasuresApp system = new SearchTreasuresApp();
    }
}