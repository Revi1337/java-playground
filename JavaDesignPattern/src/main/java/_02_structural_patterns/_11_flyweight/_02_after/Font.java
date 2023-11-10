package _02_structural_patterns._11_flyweight._02_after;

/**
 * 플라이웨잇에 해당하는 인스턴스는 Immutable 해야한다. 그 인스턴스의 값을 바꾸면안된다. 따라서 final 이어야 함
 */
public final class Font {

    private final String family;

    private final int size;

    public Font(String family, int size) {
        this.family = family;
        this.size = size;
    }

    public String getFamily() {
        return family;
    }

    public int getSize() {
        return size;
    }
}
