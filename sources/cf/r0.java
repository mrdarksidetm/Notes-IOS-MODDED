package cf;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cf.a f6980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f6981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6982c;

    @sd.d(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {R.styleable.AppCompatTheme_toolbarNavigationButtonStyle}, m = "invokeSuspend")
    static final class a extends sd.i implements zd.q<md.c<md.i0, bf.h>, md.i0, qd.d<? super bf.h>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f6983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f6984b;

        a(qd.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // zd.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(md.c<md.i0, bf.h> cVar, md.i0 i0Var, qd.d<? super bf.h> dVar) {
            a aVar = r0.this.new a(dVar);
            aVar.f6984b = cVar;
            return aVar.invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f6983a;
            if (i10 == 0) {
                md.u.b(obj);
                md.c cVar = (md.c) this.f6984b;
                byte bE = r0.this.f6980a.E();
                if (bE == 1) {
                    return r0.this.j(true);
                }
                if (bE == 0) {
                    return r0.this.j(false);
                }
                if (bE != 6) {
                    if (bE == 8) {
                        return r0.this.f();
                    }
                    cf.a.y(r0.this.f6980a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new md.i();
                }
                r0 r0Var = r0.this;
                this.f6983a = 1;
                obj = r0Var.i(cVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
            }
            return (bf.h) obj;
        }
    }

    @sd.d(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {23}, m = "readObject")
    static final class b extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f6986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f6987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f6988c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f6989d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f6990e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f6992g;

        b(qd.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6990e = obj;
            this.f6992g |= Integer.MIN_VALUE;
            return r0.this.i(null, this);
        }
    }

    public r0(bf.f fVar, cf.a aVar) {
        ae.r.f(fVar, "configuration");
        ae.r.f(aVar, "lexer");
        this.f6980a = aVar;
        this.f6981b = fVar.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bf.h f() {
        byte bM = this.f6980a.m();
        if (this.f6980a.E() == 4) {
            cf.a.y(this.f6980a, "Unexpected leading comma", 0, null, 6, null);
            throw new md.i();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f6980a.f()) {
            arrayList.add(e());
            bM = this.f6980a.m();
            if (bM != 4) {
                cf.a aVar = this.f6980a;
                boolean z10 = bM == 9;
                int i10 = aVar.f6912a;
                if (!z10) {
                    cf.a.y(aVar, "Expected end of the array or comma", i10, null, 4, null);
                    throw new md.i();
                }
            }
        }
        if (bM == 8) {
            this.f6980a.n((byte) 9);
        } else if (bM == 4) {
            cf.a.y(this.f6980a, "Unexpected trailing comma", 0, null, 6, null);
            throw new md.i();
        }
        return new bf.b(arrayList);
    }

    private final bf.h g() {
        return (bf.h) md.b.b(new md.a(new a(null)), md.i0.f15558a);
    }

    private final bf.h h() {
        byte bN = this.f6980a.n((byte) 6);
        if (this.f6980a.E() == 4) {
            cf.a.y(this.f6980a, "Unexpected leading comma", 0, null, 6, null);
            throw new md.i();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.f6980a.f()) {
                break;
            }
            String strS = this.f6981b ? this.f6980a.s() : this.f6980a.q();
            this.f6980a.n((byte) 5);
            linkedHashMap.put(strS, e());
            bN = this.f6980a.m();
            if (bN != 4) {
                if (bN != 7) {
                    cf.a.y(this.f6980a, "Expected end of the object or comma", 0, null, 6, null);
                    throw new md.i();
                }
            }
        }
        if (bN == 6) {
            this.f6980a.n((byte) 7);
        } else if (bN == 4) {
            cf.a.y(this.f6980a, "Unexpected trailing comma", 0, null, 6, null);
            throw new md.i();
        }
        return new bf.u(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009c -> B:27:0x00a6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(md.c<md.i0, bf.h> r21, qd.d<? super bf.h> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cf.r0.i(md.c, qd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bf.w j(boolean z10) {
        String strS = (this.f6981b || !z10) ? this.f6980a.s() : this.f6980a.q();
        return (z10 || !ae.r.b(strS, "null")) ? new bf.o(strS, z10, null, 4, null) : bf.s.INSTANCE;
    }

    public final bf.h e() {
        byte bE = this.f6980a.E();
        if (bE == 1) {
            return j(true);
        }
        if (bE == 0) {
            return j(false);
        }
        if (bE == 6) {
            int i10 = this.f6982c + 1;
            this.f6982c = i10;
            this.f6982c--;
            return i10 == 200 ? g() : h();
        }
        if (bE == 8) {
            return f();
        }
        cf.a.y(this.f6980a, "Cannot begin reading element, unexpected token: " + ((int) bE), 0, null, 6, null);
        throw new md.i();
    }
}
