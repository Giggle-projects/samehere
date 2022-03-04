package com.giggle.samehere.card.domain;

import com.giggle.samehere.item.domain.Item;

import javax.persistence.*;

@Entity
public class CardItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long cardId;

    @ManyToOne
    private Item item;
    private String answer;

    protected CardItem() {
    }

    public CardItem(Long cardId, Item item, String answer) {
        this.cardId = cardId;
        this.item = item;
        this.answer = answer;
        validateAnswer();
    }

    public void validateAnswer() {
        item.validateAnswer(answer);
    }

    public Long getId() {
        return id;
    }

    public Long getCardId() {
        return cardId;
    }

    public Item getItem() {
        return item;
    }

    public String getAnswer() {
        return answer;
    }
}
