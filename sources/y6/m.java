package y6;

import ae.h0;
import ae.r;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import je.v;
import je.w;
import je.y;
import le.a2;
import le.d1;
import le.j0;
import le.n0;
import md.i0;
import md.u;
import sc.j;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23455a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23456b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23457c = 3;

    @sd.d(c = "com.deepanshuchaudhary.pick_or_save.Utils", f = "Utils.kt", l = {R.styleable.AppCompatTheme_selectableItemBackgroundBorderless}, m = "copyFileToCacheDirOnBackground")
    static final class a extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f23458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f23459b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f23461d;

        a(qd.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23459b = obj;
            this.f23461d |= Integer.MIN_VALUE;
            return m.this.i(null, null, null, null, this);
        }
    }

    @sd.d(c = "com.deepanshuchaudhary.pick_or_save.Utils$copyFileToCacheDirOnBackground$2", f = "Utils.kt", l = {R.styleable.AppCompatTheme_textAppearanceLargePopupMenu}, m = "invokeSuspend")
    static final class b extends sd.j implements p<n0, qd.d<? super Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0<String> f23463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f23464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j.d f23465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f23466e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Uri f23467f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f23468g;

        @sd.d(c = "com.deepanshuchaudhary.pick_or_save.Utils$copyFileToCacheDirOnBackground$2$filePath$1", f = "Utils.kt", l = {}, m = "invokeSuspend")
        static final class a extends sd.j implements p<n0, qd.d<? super String>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f23469a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f23470b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f23471c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Uri f23472d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f23473e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, Context context, Uri uri, String str, qd.d<? super a> dVar) {
                super(2, dVar);
                this.f23470b = mVar;
                this.f23471c = context;
                this.f23472d = uri;
                this.f23473e = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                return new a(this.f23470b, this.f23471c, this.f23472d, this.f23473e, dVar);
            }

            @Override // zd.p
            public final Object invoke(n0 n0Var, qd.d<? super String> dVar) {
                return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                rd.d.e();
                if (this.f23469a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return this.f23470b.h(this.f23471c, this.f23472d, this.f23473e);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h0<String> h0Var, m mVar, j.d dVar, Context context, Uri uri, String str, qd.d<? super b> dVar2) {
            super(2, dVar2);
            this.f23463b = h0Var;
            this.f23464c = mVar;
            this.f23465d = dVar;
            this.f23466e = context;
            this.f23467f = uri;
            this.f23468g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new b(this.f23463b, this.f23464c, this.f23465d, this.f23466e, this.f23467f, this.f23468g, dVar);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ Object invoke(n0 n0Var, qd.d<? super Object> dVar) {
            return invoke2(n0Var, (qd.d<Object>) dVar);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(n0 n0Var, qd.d<Object> dVar) {
            return ((b) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v9, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f23462a;
            try {
                if (i10 == 0) {
                    u.b(obj);
                    Log.d("PickOrSavePlugin", "Launch...");
                    Log.d("PickOrSavePlugin", "Copy on background...");
                    j0 j0VarB = d1.b();
                    a aVar = new a(this.f23464c, this.f23466e, this.f23467f, this.f23468g, null);
                    this.f23462a = 1;
                    obj = le.i.g(j0VarB, aVar, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                ?? r13 = (String) obj;
                Log.d("PickOrSavePlugin", "...copied on background, result: " + ((String) r13));
                this.f23463b.f712a = r13;
                return sd.a.d(Log.d("PickOrSavePlugin", "...launch"));
            } catch (Error | Exception e10) {
                Log.e("PickOrSavePlugin", "copyFileToCacheDirOnBackground failed", e10);
                this.f23464c.m("file_copy_failed", e10.getLocalizedMessage(), e10.toString(), this.f23465d);
                return i0.f15558a;
            }
        }
    }

    @sd.d(c = "com.deepanshuchaudhary.pick_or_save.Utils", f = "Utils.kt", l = {131}, m = "copyMultipleFilesToCacheDirOnBackground")
    static final class c extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f23474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f23475b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f23477d;

        c(qd.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23475b = obj;
            this.f23477d |= Integer.MIN_VALUE;
            return m.this.j(null, null, null, null, this);
        }
    }

    @sd.d(c = "com.deepanshuchaudhary.pick_or_save.Utils$copyMultipleFilesToCacheDirOnBackground$2", f = "Utils.kt", l = {140}, m = "invokeSuspend")
    static final class d extends sd.j implements p<n0, qd.d<? super Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f23478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f23479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f23480c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f23481d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f23482e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f23483f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f23484g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f23485h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f23486i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f23487j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ List<String> f23488k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ h0<List<String>> f23489l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ m f23490m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ j.d f23491n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ List<Uri> f23492o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Context f23493p;

        @sd.d(c = "com.deepanshuchaudhary.pick_or_save.Utils$copyMultipleFilesToCacheDirOnBackground$2$1$1", f = "Utils.kt", l = {}, m = "invokeSuspend")
        static final class a extends sd.j implements p<n0, qd.d<? super String>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f23494a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f23495b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f23496c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Uri f23497d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f23498e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, Context context, Uri uri, String str, qd.d<? super a> dVar) {
                super(2, dVar);
                this.f23495b = mVar;
                this.f23496c = context;
                this.f23497d = uri;
                this.f23498e = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                return new a(this.f23495b, this.f23496c, this.f23497d, this.f23498e, dVar);
            }

            @Override // zd.p
            public final Object invoke(n0 n0Var, qd.d<? super String> dVar) {
                return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                rd.d.e();
                if (this.f23494a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return this.f23495b.h(this.f23496c, this.f23497d, this.f23498e);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(List<String> list, h0<List<String>> h0Var, m mVar, j.d dVar, List<? extends Uri> list2, Context context, qd.d<? super d> dVar2) {
            super(2, dVar2);
            this.f23488k = list;
            this.f23489l = h0Var;
            this.f23490m = mVar;
            this.f23491n = dVar;
            this.f23492o = list2;
            this.f23493p = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new d(this.f23488k, this.f23489l, this.f23490m, this.f23491n, this.f23492o, this.f23493p, dVar);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ Object invoke(n0 n0Var, qd.d<? super Object> dVar) {
            return invoke2(n0Var, (qd.d<Object>) dVar);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(n0 n0Var, qd.d<Object> dVar) {
            return ((d) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x009b A[Catch: Error -> 0x0142, Exception -> 0x0147, TRY_LEAVE, TryCatch #6 {Error -> 0x0142, Exception -> 0x0147, blocks: (B:19:0x0095, B:21:0x009b), top: B:63:0x0095 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0114  */
        /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.StringBuilder] */
        /* JADX WARN: Type inference failed for: r14v3 */
        /* JADX WARN: Type inference failed for: r14v4 */
        /* JADX WARN: Type inference failed for: r14v8 */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v4, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v9 */
        /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f2 -> B:59:0x00f7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 384
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: y6.m.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @sd.d(c = "com.deepanshuchaudhary.pick_or_save.Utils", f = "Utils.kt", l = {204}, m = "saveFileOnBackground")
    static final class e extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f23499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f23500b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f23502d;

        e(qd.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23500b = obj;
            this.f23502d |= Integer.MIN_VALUE;
            return m.this.v(null, null, null, null, this);
        }
    }

    @sd.d(c = "com.deepanshuchaudhary.pick_or_save.Utils$saveFileOnBackground$2", f = "Utils.kt", l = {209}, m = "invokeSuspend")
    static final class f extends sd.j implements p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f23503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f23504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f23505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ y6.c f23506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h0<String> f23507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ m f23508f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j.d f23509g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Uri f23510h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Context f23511i;

        @sd.d(c = "com.deepanshuchaudhary.pick_or_save.Utils$saveFileOnBackground$2$filePath$1", f = "Utils.kt", l = {}, m = "invokeSuspend")
        static final class a extends sd.j implements p<n0, qd.d<? super String>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f23512a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f23513b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ File f23514c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Uri f23515d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Context f23516e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, File file, Uri uri, Context context, qd.d<? super a> dVar) {
                super(2, dVar);
                this.f23513b = mVar;
                this.f23514c = file;
                this.f23515d = uri;
                this.f23516e = context;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                return new a(this.f23513b, this.f23514c, this.f23515d, this.f23516e, dVar);
            }

            @Override // zd.p
            public final Object invoke(n0 n0Var, qd.d<? super String> dVar) {
                return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                rd.d.e();
                if (this.f23512a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return this.f23513b.u(this.f23514c, this.f23515d, this.f23516e);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(y6.c cVar, h0<String> h0Var, m mVar, j.d dVar, Uri uri, Context context, qd.d<? super f> dVar2) {
            super(2, dVar2);
            this.f23506d = cVar;
            this.f23507e = h0Var;
            this.f23508f = mVar;
            this.f23509g = dVar;
            this.f23510h = uri;
            this.f23511i = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new f(this.f23506d, this.f23507e, this.f23508f, this.f23509g, this.f23510h, this.f23511i, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((f) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0130  */
        /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.StringBuilder] */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.io.File] */
        /* JADX WARN: Type inference failed for: r5v13 */
        /* JADX WARN: Type inference failed for: r5v17, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v2 */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 330
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: y6.m.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @sd.d(c = "com.deepanshuchaudhary.pick_or_save.Utils", f = "Utils.kt", l = {247}, m = "saveMultipleFilesOnBackground")
    static final class g extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f23517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f23518b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f23520d;

        g(qd.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23518b = obj;
            this.f23520d |= Integer.MIN_VALUE;
            return m.this.w(null, null, null, null, this);
        }
    }

    @sd.d(c = "com.deepanshuchaudhary.pick_or_save.Utils$saveMultipleFilesOnBackground$2", f = "Utils.kt", l = {254, 264}, m = "invokeSuspend")
    static final class h extends sd.j implements p<n0, qd.d<? super Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f23521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f23522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f23523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f23524d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f23525e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f23526f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f23527g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f23528h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f23529i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f23530j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f23531k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ Context f23532l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Uri f23533m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List<y6.c> f23534n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ List<String> f23535o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ m f23536p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ j.d f23537q;

        @sd.d(c = "com.deepanshuchaudhary.pick_or_save.Utils$saveMultipleFilesOnBackground$2$1$1", f = "Utils.kt", l = {}, m = "invokeSuspend")
        static final class a extends sd.j implements p<n0, qd.d<? super String>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f23538a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f23539b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ File f23540c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Uri f23541d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Context f23542e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, File file, Uri uri, Context context, qd.d<? super a> dVar) {
                super(2, dVar);
                this.f23539b = mVar;
                this.f23540c = file;
                this.f23541d = uri;
                this.f23542e = context;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                return new a(this.f23539b, this.f23540c, this.f23541d, this.f23542e, dVar);
            }

            @Override // zd.p
            public final Object invoke(n0 n0Var, qd.d<? super String> dVar) {
                return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                rd.d.e();
                if (this.f23538a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return this.f23539b.u(this.f23540c, this.f23541d, this.f23542e);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Context context, Uri uri, List<y6.c> list, List<String> list2, m mVar, j.d dVar, qd.d<? super h> dVar2) {
            super(2, dVar2);
            this.f23532l = context;
            this.f23533m = uri;
            this.f23534n = list;
            this.f23535o = list2;
            this.f23536p = mVar;
            this.f23537q = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new h(this.f23532l, this.f23533m, this.f23534n, this.f23535o, this.f23536p, this.f23537q, dVar);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ Object invoke(n0 n0Var, qd.d<? super Object> dVar) {
            return invoke2(n0Var, (qd.d<Object>) dVar);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(n0 n0Var, qd.d<Object> dVar) {
            return ((h) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x02e6  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x035a  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x03b5  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00cc A[Catch: Error -> 0x022a, Exception -> 0x022d, SecurityException -> 0x0230, all -> 0x0397, TRY_LEAVE, TryCatch #16 {all -> 0x0397, blocks: (B:29:0x00c6, B:31:0x00cc, B:93:0x0242, B:103:0x02b5, B:113:0x0325, B:69:0x01af), top: B:131:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0165 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x01ad  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0275  */
        /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0175 -> B:132:0x00c6). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1010
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: y6.m.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final String f(String str) {
        if (str != null) {
            return new je.j("[\\\\/:*?\"<>|\\[\\]]").f(str, "_");
        }
        return null;
    }

    private final void g(j.d dVar) {
        if (r.b(dVar, y6.h.b()) && y6.h.b() != null) {
            y6.h.g(null);
            System.out.println((Object) "directoryDocumentsPickingResult result cleared");
        }
        if (r.b(dVar, y6.h.d()) && y6.h.d() != null) {
            y6.h.i(null);
            System.out.println((Object) "filePicking result cleared");
        }
        if (r.b(dVar, y6.h.e()) && y6.h.e() != null) {
            y6.h.j(null);
            System.out.println((Object) "fileSaving result cleared");
        }
        if (r.b(dVar, y6.h.c()) && y6.h.c() != null) {
            y6.h.h(null);
            System.out.println((Object) "fileMetadata result cleared");
        }
        if (!r.b(dVar, y6.h.a()) || y6.h.a() == null) {
            return;
        }
        y6.h.f(null);
        System.out.println((Object) "cacheFilePathFromUri result cleared");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String h(Context context, Uri uri, String str) throws IOException {
        String str2 = com.amazon.a.a.o.c.a.b.f7490a + n(str);
        File fileCreateTempFile = File.createTempFile(y.Y0(str, str2.length()) + com.amazon.a.a.o.c.a.b.f7490a, str2);
        Log.d("PickOrSavePlugin", "Copying '" + uri + "' to '" + fileCreateTempFile.getPath() + '\'');
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        try {
            r.c(fileCreateTempFile);
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            try {
                r.c(inputStreamOpenInputStream);
                long jB = xd.a.b(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                i0 i0Var = i0.f15558a;
                xd.b.a(fileOutputStream, null);
                xd.b.a(inputStreamOpenInputStream, null);
                Log.d("PickOrSavePlugin", "Successfully copied file to '" + fileCreateTempFile.getAbsolutePath() + ", bytes=" + jB + '\'');
                String absolutePath = fileCreateTempFile.getAbsolutePath();
                r.e(absolutePath, "getAbsolutePath(...)");
                return absolutePath;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String u(File file, Uri uri, Context context) throws IOException {
        Log.d("PickOrSavePlugin", "Saving file '" + file.getPath() + "' to '" + uri.getPath() + '\'');
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri);
            try {
                r.d(outputStreamOpenOutputStream, "null cannot be cast to non-null type java.io.FileOutputStream");
                ((FileOutputStream) outputStreamOpenOutputStream).getChannel().truncate(0L);
                xd.a.b(fileInputStream, outputStreamOpenOutputStream, 0, 2, null);
                xd.b.a(outputStreamOpenOutputStream, null);
                xd.b.a(fileInputStream, null);
                Log.d("PickOrSavePlugin", "Saved file to '" + uri.getPath() + '\'');
                String path = uri.getPath();
                r.c(path);
                return path;
            } finally {
            }
        } finally {
        }
    }

    public final void c(List<String> list, Intent intent) {
        r.f(intent, "intent");
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) list.toArray(new String[0]));
    }

    public final void d() {
        a2 a2VarC = y6.f.c();
        if (a2VarC != null) {
            a2.a.b(a2VarC, null, 1, null);
        }
        Log.d("PickOrSavePlugin", "Canceled directoryDocumentsPicker");
    }

    public final void e() {
        a2 a2VarC = l.c();
        if (a2VarC != null) {
            a2.a.b(a2VarC, null, 1, null);
        }
        Log.d("PickOrSavePlugin", "Canceled File Saving");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(android.content.Context r16, android.net.Uri r17, java.lang.String r18, sc.j.d r19, qd.d<? super java.lang.String> r20) {
        /*
            r15 = this;
            r0 = r20
            boolean r1 = r0 instanceof y6.m.a
            if (r1 == 0) goto L16
            r1 = r0
            y6.m$a r1 = (y6.m.a) r1
            int r2 = r1.f23461d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f23461d = r2
            r10 = r15
            goto L1c
        L16:
            y6.m$a r1 = new y6.m$a
            r10 = r15
            r1.<init>(r0)
        L1c:
            java.lang.Object r0 = r1.f23459b
            java.lang.Object r11 = rd.b.e()
            int r2 = r1.f23461d
            r12 = 1
            if (r2 == 0) goto L39
            if (r2 != r12) goto L31
            java.lang.Object r1 = r1.f23458a
            ae.h0 r1 = (ae.h0) r1
            md.u.b(r0)
            goto L6a
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            md.u.b(r0)
            ae.h0 r0 = new ae.h0
            r0.<init>()
            le.m2 r2 = le.d1.c()
            le.n0 r2 = le.o0.a(r2)
            qd.g r13 = r2.getCoroutineContext()
            y6.m$b r14 = new y6.m$b
            r9 = 0
            r2 = r14
            r3 = r0
            r4 = r15
            r5 = r19
            r6 = r16
            r7 = r17
            r8 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1.f23458a = r0
            r1.f23461d = r12
            java.lang.Object r1 = le.i.g(r13, r14, r1)
            if (r1 != r11) goto L69
            return r11
        L69:
            r1 = r0
        L6a:
            T r0 = r1.f712a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.m.i(android.content.Context, android.net.Uri, java.lang.String, sc.j$d, qd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(android.content.Context r16, java.util.List<? extends android.net.Uri> r17, java.util.List<java.lang.String> r18, sc.j.d r19, qd.d<? super java.util.List<java.lang.String>> r20) {
        /*
            r15 = this;
            r0 = r20
            boolean r1 = r0 instanceof y6.m.c
            if (r1 == 0) goto L16
            r1 = r0
            y6.m$c r1 = (y6.m.c) r1
            int r2 = r1.f23477d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f23477d = r2
            r10 = r15
            goto L1c
        L16:
            y6.m$c r1 = new y6.m$c
            r10 = r15
            r1.<init>(r0)
        L1c:
            java.lang.Object r0 = r1.f23475b
            java.lang.Object r11 = rd.b.e()
            int r2 = r1.f23477d
            r12 = 1
            if (r2 == 0) goto L39
            if (r2 != r12) goto L31
            java.lang.Object r1 = r1.f23474a
            ae.h0 r1 = (ae.h0) r1
            md.u.b(r0)
            goto L6a
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            md.u.b(r0)
            ae.h0 r0 = new ae.h0
            r0.<init>()
            le.m2 r2 = le.d1.c()
            le.n0 r2 = le.o0.a(r2)
            qd.g r13 = r2.getCoroutineContext()
            y6.m$d r14 = new y6.m$d
            r9 = 0
            r2 = r14
            r3 = r18
            r4 = r0
            r5 = r15
            r6 = r19
            r7 = r17
            r8 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1.f23474a = r0
            r1.f23477d = r12
            java.lang.Object r1 = le.i.g(r13, r14, r1)
            if (r1 != r11) goto L69
            return r11
        L69:
            r1 = r0
        L6a:
            T r0 = r1.f712a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.m.j(android.content.Context, java.util.List, java.util.List, sc.j$d, qd.d):java.lang.Object");
    }

    public final void k(Object obj, j.d dVar) {
        if (dVar != null) {
            dVar.success(obj);
        }
        g(dVar);
    }

    public final void l(j.d dVar) {
        if (dVar != null) {
            dVar.error("already_active", "File dialog is already active", null);
        }
    }

    public final void m(String str, String str2, String str3, j.d dVar) {
        r.f(str, "errorCode");
        if (dVar != null) {
            dVar.error(str, str2, str3);
        }
        g(dVar);
    }

    public final String n(String str) {
        String strO0;
        return (str == null || (strO0 = w.O0(str, com.amazon.a.a.o.c.a.b.f7490a, "")) == null) ? "" : strO0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String o(android.net.Uri r7, android.app.Activity r8) {
        /*
            r6 = this;
            java.lang.String r0 = "uri"
            ae.r.f(r7, r0)
            java.lang.String r0 = "context"
            ae.r.f(r8, r0)
            java.lang.String r0 = r7.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = ae.r.b(r0, r1)
            if (r0 == 0) goto L1b
            java.lang.String r7 = r7.getLastPathSegment()
            goto L48
        L1b:
            android.content.ContentResolver r0 = r8.getContentResolver()
            java.lang.String r8 = "getContentResolver(...)"
            ae.r.e(r0, r8)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r7
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            r8 = 0
            if (r7 == 0) goto L41
            boolean r0 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L41
            java.lang.String r0 = "_display_name"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = r7.getString(r0)     // Catch: java.lang.Throwable -> L4d
            goto L42
        L41:
            r0 = r8
        L42:
            md.i0 r1 = md.i0.f15558a     // Catch: java.lang.Throwable -> L4d
            xd.b.a(r7, r8)
            r7 = r0
        L48:
            java.lang.String r7 = r6.f(r7)
            return r7
        L4d:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L4f
        L4f:
            r0 = move-exception
            xd.b.a(r7, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.m.o(android.net.Uri, android.app.Activity):java.lang.String");
    }

    public final int p() {
        return this.f23456b;
    }

    public final int q() {
        return this.f23455a;
    }

    public final int r() {
        return this.f23457c;
    }

    public final Uri s(String str) {
        r.f(str, "uri");
        Uri uri = Uri.parse(str);
        r.e(uri, "parse(...)");
        String scheme = uri.getScheme();
        if (scheme != null) {
            if (!(scheme.length() == 0) && !r.b(String.valueOf(str.charAt(0)), "/")) {
                return uri;
            }
        }
        Uri uriFromFile = Uri.fromFile(new File(str));
        r.c(uriFromFile);
        return uriFromFile;
    }

    public final boolean t() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 33 || (i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(y6.c r16, android.net.Uri r17, sc.j.d r18, android.content.Context r19, qd.d<? super java.lang.String> r20) {
        /*
            r15 = this;
            r0 = r20
            boolean r1 = r0 instanceof y6.m.e
            if (r1 == 0) goto L16
            r1 = r0
            y6.m$e r1 = (y6.m.e) r1
            int r2 = r1.f23502d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f23502d = r2
            r10 = r15
            goto L1c
        L16:
            y6.m$e r1 = new y6.m$e
            r10 = r15
            r1.<init>(r0)
        L1c:
            java.lang.Object r0 = r1.f23500b
            java.lang.Object r11 = rd.b.e()
            int r2 = r1.f23502d
            r12 = 1
            if (r2 == 0) goto L39
            if (r2 != r12) goto L31
            java.lang.Object r1 = r1.f23499a
            ae.h0 r1 = (ae.h0) r1
            md.u.b(r0)
            goto L6a
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            md.u.b(r0)
            ae.h0 r0 = new ae.h0
            r0.<init>()
            le.m2 r2 = le.d1.c()
            le.n0 r2 = le.o0.a(r2)
            qd.g r13 = r2.getCoroutineContext()
            y6.m$f r14 = new y6.m$f
            r9 = 0
            r2 = r14
            r3 = r16
            r4 = r0
            r5 = r15
            r6 = r18
            r7 = r17
            r8 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1.f23499a = r0
            r1.f23502d = r12
            java.lang.Object r1 = le.i.g(r13, r14, r1)
            if (r1 != r11) goto L69
            return r11
        L69:
            r1 = r0
        L6a:
            T r0 = r1.f712a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.m.v(y6.c, android.net.Uri, sc.j$d, android.content.Context, qd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(java.util.List<y6.c> r16, android.net.Uri r17, sc.j.d r18, android.content.Context r19, qd.d<? super java.util.List<java.lang.String>> r20) {
        /*
            r15 = this;
            r0 = r20
            boolean r1 = r0 instanceof y6.m.g
            if (r1 == 0) goto L16
            r1 = r0
            y6.m$g r1 = (y6.m.g) r1
            int r2 = r1.f23520d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f23520d = r2
            r10 = r15
            goto L1c
        L16:
            y6.m$g r1 = new y6.m$g
            r10 = r15
            r1.<init>(r0)
        L1c:
            java.lang.Object r0 = r1.f23518b
            java.lang.Object r11 = rd.b.e()
            int r2 = r1.f23520d
            r12 = 1
            if (r2 == 0) goto L39
            if (r2 != r12) goto L31
            java.lang.Object r1 = r1.f23517a
            java.util.List r1 = (java.util.List) r1
            md.u.b(r0)
            goto L6a
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            md.u.b(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            le.m2 r2 = le.d1.c()
            le.n0 r2 = le.o0.a(r2)
            qd.g r13 = r2.getCoroutineContext()
            y6.m$h r14 = new y6.m$h
            r9 = 0
            r2 = r14
            r3 = r19
            r4 = r17
            r5 = r16
            r6 = r0
            r7 = r15
            r8 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1.f23517a = r0
            r1.f23520d = r12
            java.lang.Object r1 = le.i.g(r13, r14, r1)
            if (r1 != r11) goto L69
            return r11
        L69:
            r1 = r0
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.m.w(java.util.List, android.net.Uri, sc.j$d, android.content.Context, qd.d):java.lang.Object");
    }

    public final boolean x(String str, String[] strArr) {
        r.f(str, "filePath");
        if (strArr != null) {
            if (!(strArr.length == 0)) {
                String strN = n(str);
                Iterator itA = ae.c.a(strArr);
                while (itA.hasNext()) {
                    if (v.t(strN, (String) itA.next(), true)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }
}
