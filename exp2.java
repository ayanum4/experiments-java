class exp2 {
    public static void main(String[] args) {
        String text1 = "\"Список товаров\"";
        String text2 = "Цена";
        String text3 = "Количество";

        String header = String.format("%-20s %-10s %-10s", text1, text2, text3);
        System.out.println(header);

        for (int i = 0; i < header.length(); i++) {
            System.out.print("-");
        }
        System.out.println();
        
        String products[] = {"Молоко", "Хлеб"};
        int prices[] = {380, 120};
        int quantities[] = {1, 8};

        for (int i = 0; i < products.length; i++) {
            System.out.printf("%-20s %-10s %-10s\n", products[i], prices[i], quantities[i]);
        }
    }
}
