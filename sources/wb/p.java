package wb;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class p implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f22808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f22809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f22810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedList<k> f22811d = new LinkedList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<m> f22812e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<m> f22813f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<Integer, m> f22814g = new HashMap();

    p(String str, int i10, int i11) {
        this.f22808a = str;
        this.f22809b = i10;
        this.f22810c = i11;
    }

    private synchronized k g(m mVar) {
        k next;
        m mVar2;
        ListIterator<k> listIterator = this.f22811d.listIterator();
        do {
            if (!listIterator.hasNext()) {
                return null;
            }
            next = listIterator.next();
            mVar2 = next.a() != null ? this.f22814g.get(next.a()) : null;
            if (mVar2 == null) {
                break;
            }
        } while (mVar2 != mVar);
        listIterator.remove();
        return next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public synchronized void h(m mVar) {
        HashSet hashSet = new HashSet(this.f22812e);
        this.f22813f.remove(mVar);
        this.f22812e.add(mVar);
        if (!mVar.b() && mVar.d() != null) {
            this.f22814g.remove(mVar.d());
        }
        j(mVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            j((m) it.next());
        }
    }

    private synchronized void j(m mVar) {
        k kVarG = g(mVar);
        if (kVarG != null) {
            this.f22813f.add(mVar);
            this.f22812e.remove(mVar);
            if (kVarG.a() != null) {
                this.f22814g.put(kVarG.a(), mVar);
            }
            mVar.e(kVarG);
        }
    }

    @Override // wb.n
    public synchronized void c() {
        Iterator<m> it = this.f22812e.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        Iterator<m> it2 = this.f22813f.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
    }

    @Override // wb.n
    public synchronized void d(k kVar) {
        this.f22811d.add(kVar);
        Iterator it = new HashSet(this.f22812e).iterator();
        while (it.hasNext()) {
            j((m) it.next());
        }
    }

    protected m f(String str, int i10) {
        return new m(str, i10);
    }

    @Override // wb.n
    public synchronized void start() {
        for (int i10 = 0; i10 < this.f22809b; i10++) {
            final m mVarF = f(this.f22808a + i10, this.f22810c);
            mVarF.g(new Runnable() { // from class: wb.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22806a.h(mVarF);
                }
            });
            this.f22812e.add(mVarF);
        }
    }
}
