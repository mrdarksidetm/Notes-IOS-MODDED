package c4;

import ae.r;
import ae.s;
import android.content.Context;
import he.j;
import java.io.File;
import java.util.List;
import le.n0;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class c implements de.a<Context, a4.f<d4.d>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<Context, List<a4.d<d4.d>>> f6380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n0 f6381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f6382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile a4.f<d4.d> f6383e;

    static final class a extends s implements zd.a<File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f6384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f6385b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, c cVar) {
            super(0);
            this.f6384a = context;
            this.f6385b = cVar;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context context = this.f6384a;
            r.e(context, "applicationContext");
            return b.a(context, this.f6385b.f6379a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(String str, b4.b<d4.d> bVar, l<? super Context, ? extends List<? extends a4.d<d4.d>>> lVar, n0 n0Var) {
        r.f(str, "name");
        r.f(lVar, "produceMigrations");
        r.f(n0Var, "scope");
        this.f6379a = str;
        this.f6380b = lVar;
        this.f6381c = n0Var;
        this.f6382d = new Object();
    }

    @Override // de.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a4.f<d4.d> a(Context context, j<?> jVar) {
        a4.f<d4.d> fVar;
        r.f(context, "thisRef");
        r.f(jVar, "property");
        a4.f<d4.d> fVar2 = this.f6383e;
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (this.f6382d) {
            if (this.f6383e == null) {
                Context applicationContext = context.getApplicationContext();
                d4.c cVar = d4.c.f9486a;
                l<Context, List<a4.d<d4.d>>> lVar = this.f6380b;
                r.e(applicationContext, "applicationContext");
                this.f6383e = cVar.a(null, lVar.invoke(applicationContext), this.f6381c, new a(applicationContext, this));
            }
            fVar = this.f6383e;
            r.c(fVar);
        }
        return fVar;
    }
}
