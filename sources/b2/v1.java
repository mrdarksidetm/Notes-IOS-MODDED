package b2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v1 implements ie.g<u1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<u1> f5420a = new ArrayList();

    public final void c(String str, Object obj) {
        this.f5420a.add(new u1(str, obj));
    }

    @Override // ie.g
    public Iterator<u1> iterator() {
        return this.f5420a.iterator();
    }
}
