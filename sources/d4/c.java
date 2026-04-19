package d4;

import ae.r;
import ae.s;
import java.io.File;
import java.util.List;
import le.n0;
import xd.k;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f9486a = new c();

    static final class a extends s implements zd.a<File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.a<File> f9487a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(zd.a<? extends File> aVar) {
            super(0);
            this.f9487a = aVar;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File fileInvoke = this.f9487a.invoke();
            String strI = k.i(fileInvoke);
            h hVar = h.f9494a;
            if (r.b(strI, hVar.f())) {
                return fileInvoke;
            }
            throw new IllegalStateException(("File extension for file: " + fileInvoke + " does not match required extension for Preferences file: " + hVar.f()).toString());
        }
    }

    private c() {
    }

    public final a4.f<d> a(b4.b<d> bVar, List<? extends a4.d<d>> list, n0 n0Var, zd.a<? extends File> aVar) {
        r.f(list, "migrations");
        r.f(n0Var, "scope");
        r.f(aVar, "produceFile");
        return new b(a4.g.f436a.a(h.f9494a, bVar, list, n0Var, new a(aVar)));
    }
}
