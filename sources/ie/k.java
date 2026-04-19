package ie;

import java.util.Iterator;
import md.i0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.p f12694a;

        public a(zd.p pVar) {
            this.f12694a = pVar;
        }

        @Override // ie.g
        public Iterator<T> iterator() {
            return k.a(this.f12694a);
        }
    }

    public static <T> Iterator<T> a(zd.p<? super i<? super T>, ? super qd.d<? super i0>, ? extends Object> pVar) {
        ae.r.f(pVar, "block");
        h hVar = new h();
        hVar.i(rd.c.a(pVar, hVar, hVar));
        return hVar;
    }

    public static <T> g<T> b(zd.p<? super i<? super T>, ? super qd.d<? super i0>, ? extends Object> pVar) {
        ae.r.f(pVar, "block");
        return new a(pVar);
    }
}
