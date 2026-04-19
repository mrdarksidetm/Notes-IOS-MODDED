package te;

import ae.s;
import le.o;
import md.i0;
import qe.h0;
import zd.l;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q<Object, Object, Object, Object> f21391a = a.f21397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h0 f21392b = new h0("STATE_REG");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h0 f21393c = new h0("STATE_COMPLETED");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h0 f21394d = new h0("STATE_CANCELLED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h0 f21395e = new h0("NO_RESULT");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h0 f21396f = new h0("PARAM_CLAUSE_0");

    static final class a extends s implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21397a = new a();

        a() {
            super(3);
        }

        @Override // zd.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h a(int i10) {
        if (i10 == 0) {
            return h.SUCCESSFUL;
        }
        if (i10 == 1) {
            return h.REREGISTER;
        }
        if (i10 == 2) {
            return h.CANCELLED;
        }
        if (i10 == 3) {
            return h.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(o<? super i0> oVar, l<? super Throwable, i0> lVar) {
        Object objD = oVar.d(i0.f15558a, null, lVar);
        if (objD == null) {
            return false;
        }
        oVar.r(objD);
        return true;
    }
}
