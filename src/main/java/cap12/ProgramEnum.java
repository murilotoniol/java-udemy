package cap12;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;
import java.util.Scanner;

public class ProgramEnum {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);
        sc.close();
    }
}
