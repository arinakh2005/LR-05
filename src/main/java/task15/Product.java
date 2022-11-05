package task15;

public class Product {
    private final int id;
    private Article article;
    private boolean isDelivery;
    private int incrementedUniqId = 0;

    public Product(Article article, boolean isFreeDelivery) {
        this.id = incrementedUniqId++;
        this.article = article;
        this.isDelivery = isFreeDelivery;
    }

    public Product(Article article) {
        this.id = incrementedUniqId;
        this.article = article;
        this.isDelivery = false;
    }

    public int getId() {
        return id;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Article getArticle() {
        return article;
    }

    public boolean isDelivery() {
        return isDelivery;
    }

    public void setDelivery(boolean delivery) {
        isDelivery = delivery;
    }
}
