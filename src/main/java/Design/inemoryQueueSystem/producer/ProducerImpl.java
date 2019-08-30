package Design.inemoryQueueSystem.producer;

import Design.inemoryQueueSystem.models.Message;
import Design.inemoryQueueSystem.services.PubSubService;

/**
 * Created by Abhishek gupta on 2019-08-30
 */


public class ProducerImpl implements Producer {
  public void publish(Message message, PubSubService pubSubService) throws InterruptedException {
    pubSubService.addMessageToQueue(message);
  }
}