package com.kda.generic;

public final class PairUtil {

    public static <T extends Symbol> void swap(Pair pair) {

        K kNew = (K) pair.getK();
        pair.setK(pair.getV());
        pair.setV(kNew);

    }


}
