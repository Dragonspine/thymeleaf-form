package hello.itemservice.domain.item;

/**
 * packageName    : hello.itemservice.domain.item
 * fileName       : ItemType
 * author         : kanghyun Kim
 * date           : 2022/09/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/09/05        kanghyun Kim      최초 생성
 */
public enum ItemType {

    BOOK("도서"), FOOD("음식"), ETC("기타");

    private final String description;

    ItemType(String description) {
        this.description = description;
    }
}
