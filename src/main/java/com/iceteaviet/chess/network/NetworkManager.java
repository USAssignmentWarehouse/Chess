package main.java.com.iceteaviet.chess.network;

/**
 * Created by Genius Doan on 6/17/2017.
 */
public class NetworkManager {
    private static NetworkManager mInstance = null;
    private boolean isConnected = false;

    private NetworkManager() {

    }

    public static NetworkManager getInstance() {
        if (mInstance == null)
            mInstance = new NetworkManager();

        return mInstance;
    }

    public void sendEndMessages() {
        if (isConnected) {
            if (NetworkEndPoint.server) {
                ChessServer.getInstance().sendEndMessage();
            } else {
                ChessClient.getInstance().sendEndMessage();
            }
        }
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        this.isConnected = connected;
    }

    public void closeConnection() {
        if (isConnected) {
            if (NetworkEndPoint.server)
                ChessServer.getInstance().closeConnection();
            else
                ChessClient.getInstance().closeConnection();
            isConnected = false;
        }
    }
}
