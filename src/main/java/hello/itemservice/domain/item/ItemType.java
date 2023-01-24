package hello.itemservice.domain.item;

public enum ItemType {

    // enum
    BOOK("도서"), FOOD("음식"), ETC("기타");

    private final String description;

    // 생성음
    ItemType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
