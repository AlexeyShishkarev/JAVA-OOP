package Seminar.vending;

import Seminar.product.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private int id;
    private List<Product> productList;

    /**
     * Перегрузка конструктора класса с известным productList
     * @param productList
     */
    public VendingMachine(List<Product> productList){
        this.productList = productList;
    }

    /**
     * Конструктор класса без параметров
     */
    public VendingMachine(){
    this(new ArrayList<>());
    }


    /**
     * Добавление продуктов в автомат
     * @param product в метод передается готовый продукт
     */
    public void addProduct (Product product){
        productList.add(product);
    }

    /**
     * Нахождение продукта по названию
     * @param name наименование продукта
     * @return возвращает продукт, если не найден то null
     */
    public Product findByName (String name){
        for (Product product : productList){
            if (product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        return null;
    }


    /**
     * Получение списка продуктов
     * @return возвращает String
     */
    public String getProductsList (){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("==============СПИСОК ПРОДУКТОВ: ================\n");
        for (Product product : productList){
            stringBuilder.append(product);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}
