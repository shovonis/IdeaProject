package net.therapservices.SpringApplicationPractise;

import net.therapservices.SpringApplicationPractise.service.ClientService;

/**
 * Created by rifatul.islam on 6/4/14.
 */

public class DefaultServiceLocator {
    private static ClientService clientService = new ClientService();

    private DefaultServiceLocator() {
    }

    public ClientService createClientServiceInstance() {
        return clientService;
    }
}