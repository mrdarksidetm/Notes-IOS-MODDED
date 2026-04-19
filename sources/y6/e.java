package y6;

import ae.r;
import android.app.Activity;
import android.content.Intent;
import le.d1;
import le.n0;
import le.o0;
import md.i0;
import md.u;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    @sd.d(c = "com.deepanshuchaudhary.pick_or_save.IntentsHandlersKt$processActionCreateDocument$1", f = "IntentsHandlers.kt", l = {}, m = "invokeSuspend")
    static final class a extends sd.j implements p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f23377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Intent f23378c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f23379d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, Intent intent, Activity activity, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f23377b = i10;
            this.f23378c = intent;
            this.f23379d = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new a(this.f23377b, this.f23378c, this.f23379d, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            rd.d.e();
            if (this.f23376a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            long jNanoTime = System.nanoTime();
            if (h.e() != null) {
                l.e(this.f23377b, this.f23378c, this.f23379d);
            }
            System.out.println((Object) ("Elapsed time in nanoseconds: " + (System.nanoTime() - jNanoTime)));
            return i0.f15558a;
        }
    }

    @sd.d(c = "com.deepanshuchaudhary.pick_or_save.IntentsHandlersKt$processActionOpenDocument$1", f = "IntentsHandlers.kt", l = {}, m = "invokeSuspend")
    static final class b extends sd.j implements p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f23381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Intent f23382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f23383d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, Intent intent, Activity activity, qd.d<? super b> dVar) {
            super(2, dVar);
            this.f23381b = i10;
            this.f23382c = intent;
            this.f23383d = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new b(this.f23381b, this.f23382c, this.f23383d, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((b) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            rd.d.e();
            if (this.f23380a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            long jNanoTime = System.nanoTime();
            if (h.d() != null) {
                f.j(this.f23381b, this.f23382c, this.f23383d);
            }
            System.out.println((Object) ("Elapsed time in nanoseconds: " + (System.nanoTime() - jNanoTime)));
            return i0.f15558a;
        }
    }

    @sd.d(c = "com.deepanshuchaudhary.pick_or_save.IntentsHandlersKt$processActionOpenDocumentTree$1", f = "IntentsHandlers.kt", l = {}, m = "invokeSuspend")
    static final class c extends sd.j implements p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f23385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Intent f23386c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f23387d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, Intent intent, Activity activity, qd.d<? super c> dVar) {
            super(2, dVar);
            this.f23385b = i10;
            this.f23386c = intent;
            this.f23387d = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new c(this.f23385b, this.f23386c, this.f23387d, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((c) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            rd.d.e();
            if (this.f23384a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            long jNanoTime = System.nanoTime();
            if (h.e() != null) {
                l.d(this.f23385b, this.f23386c, this.f23387d);
            } else if (h.d() != null) {
                f.i(this.f23385b, this.f23386c, this.f23387d);
            }
            System.out.println((Object) ("Elapsed time in nanoseconds: " + (System.nanoTime() - jNanoTime)));
            return i0.f15558a;
        }
    }

    public static final boolean a(int i10, Intent intent, Activity activity) {
        r.f(activity, "context");
        le.k.d(o0.a(d1.c()), null, null, new a(i10, intent, activity, null), 3, null);
        return true;
    }

    public static final boolean b(int i10, Intent intent, Activity activity) {
        r.f(activity, "context");
        le.k.d(o0.a(d1.c()), null, null, new b(i10, intent, activity, null), 3, null);
        return true;
    }

    public static final boolean c(int i10, Intent intent, Activity activity) {
        r.f(activity, "context");
        le.k.d(o0.a(d1.c()), null, null, new c(i10, intent, activity, null), 3, null);
        return true;
    }
}
