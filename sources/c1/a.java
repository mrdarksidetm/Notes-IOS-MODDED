package c1;

import ae.n0;
import ae.r;
import ae.s;
import java.util.ArrayList;
import java.util.List;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: Add missing generic type declarations: [Original] */
    /* JADX INFO: renamed from: c1.a$a, reason: collision with other inner class name */
    static final class C0148a<Original> extends s implements p<l, Original, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p<l, Original, List<Saveable>> f6257a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0148a(p<? super l, ? super Original, ? extends List<? extends Saveable>> pVar) {
            super(2);
            this.f6257a = pVar;
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l lVar, Original original) {
            List list = (List) this.f6257a.invoke(lVar, original);
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                if (obj != null && !lVar.a(obj)) {
                    throw new IllegalArgumentException("item can't be saved".toString());
                }
            }
            if (!list.isEmpty()) {
                return new ArrayList(list);
            }
            return null;
        }
    }

    public static final <Original, Saveable> j<Original, Object> a(p<? super l, ? super Original, ? extends List<? extends Saveable>> pVar, zd.l<? super List<? extends Saveable>, ? extends Original> lVar) {
        C0148a c0148a = new C0148a(pVar);
        r.d(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return k.a(c0148a, (zd.l) n0.e(lVar, 1));
    }
}
