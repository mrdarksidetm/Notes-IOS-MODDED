package le;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    @sd.d(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {R.styleable.AppCompatTheme_colorControlHighlight}, m = "joinAll")
    static final class a extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f15017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f15018c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f15019d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15020e;

        a(qd.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f15019d = obj;
            this.f15020e |= Integer.MIN_VALUE;
            return f.c(null, this);
        }
    }

    @sd.d(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {R.styleable.AppCompatTheme_dropDownListViewStyle}, m = "joinAll")
    static final class b extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f15022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f15023c;

        b(qd.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f15022b = obj;
            this.f15023c |= Integer.MIN_VALUE;
            return f.b(null, this);
        }
    }

    public static final <T> Object a(u0<? extends T>[] u0VarArr, qd.d<? super List<? extends T>> dVar) {
        return u0VarArr.length == 0 ? nd.u.m() : new e(u0VarArr).c(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(java.util.Collection<? extends le.a2> r4, qd.d<? super md.i0> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof le.f.b
            if (r0 == 0) goto L13
            r0 = r5
            le.f$b r0 = (le.f.b) r0
            int r1 = r0.f15023c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15023c = r1
            goto L18
        L13:
            le.f$b r0 = new le.f$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f15022b
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f15023c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f15021a
            java.util.Iterator r4 = (java.util.Iterator) r4
            md.u.b(r5)
            goto L3c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            md.u.b(r5)
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.next()
            le.a2 r5 = (le.a2) r5
            r0.f15021a = r4
            r0.f15023c = r3
            java.lang.Object r5 = r5.join(r0)
            if (r5 != r1) goto L3c
            return r1
        L53:
            md.i0 r4 = md.i0.f15558a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: le.f.b(java.util.Collection, qd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0053 -> B:19:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(le.a2[] r6, qd.d<? super md.i0> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof le.f.a
            if (r0 == 0) goto L13
            r0 = r7
            le.f$a r0 = (le.f.a) r0
            int r1 = r0.f15020e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15020e = r1
            goto L18
        L13:
            le.f$a r0 = new le.f$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f15019d
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f15020e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r6 = r0.f15018c
            int r2 = r0.f15017b
            java.lang.Object r4 = r0.f15016a
            le.a2[] r4 = (le.a2[]) r4
            md.u.b(r7)
            r7 = r4
            goto L56
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            md.u.b(r7)
            r7 = 0
            int r2 = r6.length
            r5 = r7
            r7 = r6
            r6 = r2
            r2 = r5
        L43:
            if (r2 >= r6) goto L58
            r4 = r7[r2]
            r0.f15016a = r7
            r0.f15017b = r2
            r0.f15018c = r6
            r0.f15020e = r3
            java.lang.Object r4 = r4.join(r0)
            if (r4 != r1) goto L56
            return r1
        L56:
            int r2 = r2 + r3
            goto L43
        L58:
            md.i0 r6 = md.i0.f15558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: le.f.c(le.a2[], qd.d):java.lang.Object");
    }
}
