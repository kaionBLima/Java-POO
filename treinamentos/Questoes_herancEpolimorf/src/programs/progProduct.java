package programs;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class progProduct {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Product> listProduct = new ArrayList<>();

        System.out.println("Entre com o numero de produtos: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            System.out.print("Product #" + i + " data: ");
            System.out.print("Common, used of imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Preco: ");
            double price = sc.nextDouble();

            if(type == 'c') {
                listProduct.add(new Product(name, price));
            } else if (type == 'u') {
                System.out.print("Data de fabricacao (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                listProduct.add(new UsedProduct(name, price, date));
            } else {
                System.out.print("Taxa de importacao: ");
                double customsFee = sc.nextDouble();
                listProduct.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println();
        System.out.println("Etiquetas de preco: ");
        for (Product prod : listProduct) {
            System.out.println(prod.priceTag());
        }


    }
}