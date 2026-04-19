package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d0 f3535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d0 f3536b;

    private static final class b extends d0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class<?> f3537c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j10) {
            return (List) i1.A(obj, j10);
        }

        private static <L> List<L> g(Object obj, long j10, int i10) {
            List<L> listG;
            Object obj2;
            List<L> listF = f(obj, j10);
            if (!listF.isEmpty()) {
                if (f3537c.isAssignableFrom(listF.getClass())) {
                    ArrayList arrayList = new ArrayList(listF.size() + i10);
                    arrayList.addAll(listF);
                    obj2 = arrayList;
                } else if (listF instanceof e4.i) {
                    c0 c0Var = new c0(listF.size() + i10);
                    c0Var.addAll((e4.i) listF);
                    obj2 = c0Var;
                } else {
                    if (!(listF instanceof u0) || !(listF instanceof y.i)) {
                        return listF;
                    }
                    y.i iVar = (y.i) listF;
                    if (iVar.p()) {
                        return listF;
                    }
                    listG = iVar.g(listF.size() + i10);
                }
                i1.O(obj, j10, obj2);
                return (List<L>) obj2;
            }
            listG = listF instanceof e4.d ? new c0(i10) : ((listF instanceof u0) && (listF instanceof y.i)) ? ((y.i) listF).g(i10) : new ArrayList<>(i10);
            i1.O(obj, j10, listG);
            return listG;
        }

        @Override // androidx.datastore.preferences.protobuf.d0
        void c(Object obj, long j10) {
            Object objUnmodifiableList;
            List list = (List) i1.A(obj, j10);
            if (list instanceof e4.d) {
                objUnmodifiableList = ((e4.d) list).j();
            } else {
                if (f3537c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof u0) && (list instanceof y.i)) {
                    y.i iVar = (y.i) list;
                    if (iVar.p()) {
                        iVar.e();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            i1.O(obj, j10, objUnmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.d0
        <E> void d(Object obj, Object obj2, long j10) {
            List listF = f(obj2, j10);
            List listG = g(obj, j10, listF.size());
            int size = listG.size();
            int size2 = listF.size();
            if (size > 0 && size2 > 0) {
                listG.addAll(listF);
            }
            if (size > 0) {
                listF = listG;
            }
            i1.O(obj, j10, listF);
        }

        @Override // androidx.datastore.preferences.protobuf.d0
        <L> List<L> e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    private static final class c extends d0 {
        private c() {
            super();
        }

        static <E> y.i<E> f(Object obj, long j10) {
            return (y.i) i1.A(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.d0
        void c(Object obj, long j10) {
            f(obj, j10).e();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r6v1, types: [androidx.datastore.preferences.protobuf.y$i, java.util.Collection, java.util.List] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v3 */
        @Override // androidx.datastore.preferences.protobuf.d0
        <E> void d(Object obj, Object obj2, long j10) {
            y.i iVarF = f(obj, j10);
            ?? F = f(obj2, j10);
            int size = iVarF.size();
            int size2 = F.size();
            ?? r02 = iVarF;
            r02 = iVarF;
            if (size > 0 && size2 > 0) {
                boolean zP = iVarF.p();
                ?? G = iVarF;
                if (!zP) {
                    G = iVarF.g(size2 + size);
                }
                G.addAll(F);
                r02 = G;
            }
            if (size > 0) {
                F = r02;
            }
            i1.O(obj, j10, F);
        }

        @Override // androidx.datastore.preferences.protobuf.d0
        <L> List<L> e(Object obj, long j10) {
            y.i iVarF = f(obj, j10);
            if (iVarF.p()) {
                return iVarF;
            }
            int size = iVarF.size();
            y.i iVarG = iVarF.g(size == 0 ? 10 : size * 2);
            i1.O(obj, j10, iVarG);
            return iVarG;
        }
    }

    static {
        f3535a = new b();
        f3536b = new c();
    }

    private d0() {
    }

    static d0 a() {
        return f3535a;
    }

    static d0 b() {
        return f3536b;
    }

    abstract void c(Object obj, long j10);

    abstract <L> void d(Object obj, Object obj2, long j10);

    abstract <L> List<L> e(Object obj, long j10);
}
