package nd;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class x0 {
    public static <T> Set<T> a(T t10) {
        Set<T> setSingleton = Collections.singleton(t10);
        ae.r.e(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
