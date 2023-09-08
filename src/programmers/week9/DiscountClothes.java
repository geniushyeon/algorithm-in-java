package programmers.week9;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120818
 */
public class DiscountClothes {

    public int solution(int price) {
        if (price < 100000) {
            return price;
        }

        if (price < 300000) {
            return getDiscountedPrice(price, 0.05);
        }

        if (price < 500000) {
            return getDiscountedPrice(price, 0.1);
        }

        return getDiscountedPrice(price, 0.2);
    }

    private int getDiscountedPrice(int price, double discount) {
        return (int) (price - (price * discount));
    }
}
