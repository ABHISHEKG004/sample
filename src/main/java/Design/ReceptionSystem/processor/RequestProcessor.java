package Design.ReceptionSystem.processor;

import Design.ReceptionSystem.datastore.Datastore;
import Design.ReceptionSystem.model.Customer;

/**
 * Created by abhishek.gupt on 16/02/18.
 */
public class RequestProcessor {

    public static void processIncomingRequest(Customer customer){

        Datastore.queue.add(customer);

    }

}
