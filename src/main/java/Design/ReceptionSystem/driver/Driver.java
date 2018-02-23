package Design.ReceptionSystem.driver;

import Design.ReceptionSystem.service.Reception;
import Design.ReceptionSystem.processor.RequestProcessor;
import Design.ReceptionSystem.model.Customer;

/**
 * Created by abhishek.gupt on 16/02/18.
 */
public class Driver {

    public static void main(String[] args) {

        for(int i =0;i<4;i++){
            Thread thread = new Thread( new Reception("rid"+i));
            thread.start();
        }

        for(int i = 0;i<10;i++){
            RequestProcessor.processIncomingRequest( new Customer(i, "Customer_" + i, "Address_"+i, "Query_" + i));
        }

    }
}
