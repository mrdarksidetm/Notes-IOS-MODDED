package h8;

import android.util.SparseArray;
import java.util.HashMap;
import u7.d;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SparseArray<d> f11864a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap<d, Integer> f11865b;

    static {
        HashMap<d, Integer> map = new HashMap<>();
        f11865b = map;
        map.put(d.DEFAULT, 0);
        f11865b.put(d.VERY_LOW, 1);
        f11865b.put(d.HIGHEST, 2);
        for (d dVar : f11865b.keySet()) {
            f11864a.append(f11865b.get(dVar).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = f11865b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = f11864a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
