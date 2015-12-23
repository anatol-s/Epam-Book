package epam.book.p4.vb2.action.sort;

import epam.book.p4.vb2.entity.Candy;

import java.util.Comparator;

public class CandyWeightComparator implements Comparator<Candy> {

    @Override
    public int compare(Candy candy1, Candy candy2) {
        return candy1.getWeight() - candy2.getWeight();
    }
}
