package dev.dworks.apps.anexplorer.service;

import android.os.Looper;

import dev.dworks.apps.anexplorer.network.NetworkServiceHandler;


public class ConnectionsService extends NetworkServerService {



    @Override
    protected NetworkServiceHandler createServiceHandler(Looper serviceLooper, NetworkServerService service) {
        return new NetworkServiceHandler(serviceLooper, service);
    }

    @Override
    public Object getServer() {
        return null;
    }

    @Override
    public boolean launchServer() {
        return false;
    }

    @Override
    public void stopServer() {
    }
}
