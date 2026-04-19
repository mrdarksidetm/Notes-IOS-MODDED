package rf;

import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
class t implements xf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f19574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19575b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedList<xf.a> f19576c = new LinkedList<>();

    t(char c10) {
        this.f19574a = c10;
    }

    private xf.a f(int i10) {
        for (xf.a aVar : this.f19576c) {
            if (aVar.c() <= i10) {
                return aVar;
            }
        }
        return this.f19576c.getFirst();
    }

    @Override // xf.a
    public char a() {
        return this.f19574a;
    }

    @Override // xf.a
    public int b(xf.b bVar, xf.b bVar2) {
        return f(bVar.length()).b(bVar, bVar2);
    }

    @Override // xf.a
    public int c() {
        return this.f19575b;
    }

    @Override // xf.a
    public char d() {
        return this.f19574a;
    }

    void e(xf.a aVar) {
        boolean z10;
        xf.a next;
        int iC;
        int iC2 = aVar.c();
        ListIterator<xf.a> listIterator = this.f19576c.listIterator();
        do {
            if (listIterator.hasNext()) {
                next = listIterator.next();
                iC = next.c();
                if (iC2 > iC) {
                    listIterator.previous();
                    listIterator.add(aVar);
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            if (z10) {
                return;
            }
            this.f19576c.add(aVar);
            this.f19575b = iC2;
            return;
        } while (iC2 != iC);
        throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f19574a + "' and minimum length " + iC2 + "; conflicting processors: " + next + ", " + aVar);
    }
}
