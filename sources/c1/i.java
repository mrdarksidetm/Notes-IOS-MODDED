package c1;

import ae.s;
import java.util.List;
import java.util.Map;
import t0.a2;
import t0.v;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a2<g> f6302a = v.e(a.f6303a);

    static final class a extends s implements zd.a<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6303a = new a();

        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            return null;
        }
    }

    public static final g a(Map<String, ? extends List<? extends Object>> map, zd.l<Object, Boolean> lVar) {
        return new h(map, lVar);
    }

    public static final a2<g> b() {
        return f6302a;
    }
}
