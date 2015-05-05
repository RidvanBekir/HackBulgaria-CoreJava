package GiveMeTheMedian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MeanMode implements Statistics {

    private Map<Integer, Integer> map = new HashMap<>();
    private List<Integer> list;
    private float median = 0;
    private int mean = 0;
    private int range = 0;
    private int mode = 0;

    public MeanMode() {
        list = new ArrayList<Integer>();
    }

    @Override
    public float getMean() {
        return ((float) mean / list.size());
    }

    @Override
    public float getMedian() {
        return this.median;
    }

    @Override
    public int getRange() {
        return this.range;
    }

    @Override
    public int getMode() {
        Entry<Integer, Integer> max = null;
        for (Entry<Integer, Integer> e : map.entrySet()) {
            if (max == null || e.getValue() > max.getValue())
                max = e;
        }
        this.mode = max.getKey();
        return mode;
    }

    public void add(Integer i) {

        list.add(i);
        this.mean = mean + i;

        if (list.size() > 1) {
            if (i < list.get(list.size() - 2)) {
                Collections.sort(list);
            }
        }

        Integer val = map.get(i);
        if (val == null) {
            map.put(i, 1);
        } else
            map.put(i, val + 1);

        if (list.size() % 2 == 0) {
            this.median = (list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) / 2;
        } else
            this.median = list.get(list.size() / 2);

        this.range = list.get(list.size() - 1) - list.get(0);
    }

    @Override
    public String toString() {
        String result = "";
        if (list.isEmpty()) {
            return "List is empty";
        }
        for (Integer i : list) {
            result += i + " ";
        }
        return result;
    }
}
