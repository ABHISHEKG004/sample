package Design.SwiggyAutoAssignment.Processor;

import Design.SwiggyAutoAssignment.Constants.DEStatus;
import Design.SwiggyAutoAssignment.Constants.OrderStatus;
import Design.SwiggyAutoAssignment.DataStore.Database;
import Design.SwiggyAutoAssignment.Models.DeliveryExecutive;
import Design.SwiggyAutoAssignment.Models.Order;
import Design.SwiggyAutoAssignment.Service.AssignmentService;

import java.util.ArrayList;

/**
 * Created by abhishek.gupt on 26/05/18.
 */
public class OrderAssignementProcessor {
    public static void assignCurrentOrdersToDEs() {
        ArrayList<Order> currentOrders = new ArrayList<Order>();
        ArrayList<DeliveryExecutive> currentIdleDEs = new ArrayList<DeliveryExecutive>();

        for(Order order : Database.getOrderList()){
            if(order.getStatus()== OrderStatus.PLACED.getValue()){
                currentOrders.add(order);
            }
        }


        for(DeliveryExecutive de : Database.getDeliveryExecutivesList()){
            if(de.getStatus()== DEStatus.IDLE.getValue()){
                currentIdleDEs.add(de);
            }
        }

        AssignmentService.assignOrdersToDEs(currentOrders, currentIdleDEs);
    }
}