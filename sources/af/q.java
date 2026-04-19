package af;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q<E, C extends Collection<? extends E>, B> extends p<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(we.b<E> bVar) {
        super(bVar, null);
        ae.r.f(bVar, "element");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Iterator<E> d(C c10) {
        ae.r.f(c10, "<this>");
        return c10.iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int e(C c10) {
        ae.r.f(c10, "<this>");
        return c10.size();
    }
}
