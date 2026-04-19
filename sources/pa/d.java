package pa;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile d f18303b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<f> f18304a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f18303b;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f18303b;
                if (dVar == null) {
                    dVar = new d();
                    f18303b = dVar;
                }
            }
        }
        return dVar;
    }

    Set<f> b() {
        Set<f> setUnmodifiableSet;
        synchronized (this.f18304a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f18304a);
        }
        return setUnmodifiableSet;
    }
}
