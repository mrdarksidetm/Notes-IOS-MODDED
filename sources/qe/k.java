package qe;

import java.util.concurrent.CancellationException;
import le.a2;
import le.e3;
import le.j1;
import le.y2;
import md.t;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h0 f19067a = new h0("UNDEFINED");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h0 f19068b = new h0("REUSABLE_CLAIMED");

    /* JADX WARN: Finally extract failed */
    public static final <T> void b(qd.d<? super T> dVar, Object obj, zd.l<? super Throwable, md.i0> lVar) {
        boolean z10;
        if (!(dVar instanceof j)) {
            dVar.resumeWith(obj);
            return;
        }
        j jVar = (j) dVar;
        Object objC = le.g0.c(obj, lVar);
        if (jVar.f19062d.i0(jVar.getContext())) {
            jVar.f19064f = objC;
            jVar.f14979c = 1;
            jVar.f19062d.g0(jVar.getContext(), jVar);
            return;
        }
        j1 j1VarB = y2.f15128a.b();
        if (j1VarB.r0()) {
            jVar.f19064f = objC;
            jVar.f14979c = 1;
            j1VarB.n0(jVar);
            return;
        }
        j1VarB.p0(true);
        try {
            a2 a2Var = (a2) jVar.getContext().get(a2.R);
            if (a2Var == null || a2Var.isActive()) {
                z10 = false;
            } else {
                CancellationException cancellationException = a2Var.getCancellationException();
                jVar.a(objC, cancellationException);
                t.a aVar = md.t.f15576b;
                jVar.resumeWith(md.t.b(md.u.a(cancellationException)));
                z10 = true;
            }
            if (!z10) {
                qd.d<T> dVar2 = jVar.f19063e;
                Object obj2 = jVar.f19065g;
                qd.g context = dVar2.getContext();
                Object objC2 = l0.c(context, obj2);
                e3<?> e3VarG = objC2 != l0.f19070a ? le.i0.g(dVar2, context, objC2) : null;
                try {
                    jVar.f19063e.resumeWith(obj);
                    md.i0 i0Var = md.i0.f15558a;
                    if (e3VarG == null || e3VarG.S0()) {
                        l0.a(context, objC2);
                    }
                } catch (Throwable th) {
                    if (e3VarG == null || e3VarG.S0()) {
                        l0.a(context, objC2);
                    }
                    throw th;
                }
            }
            while (j1VarB.u0()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void c(qd.d dVar, Object obj, zd.l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        b(dVar, obj, lVar);
    }

    public static final boolean d(j<? super md.i0> jVar) {
        md.i0 i0Var = md.i0.f15558a;
        j1 j1VarB = y2.f15128a.b();
        if (j1VarB.s0()) {
            return false;
        }
        if (j1VarB.r0()) {
            jVar.f19064f = i0Var;
            jVar.f14979c = 1;
            j1VarB.n0(jVar);
            return true;
        }
        j1VarB.p0(true);
        try {
            jVar.run();
            do {
            } while (j1VarB.u0());
        } finally {
            try {
            } finally {
            }
        }
        return false;
    }
}
