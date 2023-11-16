package serveur;

import service.CalculatriceWS;

import javax.xml.ws.Endpoint;

public class ServeurJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8084/calculatrice";
        Endpoint.publish(url, new CalculatriceWS());
        System.out.println("Service web publié à l'URL : " + url);
    }
}
