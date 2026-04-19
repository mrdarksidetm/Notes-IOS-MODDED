package o0;

import ae.s;
import java.util.Map;
import t0.a2;
import t0.v;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a2<i> f16250a = v.d(null, a.f16251a, 1, null);

    static final class a extends s implements zd.a<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16251a = new a();

        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i invoke() {
            return null;
        }
    }

    public static final a2<i> a() {
        return f16250a;
    }

    public static final boolean b(i iVar, long j10) {
        Map<Long, e> mapF;
        if (iVar == null || (mapF = iVar.f()) == null) {
            return false;
        }
        return mapF.containsKey(Long.valueOf(j10));
    }
}
