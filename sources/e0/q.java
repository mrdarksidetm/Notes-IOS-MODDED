package e0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.List;
import md.i0;
import v1.k0;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    @sd.d(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {R.styleable.AppCompatTheme_panelBackground}, m = "awaitAllPointersUp")
    static final class a extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f10430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f10431c;

        a(qd.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10430b = obj;
            this.f10431c |= Integer.MIN_VALUE;
            return q.b(null, this);
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", l = {R.styleable.AppCompatTheme_textAppearanceListItemSecondary, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle}, m = "invokeSuspend")
    static final class b extends sd.i implements zd.p<v1.c, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f10433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ qd.g f10434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.p<v1.c, qd.d<? super i0>, Object> f10435d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(qd.g gVar, zd.p<? super v1.c, ? super qd.d<? super i0>, ? extends Object> pVar, qd.d<? super b> dVar) {
            super(2, dVar);
            this.f10434c = gVar;
            this.f10435d = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            b bVar = new b(this.f10434c, this.f10435d, dVar);
            bVar.f10433b = obj;
            return bVar;
        }

        @Override // zd.p
        public final Object invoke(v1.c cVar, qd.d<? super i0> dVar) {
            return ((b) create(cVar, dVar)).invokeSuspend(i0.f15558a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, v1.c] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, v1.c] */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v8 */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0062 -> B:20:0x003f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0083 -> B:20:0x003f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = rd.b.e()
                int r1 = r8.f10432a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L37
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r8.f10433b
                v1.c r1 = (v1.c) r1
                md.u.b(r9)
                goto L28
            L19:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L21:
                java.lang.Object r1 = r8.f10433b
                v1.c r1 = (v1.c) r1
                md.u.b(r9)     // Catch: java.util.concurrent.CancellationException -> L33
            L28:
                r9 = r1
                goto L3e
            L2a:
                java.lang.Object r1 = r8.f10433b
                v1.c r1 = (v1.c) r1
                md.u.b(r9)     // Catch: java.util.concurrent.CancellationException -> L33
                r9 = r8
                goto L57
            L33:
                r9 = move-exception
                r5 = r1
                r1 = r8
                goto L70
            L37:
                md.u.b(r9)
                java.lang.Object r9 = r8.f10433b
                v1.c r9 = (v1.c) r9
            L3e:
                r1 = r8
            L3f:
                qd.g r5 = r1.f10434c
                boolean r5 = le.e2.o(r5)
                if (r5 == 0) goto L86
                zd.p<v1.c, qd.d<? super md.i0>, java.lang.Object> r5 = r1.f10435d     // Catch: java.util.concurrent.CancellationException -> L6c
                r1.f10433b = r9     // Catch: java.util.concurrent.CancellationException -> L6c
                r1.f10432a = r4     // Catch: java.util.concurrent.CancellationException -> L6c
                java.lang.Object r5 = r5.invoke(r9, r1)     // Catch: java.util.concurrent.CancellationException -> L6c
                if (r5 != r0) goto L54
                return r0
            L54:
                r7 = r1
                r1 = r9
                r9 = r7
            L57:
                r9.f10433b = r1     // Catch: java.util.concurrent.CancellationException -> L66
                r9.f10432a = r3     // Catch: java.util.concurrent.CancellationException -> L66
                java.lang.Object r5 = e0.q.b(r1, r9)     // Catch: java.util.concurrent.CancellationException -> L66
                if (r5 != r0) goto L62
                return r0
            L62:
                r7 = r1
                r1 = r9
                r9 = r7
                goto L3f
            L66:
                r5 = move-exception
                r7 = r1
                r1 = r9
                r9 = r5
                r5 = r7
                goto L70
            L6c:
                r5 = move-exception
                r7 = r5
                r5 = r9
                r9 = r7
            L70:
                qd.g r6 = r1.f10434c
                boolean r6 = le.e2.o(r6)
                if (r6 == 0) goto L85
                r1.f10433b = r5
                r1.f10432a = r2
                java.lang.Object r9 = e0.q.b(r5, r1)
                if (r9 != r0) goto L83
                return r0
            L83:
                r9 = r5
                goto L3f
            L85:
                throw r9
            L86:
                md.i0 r9 = md.i0.f15558a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: e0.q.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final boolean a(v1.c cVar) {
        List<v1.b0> listC = cVar.K().c();
        int size = listC.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (listC.get(i10).j()) {
                z10 = true;
                break;
            }
            i10++;
        }
        return !z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (a(r7) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        r8 = v1.r.Final;
        r0.f10429a = r7;
        r0.f10431c = 1;
        r8 = r7.J(r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r8 != r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r4 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        return md.i0.f15558a;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(v1.c r7, qd.d<? super md.i0> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof e0.q.a
            if (r0 == 0) goto L13
            r0 = r8
            e0.q$a r0 = (e0.q.a) r0
            int r1 = r0.f10431c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10431c = r1
            goto L18
        L13:
            e0.q$a r0 = new e0.q$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f10430b
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f10431c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f10429a
            v1.c r7 = (v1.c) r7
            md.u.b(r8)
            goto L4b
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            md.u.b(r8)
            boolean r8 = a(r7)
            if (r8 != 0) goto L6c
        L3e:
            v1.r r8 = v1.r.Final
            r0.f10429a = r7
            r0.f10431c = r3
            java.lang.Object r8 = r7.J(r8, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            v1.p r8 = (v1.p) r8
            java.util.List r8 = r8.c()
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L57:
            if (r5 >= r2) goto L6a
            java.lang.Object r6 = r8.get(r5)
            v1.b0 r6 = (v1.b0) r6
            boolean r6 = r6.j()
            if (r6 == 0) goto L67
            r4 = r3
            goto L6a
        L67:
            int r5 = r5 + 1
            goto L57
        L6a:
            if (r4 != 0) goto L3e
        L6c:
            md.i0 r7 = md.i0.f15558a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.q.b(v1.c, qd.d):java.lang.Object");
    }

    public static final Object c(k0 k0Var, zd.p<? super v1.c, ? super qd.d<? super i0>, ? extends Object> pVar, qd.d<? super i0> dVar) {
        Object objB0 = k0Var.B0(new b(dVar.getContext(), pVar, null), dVar);
        return objB0 == rd.d.e() ? objB0 : i0.f15558a;
    }
}
