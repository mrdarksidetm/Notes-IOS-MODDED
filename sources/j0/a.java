package j0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import md.t;

/* JADX INFO: loaded from: classes.dex */
public final class a implements y1.k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f13602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private qd.d<? super md.i0> f13603c;

    /* JADX INFO: renamed from: j0.a$a, reason: collision with other inner class name */
    @sd.d(c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", f = "AwaitFirstLayoutModifier.kt", l = {R.styleable.AppCompatTheme_alertDialogButtonGroupStyle}, m = "waitForFirstLayout")
    static final class C0317a extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f13604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f13605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f13606c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f13608e;

        C0317a(qd.d<? super C0317a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13606c = obj;
            this.f13608e |= Integer.MIN_VALUE;
            return a.this.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(qd.d<? super md.i0> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof j0.a.C0317a
            if (r0 == 0) goto L13
            r0 = r5
            j0.a$a r0 = (j0.a.C0317a) r0
            int r1 = r0.f13608e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13608e = r1
            goto L18
        L13:
            j0.a$a r0 = new j0.a$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f13606c
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f13608e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f13605b
            qd.d r1 = (qd.d) r1
            java.lang.Object r0 = r0.f13604a
            j0.a r0 = (j0.a) r0
            md.u.b(r5)
            goto L64
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            md.u.b(r5)
            boolean r5 = r4.f13602b
            if (r5 != 0) goto L71
            qd.d<? super md.i0> r5 = r4.f13603c
            r0.f13604a = r4
            r0.f13605b = r5
            r0.f13608e = r3
            qd.i r2 = new qd.i
            qd.d r3 = rd.b.c(r0)
            r2.<init>(r3)
            r4.f13603c = r2
            java.lang.Object r2 = r2.a()
            java.lang.Object r3 = rd.b.e()
            if (r2 != r3) goto L60
            sd.f.c(r0)
        L60:
            if (r2 != r1) goto L63
            return r1
        L63:
            r1 = r5
        L64:
            if (r1 == 0) goto L71
            md.t$a r5 = md.t.f15576b
            md.i0 r5 = md.i0.f15558a
            java.lang.Object r5 = md.t.b(r5)
            r1.resumeWith(r5)
        L71:
            md.i0 r5 = md.i0.f15558a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.a.a(qd.d):java.lang.Object");
    }

    @Override // y1.k0
    public void l(y1.r rVar) {
        if (this.f13602b) {
            return;
        }
        this.f13602b = true;
        qd.d<? super md.i0> dVar = this.f13603c;
        if (dVar != null) {
            t.a aVar = md.t.f15576b;
            dVar.resumeWith(md.t.b(md.i0.f15558a));
        }
        this.f13603c = null;
    }
}
