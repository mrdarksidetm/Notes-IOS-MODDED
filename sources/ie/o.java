package ie;

import ae.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nd.t;
import nd.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class o extends n {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements Iterable<T>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f12698a;

        public a(g gVar) {
            this.f12698a = gVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f12698a.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class b<T> extends s implements zd.l<T, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12699a = new b();

        b() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(T t10) {
            return Boolean.valueOf(t10 == null);
        }
    }

    public static <T> Iterable<T> j(g<? extends T> gVar) {
        ae.r.f(gVar, "<this>");
        return new a(gVar);
    }

    public static <T> int k(g<? extends T> gVar) {
        ae.r.f(gVar, "<this>");
        Iterator<? extends T> it = gVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                u.v();
            }
        }
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> g<T> l(g<? extends T> gVar, int i10) {
        ae.r.f(gVar, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? gVar : gVar instanceof c ? ((c) gVar).b(i10) : new ie.b(gVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final <T> g<T> m(g<? extends T> gVar, zd.l<? super T, Boolean> lVar) {
        ae.r.f(gVar, "<this>");
        ae.r.f(lVar, "predicate");
        return new e(gVar, false, lVar);
    }

    public static final <T> g<T> n(g<? extends T> gVar) {
        ae.r.f(gVar, "<this>");
        g<T> gVarM = m(gVar, b.f12699a);
        ae.r.d(gVarM, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return gVarM;
    }

    public static <T> T o(g<? extends T> gVar) {
        ae.r.f(gVar, "<this>");
        Iterator<? extends T> it = gVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final <T, A extends Appendable> A p(g<? extends T> gVar, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l<? super T, ? extends CharSequence> lVar) throws IOException {
        ae.r.f(gVar, "<this>");
        ae.r.f(a10, "buffer");
        ae.r.f(charSequence, "separator");
        ae.r.f(charSequence2, "prefix");
        ae.r.f(charSequence3, "postfix");
        ae.r.f(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : gVar) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            je.n.a(a10, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <T> String q(g<? extends T> gVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l<? super T, ? extends CharSequence> lVar) {
        ae.r.f(gVar, "<this>");
        ae.r.f(charSequence, "separator");
        ae.r.f(charSequence2, "prefix");
        ae.r.f(charSequence3, "postfix");
        ae.r.f(charSequence4, "truncated");
        String string = ((StringBuilder) p(gVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        ae.r.e(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String r(g gVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, zd.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return q(gVar, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static <T, R> g<R> s(g<? extends T> gVar, zd.l<? super T, ? extends R> lVar) {
        ae.r.f(gVar, "<this>");
        ae.r.f(lVar, "transform");
        return new r(gVar, lVar);
    }

    public static <T, R> g<R> t(g<? extends T> gVar, zd.l<? super T, ? extends R> lVar) {
        ae.r.f(gVar, "<this>");
        ae.r.f(lVar, "transform");
        return n(new r(gVar, lVar));
    }

    public static <T> g<T> u(g<? extends T> gVar, int i10) {
        ae.r.f(gVar, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? m.e() : gVar instanceof c ? ((c) gVar).a(i10) : new q(gVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T> List<T> v(g<? extends T> gVar) {
        ae.r.f(gVar, "<this>");
        Iterator<? extends T> it = gVar.iterator();
        if (!it.hasNext()) {
            return u.m();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return t.d(next);
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(next);
            if (!it.hasNext()) {
                return arrayList;
            }
            next = it.next();
        }
    }
}
