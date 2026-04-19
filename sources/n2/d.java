package n2;

import android.content.Context;
import android.graphics.Typeface;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import md.t;
import n2.c0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f15776b;

    @sd.d(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", l = {R.styleable.AppCompatTheme_colorPrimary, R.styleable.AppCompatTheme_colorPrimaryDark}, m = "awaitLoad")
    static final class a extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f15778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f15779c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15781e;

        a(qd.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f15779c = obj;
            this.f15781e |= Integer.MIN_VALUE;
            return d.this.c(null, this);
        }
    }

    public d(Context context) {
        this.f15775a = context.getApplicationContext();
    }

    @Override // n2.n0
    public Object a() {
        return this.f15776b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // n2.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(n2.s r6, qd.d<? super android.graphics.Typeface> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof n2.d.a
            if (r0 == 0) goto L13
            r0 = r7
            n2.d$a r0 = (n2.d.a) r0
            int r1 = r0.f15781e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15781e = r1
            goto L18
        L13:
            n2.d$a r0 = new n2.d$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f15779c
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f15781e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f15778b
            n2.s r6 = (n2.s) r6
            java.lang.Object r0 = r0.f15777a
            n2.d r0 = (n2.d) r0
            md.u.b(r7)
            goto L70
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            md.u.b(r7)
            goto L58
        L40:
            md.u.b(r7)
            boolean r7 = r6 instanceof n2.b
            if (r7 == 0) goto L59
            n2.b r6 = (n2.b) r6
            n2.b$a r7 = r6.d()
            android.content.Context r2 = r5.f15775a
            r0.f15781e = r4
            java.lang.Object r7 = r7.a(r2, r6, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            return r7
        L59:
            boolean r7 = r6 instanceof n2.t0
            if (r7 == 0) goto L7f
            r7 = r6
            n2.t0 r7 = (n2.t0) r7
            android.content.Context r2 = r5.f15775a
            r0.f15777a = r5
            r0.f15778b = r6
            r0.f15781e = r3
            java.lang.Object r7 = n2.e.b(r7, r2, r0)
            if (r7 != r1) goto L6f
            return r1
        L6f:
            r0 = r5
        L70:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            n2.t0 r6 = (n2.t0) r6
            n2.h0$d r6 = r6.e()
            android.content.Context r0 = r0.f15775a
            android.graphics.Typeface r6 = n2.s0.c(r7, r6, r0)
            return r6
        L7f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown font type: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.d.c(n2.s, qd.d):java.lang.Object");
    }

    @Override // n2.n0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Typeface b(s sVar) {
        Object objB;
        Typeface typefaceC;
        if (sVar instanceof b) {
            b bVar = (b) sVar;
            return bVar.d().b(this.f15775a, bVar);
        }
        if (!(sVar instanceof t0)) {
            return null;
        }
        int iA = sVar.a();
        c0.a aVar = c0.f15768a;
        if (c0.e(iA, aVar.b())) {
            typefaceC = e.c((t0) sVar, this.f15775a);
        } else {
            if (!c0.e(iA, aVar.c())) {
                if (c0.e(iA, aVar.a())) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) c0.g(sVar.a())));
            }
            try {
                t.a aVar2 = md.t.f15576b;
                objB = md.t.b(e.c((t0) sVar, this.f15775a));
            } catch (Throwable th) {
                t.a aVar3 = md.t.f15576b;
                objB = md.t.b(md.u.a(th));
            }
            typefaceC = (Typeface) (md.t.g(objB) ? null : objB);
        }
        return s0.c(typefaceC, ((t0) sVar).e(), this.f15775a);
    }
}
