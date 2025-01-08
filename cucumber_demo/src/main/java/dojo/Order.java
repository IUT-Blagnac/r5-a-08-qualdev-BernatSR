package dojo;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String owner;
    private String target;
    private List<String> cocktails;
    private String message;

    public Order() {
        this.cocktails = new ArrayList<>();
    }

    // Déclare le propriétaire de la commande
    public void declareOwner(String name) {
        this.owner = name;
    }

    // Déclare la personne cible de la commande
    public void declareTarget(String name) {
        this.target = name;
    }

    // Ajoute un message à la commande
    public void addMessage(String msg) {
        this.message = msg;
    }

    // Récupère la liste des cocktails dans la commande
    public List<String> getCocktails() {
        return cocktails;
    }

    // Génère le ticket de la commande
    public String generateTicket() {
        StringBuilder ticket = new StringBuilder();
        ticket.append("From ").append(owner).append(" to ").append(target).append(": ");
        if (message != null && !message.isEmpty()) {
            ticket.append(message);
        }
        return ticket.toString();
    }

    // Optionnel: Ajoute un cocktail à la commande
    public void addCocktail(String cocktail) {
        this.cocktails.add(cocktail);
    }
}
