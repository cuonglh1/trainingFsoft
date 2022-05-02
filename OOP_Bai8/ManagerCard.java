package OOP_Bai8;

import java.util.ArrayList;
import java.util.List;

public class ManagerCard {
    private List<Card> cards;

    public ManagerCard() {
        this.cards = new ArrayList<>();
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public boolean delete(String id) {
        Card card = this.cards.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (card == null) {
            return false;
        }
        this.cards.remove(card);
        return true;
    }
    public void showInforCards() {
        System.out.println("----Thông tin cards----");
        this.cards.forEach(item-> System.out.println(item.toString()));
    }
}
