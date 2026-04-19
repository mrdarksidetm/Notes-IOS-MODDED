package qd;

import ae.r;
import ae.s;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.Serializable;
import qd.g;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements g, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f19035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g.b f19036b;

    static final class a extends s implements p<String, g.b, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19037a = new a();

        a() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, g.b bVar) {
            r.f(str, "acc");
            r.f(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(g gVar, g.b bVar) {
        r.f(gVar, "left");
        r.f(bVar, "element");
        this.f19035a = gVar;
        this.f19036b = bVar;
    }

    private final boolean b(g.b bVar) {
        return r.b(get(bVar.getKey()), bVar);
    }

    private final boolean c(c cVar) {
        while (b(cVar.f19036b)) {
            g gVar = cVar.f19035a;
            if (!(gVar instanceof c)) {
                r.d(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return b((g.b) gVar);
            }
            cVar = (c) gVar;
        }
        return false;
    }

    private final int d() {
        int i10 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f19035a;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.d() != d() || !cVar.c(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // qd.g
    public <R> R fold(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        r.f(pVar, "operation");
        return pVar.invoke((Object) this.f19035a.fold(r10, pVar), this.f19036b);
    }

    @Override // qd.g
    public <E extends g.b> E get(g.c<E> cVar) {
        r.f(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
        c cVar2 = this;
        while (true) {
            E e10 = (E) cVar2.f19036b.get(cVar);
            if (e10 != null) {
                return e10;
            }
            g gVar = cVar2.f19035a;
            if (!(gVar instanceof c)) {
                return (E) gVar.get(cVar);
            }
            cVar2 = (c) gVar;
        }
    }

    public int hashCode() {
        return this.f19035a.hashCode() + this.f19036b.hashCode();
    }

    @Override // qd.g
    public g minusKey(g.c<?> cVar) {
        r.f(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
        if (this.f19036b.get(cVar) != null) {
            return this.f19035a;
        }
        g gVarMinusKey = this.f19035a.minusKey(cVar);
        return gVarMinusKey == this.f19035a ? this : gVarMinusKey == h.f19040a ? this.f19036b : new c(gVarMinusKey, this.f19036b);
    }

    @Override // qd.g
    public g plus(g gVar) {
        return g.a.a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) fold("", a.f19037a)) + ']';
    }
}
