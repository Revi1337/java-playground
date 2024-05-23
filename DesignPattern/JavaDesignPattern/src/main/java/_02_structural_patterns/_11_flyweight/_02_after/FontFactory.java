package _02_structural_patterns._11_flyweight._02_after;


import java.util.HashMap;
import java.util.Map;

/**
 * FlyWeight 인스턴스인 Font 에 접근할수있고 캐시해둘 수 역할을 하는 FlyWeightFactory 가 필요하다.
 */
public class FontFactory {

    private Map<String, Font> cache = new HashMap<>();

    public Font getFont(String font) {
        if (cache.containsKey(font)) {
            return cache.get(font);
        }
        String[] split = font.split(":");
        Font newFont = new Font(split[0], Integer.parseInt(split[1]));
        cache.put(font, newFont);
        return newFont;
    }

}
