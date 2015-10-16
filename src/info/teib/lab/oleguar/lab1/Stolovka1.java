package info.teib.lab.oleguar.lab1;

        import java.util.*;




public class Stolovka1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("���� �������� Գ�����, ������ ���� �����  !");
        float cash = Float.parseFloat(sc.nextLine());
        System.out.println(" �� ���� ����");
        Dish1[]menu=dishes();
        for(int i=0;i<menu.length;i++){
            System.out.println((i+1)+". "+menu[i].getName()+" "+ menu[i].getPrice()+ "��� " + menu[i].getCalories());
        }
        System.out.println("�� ������ ������� ����������(������ ���������� ����� ������), ��� ��� ������� ������? ?");
        String order = sc.nextLine();
        if(order.contains("������")){
            System.out.println("����� � ��� ��� ������. ");
            Vector <Dish1>new_menu = new Vector(1);
            int k = 1;
            for(int i=0;i<menu.length;){
                if(cash>=menu[i].getPrice()*k){
                    new_menu.addElement(new Dish1((k+"x " + menu[i].getName()), menu[i].getPrice()*k,menu[i].getCalories()*k));
                    k++;
                }
                else{
                    i++;
                    k=1;
                }

            }

            System.out.print("��������� ������ ��� ��� " );
            do{
                System.out.print(most_caloried(cash, new_menu).getName()+"  ");
                cash = cash-most_caloried(cash, new_menu).getPrice();
            }while(cash>0.5);

        }
        else{
            String[]which_dish=order.split(" ");
            float total_price = 0;
            int total_calories = 0;
            System.out.println("���� ����������\n--------\n");
            for(int j=0;j<which_dish.length;j++){
                System.out.print(menu[Integer.parseInt(which_dish[j])-1].getName()+", ");
                total_price+=menu[Integer.parseInt(which_dish[j])-1].getPrice();
                total_calories+=menu[Integer.parseInt(which_dish[j])-1].getCalories();
            }
            System.out.println("\n-----------\n�������� ���� "+total_price+" ");
            System.out.println("\n-----------\n����������:"+total_calories+" ������");
            if(cash-total_price<0){
                System.out.println("�� �� ���� ��n����� �����");
            }
            else{
                System.out.println("���.��� ����� ������ " + (cash-total_price));
            }

        }

    }
    public static Dish1[] dishes (){
        Dish1[]menu = new Dish1 [9];
        menu[0]=new Dish1("�������� ", (float) 3.5, 350);
        menu[1]=new Dish1("������ �����", 6, 300);
        menu[2]=new Dish1("���", 3, 400);
        menu[3]=new Dish1("����", 9, 285);
        menu[4]=new Dish1("��� � ��������", 4, 192);
        menu[5]=new Dish1("���� �� ��������������", (float) 1.5, 255);
        menu[6]=new Dish1("���", 0.5F, 15);
        menu[7]=new Dish1("�����", 2.25F, 150);
        menu[8]=new Dish1("������ ��������� ����", 1F, 2);

        return menu;
    }
    public static Dish1 most_caloried(float cost, Vector<Dish1> menu){
        Vector<Dish1> menu_below_cost = new Vector(1);
        for(int i=0;i<menu.size();i++){
            if(menu.get(i).getPrice()<cost){
                menu_below_cost.addElement(menu.get(i));
            }
        }
        Dish1 max_calories = menu_below_cost.get(0);
        for(int j=0;j<menu_below_cost.size();j++){
            if(menu_below_cost.get(j).getCalories()>max_calories.getCalories()){
                max_calories=menu_below_cost.get(j);
            }
        }
        return max_calories;
    }
}

