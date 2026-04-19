package ie;

import ae.s;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class m extends l {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f12695a;

        public a(Iterator it) {
            this.f12695a = it;
        }

        @Override // ie.g
        public Iterator<T> iterator() {
            return this.f12695a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class b<T> extends s implements zd.l<T, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.a<T> f12696a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(zd.a<? extends T> aVar) {
            super(1);
            this.f12696a = aVar;
        }

        @Override // zd.l
        public final T invoke(T t10) {
            ae.r.f(t10, "it");
            return this.f12696a.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class c<T> extends s implements zd.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ T f12697a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(T t10) {
            super(0);
            this.f12697a = t10;
        }

        @Override // zd.a
        public final T invoke() {
            return this.f12697a;
        }
    }

    public static <T> g<T> c(Iterator<? extends T> it) {
        ae.r.f(it, "<this>");
        return d(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> g<T> d(g<? extends T> gVar) {
        ae.r.f(gVar, "<this>");
        return gVar instanceof ie.a ? gVar : new ie.a(gVar);
    }

    public static <T> g<T> e() {
        return d.f12677a;
    }

    public static <T> g<T> f(T t10, zd.l<? super T, ? extends T> lVar) {
        ae.r.f(lVar, "nextFunction");
        return t10 == null ? d.f12677a : new f(new c(t10), lVar);
    }

    public static <T> g<T> g(zd.a<? extends T> aVar) {
        ae.r.f(aVar, "nextFunction");
        return d(new f(aVar, new b(aVar)));
    }

    public static <T> g<T> h(zd.a<? extends T> aVar, zd.l<? super T, ? extends T> lVar) {
        ae.r.f(aVar, "seedFunction");
        ae.r.f(lVar, "nextFunction");
        return new f(aVar, lVar);
    }

    public static <T> g<T> i(T... tArr) {
        ae.r.f(tArr, "elements");
        return tArr.length == 0 ? e() : nd.p.B(tArr);
    }
}
