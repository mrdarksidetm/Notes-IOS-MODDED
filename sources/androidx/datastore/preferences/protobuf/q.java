package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.k1;
import androidx.datastore.preferences.protobuf.w;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class q extends p<w.d> {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3728a;

        static {
            int[] iArr = new int[k1.b.values().length];
            f3728a = iArr;
            try {
                iArr[k1.b.f3663c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3728a[k1.b.f3664d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3728a[k1.b.f3665e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3728a[k1.b.f3666f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3728a[k1.b.f3667g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3728a[k1.b.f3668h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3728a[k1.b.f3669i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3728a[k1.b.f3670j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3728a[k1.b.f3675o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3728a[k1.b.f3677q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3728a[k1.b.f3678r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3728a[k1.b.f3679s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3728a[k1.b.f3680t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3728a[k1.b.f3676p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3728a[k1.b.f3674n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f3728a[k1.b.f3671k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f3728a[k1.b.f3672l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f3728a[k1.b.f3673m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    q() {
    }

    @Override // androidx.datastore.preferences.protobuf.p
    int a(Map.Entry<?, ?> entry) {
        return ((w.d) entry.getKey()).d();
    }

    @Override // androidx.datastore.preferences.protobuf.p
    Object b(o oVar, n0 n0Var, int i10) {
        return oVar.a(n0Var, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.p
    t<w.d> c(Object obj) {
        return ((w.c) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.p
    t<w.d> d(Object obj) {
        return ((w.c) obj).K();
    }

    @Override // androidx.datastore.preferences.protobuf.p
    boolean e(n0 n0Var) {
        return n0Var instanceof w.c;
    }

    @Override // androidx.datastore.preferences.protobuf.p
    void f(Object obj) {
        c(obj).t();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018f  */
    @Override // androidx.datastore.preferences.protobuf.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    <UT, UB> UB g(androidx.datastore.preferences.protobuf.y0 r5, java.lang.Object r6, androidx.datastore.preferences.protobuf.o r7, androidx.datastore.preferences.protobuf.t<androidx.datastore.preferences.protobuf.w.d> r8, UB r9, androidx.datastore.preferences.protobuf.f1<UT, UB> r10) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q.g(androidx.datastore.preferences.protobuf.y0, java.lang.Object, androidx.datastore.preferences.protobuf.o, androidx.datastore.preferences.protobuf.t, java.lang.Object, androidx.datastore.preferences.protobuf.f1):java.lang.Object");
    }

    @Override // androidx.datastore.preferences.protobuf.p
    void h(y0 y0Var, Object obj, o oVar, t<w.d> tVar) {
        w.e eVar = (w.e) obj;
        tVar.x(eVar.f3760b, y0Var.e(eVar.b().getClass(), oVar));
    }

    @Override // androidx.datastore.preferences.protobuf.p
    void i(g gVar, Object obj, o oVar, t<w.d> tVar) throws z {
        w.e eVar = (w.e) obj;
        n0 n0VarY = eVar.b().g().y();
        e eVarQ = e.Q(ByteBuffer.wrap(gVar.z()), true);
        v0.a().b(n0VarY, eVarQ, oVar);
        tVar.x(eVar.f3760b, n0VarY);
        if (eVarQ.A() != Integer.MAX_VALUE) {
            throw z.a();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p
    void j(l1 l1Var, Map.Entry<?, ?> entry) {
        w.d dVar = (w.d) entry.getKey();
        if (!dVar.e()) {
            switch (a.f3728a[dVar.f().ordinal()]) {
                case 1:
                    l1Var.e(dVar.d(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    l1Var.E(dVar.d(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    l1Var.p(dVar.d(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    l1Var.n(dVar.d(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                case 14:
                    l1Var.t(dVar.d(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    l1Var.h(dVar.d(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    l1Var.d(dVar.d(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    l1Var.q(dVar.d(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    l1Var.b(dVar.d(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    l1Var.r(dVar.d(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    l1Var.x(dVar.d(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    l1Var.M(dVar.d(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    l1Var.D(dVar.d(), ((Long) entry.getValue()).longValue());
                    break;
                case 15:
                    l1Var.w(dVar.d(), (g) entry.getValue());
                    break;
                case 16:
                    l1Var.m(dVar.d(), (String) entry.getValue());
                    break;
                case 17:
                    l1Var.O(dVar.d(), entry.getValue(), v0.a().d(entry.getValue().getClass()));
                    break;
                case 18:
                    l1Var.z(dVar.d(), entry.getValue(), v0.a().d(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f3728a[dVar.f().ordinal()]) {
            case 1:
                b1.P(dVar.d(), (List) entry.getValue(), l1Var, dVar.h());
                break;
            case 2:
                b1.T(dVar.d(), (List) entry.getValue(), l1Var, dVar.h());
                break;
            case 3:
                b1.W(dVar.d(), (List) entry.getValue(), l1Var, dVar.h());
                break;
            case 4:
                b1.e0(dVar.d(), (List) entry.getValue(), l1Var, dVar.h());
                break;
            case 5:
            case 14:
                b1.V(dVar.d(), (List) entry.getValue(), l1Var, dVar.h());
                break;
            case 6:
                b1.S(dVar.d(), (List) entry.getValue(), l1Var, dVar.h());
                break;
            case 7:
                b1.R(dVar.d(), (List) entry.getValue(), l1Var, dVar.h());
                break;
            case 8:
                b1.N(dVar.d(), (List) entry.getValue(), l1Var, dVar.h());
                break;
            case 9:
                b1.d0(dVar.d(), (List) entry.getValue(), l1Var, dVar.h());
                break;
            case 10:
                b1.Y(dVar.d(), (List) entry.getValue(), l1Var, dVar.h());
                break;
            case 11:
                b1.Z(dVar.d(), (List) entry.getValue(), l1Var, dVar.h());
                break;
            case 12:
                b1.a0(dVar.d(), (List) entry.getValue(), l1Var, dVar.h());
                break;
            case 13:
                b1.b0(dVar.d(), (List) entry.getValue(), l1Var, dVar.h());
                break;
            case 15:
                b1.O(dVar.d(), (List) entry.getValue(), l1Var);
                break;
            case 16:
                b1.c0(dVar.d(), (List) entry.getValue(), l1Var);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    b1.U(dVar.d(), (List) entry.getValue(), l1Var, v0.a().d(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    b1.X(dVar.d(), (List) entry.getValue(), l1Var, v0.a().d(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
