package t0;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class m3 implements Iterator<e1.b>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s2 f20868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q0 f20869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20871d;

    public m3(s2 s2Var, q0 q0Var) {
        this.f20868a = s2Var;
        this.f20869b = q0Var;
        this.f20870c = s2Var.w();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e1.b next() {
        Object obj;
        ArrayList<Object> arrayListC = this.f20869b.c();
        if (arrayListC != null) {
            int i10 = this.f20871d;
            this.f20871d = i10 + 1;
            obj = arrayListC.get(i10);
        } else {
            obj = null;
        }
        if (obj instanceof d) {
            return new t2(this.f20868a, ((d) obj).a(), this.f20870c);
        }
        if (obj instanceof q0) {
            return new n3(this.f20868a, (q0) obj);
        }
        o.u("Unexpected group information structure");
        throw new md.i();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList<Object> arrayListC = this.f20869b.c();
        return arrayListC != null && this.f20871d < arrayListC.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
