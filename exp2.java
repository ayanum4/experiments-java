class exp2 {
    public static void main(String[] args) {
        String text1 = "\"Список товаров\"\t";
        String text2 = "Цена\t";
        String text3 = "Количество\n";

        System.out.print(text1);
        System.out.print(text2);
        System.out.print(text3);

        int len = text1.length() + text2.length() + text3.length();

        for (int i = 0; i < len; i++) {
            System.out.print("-");
        }
        
        System.out.print("Молоко\t");
        System.out.print("380\t");
        System.out.print("1\n");
    }
}
